// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.eventhubs;

import com.azure.core.util.ConfigurationBuilder;
import com.azure.messaging.eventhubs.EventHubClientBuilder;
import com.azure.spring.cloud.autoconfigure.AzureServiceConfigurationBase;
import com.azure.spring.cloud.autoconfigure.condition.ConditionalOnAnyProperty;
import com.azure.spring.cloud.autoconfigure.eventhubs.properties.AzureEventHubsProperties;
import com.azure.spring.cloud.autoconfigure.properties.AzureGlobalProperties;
import com.azure.spring.core.connectionstring.StaticConnectionStringProvider;
import com.azure.spring.core.service.AzureServiceType;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * An auto-configuration for Event Hub, which provides all kinds of Event Hub clients.
 *
 */
@ConditionalOnClass(EventHubClientBuilder.class)
@ConditionalOnProperty(value = "spring.cloud.azure.eventhubs.enabled", havingValue = "true", matchIfMissing = true)
@ConditionalOnAnyProperty(prefix = "spring.cloud.azure.eventhubs", name = { "connection-string", "namespace" })
@Import({
    AzureEventHubsClientBuilderConfiguration.class,
    AzureEventHubsConsumerClientConfiguration.class,
    AzureEventHubsProducerClientConfiguration.class,
    AzureBlobCheckpointStoreConfiguration.class,
    AzureEventHubsProcessorClientConfiguration.class
})
public class AzureEventHubsAutoConfiguration extends AzureServiceConfigurationBase {

    private ConfigurationBuilder configurationBuilder;
    public AzureEventHubsAutoConfiguration(AzureGlobalProperties azureGlobalProperties, ConfigurationBuilder configurationBuilder) {
        super(azureGlobalProperties, configurationBuilder.section("eventhubs").build());
    }

    @Bean
    @ConfigurationProperties(AzureEventHubsProperties.PREFIX)
    public AzureEventHubsProperties azureEventHubsProperties() {
        return loadProperties(this.azureGlobalProperties, new AzureEventHubsProperties());
    }

    @Bean
    @ConditionalOnProperty("spring.cloud.azure.eventhubs.connection-string")
    public StaticConnectionStringProvider<AzureServiceType.EventHubs> eventHubsStaticConnectionStringProvider(
        AzureEventHubsProperties eventHubsProperties) {
        return new StaticConnectionStringProvider<>(AzureServiceType.EVENT_HUBS,
            eventHubsProperties.getConnectionString());
    }

}
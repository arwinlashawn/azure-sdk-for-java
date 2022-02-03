// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.cosmos;

import com.azure.core.util.ConfigurationBuilder;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.spring.cloud.autoconfigure.AzureServiceConfigurationBase;
import com.azure.spring.cloud.autoconfigure.condition.ConditionalOnAnyProperty;
import com.azure.spring.cloud.autoconfigure.cosmos.properties.AzureCosmosProperties;
import com.azure.spring.cloud.autoconfigure.properties.AzureGlobalProperties;
import com.azure.spring.core.AzureSpringIdentifier;
import com.azure.spring.core.customizer.AzureServiceClientBuilderCustomizer;
import com.azure.spring.service.implementation.cosmos.CosmosClientBuilderFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Auto-configuration for a {@link CosmosClientBuilder} and cosmos clients.
 */
@ConditionalOnClass(CosmosClientBuilder.class)
@ConditionalOnProperty(value = "spring.cloud.azure.cosmos.enabled", havingValue = "true", matchIfMissing = true)
@ConditionalOnAnyProperty(prefix = "spring.cloud.azure.cosmos", name = "endpoint")
public class AzureCosmosAutoConfiguration extends AzureServiceConfigurationBase {

    public AzureCosmosAutoConfiguration(AzureGlobalProperties azureGlobalProperties, ConfigurationBuilder configurationBuilder) {
        super(azureGlobalProperties, configurationBuilder.section("cosmos").build());
    }

    @Bean
    @ConfigurationProperties(AzureCosmosProperties.PREFIX)
    public AzureCosmosProperties azureCosmosProperties() {
        return loadProperties(this.azureGlobalProperties, new AzureCosmosProperties());
    }

    @Bean
    @ConditionalOnMissingBean
    public CosmosClient azureCosmosClient(CosmosClientBuilder builder) {
        return builder.buildClient();
    }

    @Bean
    @ConditionalOnMissingBean
    // TODO (xiada): spring data cosmos also defines a CosmosAsyncClient
    public CosmosAsyncClient azureCosmosAsyncClient(CosmosClientBuilder builder) {
        return builder.buildAsyncClient();
    }

    @Bean
    @ConditionalOnMissingBean
    CosmosClientBuilder cosmosClientBuilder(CosmosClientBuilderFactory factory) {
        return factory.build(configuration);
    }

    @Bean
    @ConditionalOnMissingBean
    CosmosClientBuilderFactory cosmosClientBuilderFactory(AzureCosmosProperties properties,
        ObjectProvider<AzureServiceClientBuilderCustomizer<CosmosClientBuilder>> customizers) {
        CosmosClientBuilderFactory factory = new CosmosClientBuilderFactory(properties);
        factory.setSpringIdentifier(AzureSpringIdentifier.AZURE_SPRING_COSMOS);
        customizers.orderedStream().forEach(factory::addBuilderCustomizer);
        return factory;
    }

}
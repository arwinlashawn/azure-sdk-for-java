// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.factory;

import com.azure.spring.core.aware.authentication.ConnectionStringAware;
import com.azure.spring.core.connectionstring.StaticConnectionStringProvider;
import com.azure.spring.core.customizer.AzureServiceClientBuilderCustomizer;
import com.azure.spring.core.properties.AzureProperties;
import com.azure.spring.core.properties.AzureSdkProperties;
import com.azure.spring.core.properties.client.ClientProperties;
import com.azure.spring.core.properties.proxy.ProxyProperties;
import com.azure.spring.core.properties.retry.RetryProperties;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractAzureServiceClientBuilderFactoryTests {

    private static final com.azure.core.util.Configuration NOOP = new com.azure.core.util.Configuration();
    @Test
    void emptyPropertiesShouldWork() {
        TestClientBuilderFactory factory = new TestClientBuilderFactory(new TestAzureProperties());
        factory.build(NOOP);
    }

    @Test
    void connectionStringFromPropertiesShouldHavePriority() {
        TestAzureProperties testAzureProperties = new TestAzureProperties();
        testAzureProperties.setConnectionString("connection-string");

        TestClientBuilderFactory factory = new TestClientBuilderFactory(testAzureProperties);
        factory.setConnectionStringProvider(new StaticConnectionStringProvider<>("Test Service", "provider"));
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("connection-string", builder.getConnectionString());
    }

    @Test
    void connectionStringFromPropertyShouldBeConfigured() {
        TestAzureProperties testAzureProperties = new TestAzureProperties();
        testAzureProperties.setConnectionString("connection-string");

        TestClientBuilderFactory factory = new TestClientBuilderFactory(testAzureProperties);
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("connection-string", builder.getConnectionString());
    }

    @Test
    void connectionStringFromProviderShouldBeConfigured() {
        TestClientBuilderFactory factory = new TestClientBuilderFactory(new TestAzureProperties());
        factory.setConnectionStringProvider(new StaticConnectionStringProvider<>("Test Service", "provider"));
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("provider", builder.getConnectionString());
    }

    @Test
    void springIdentifierShouldBeConfigured() {
        TestClientBuilderFactory factory = new TestClientBuilderFactory(new TestAzureProperties());
        factory.setSpringIdentifier("identifier");
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("identifier", builder.getApplicationId());
    }

    @Test
    void applicationIdShouldBeConfigured() {
        TestAzureProperties testAzureProperties = new TestAzureProperties();
        testAzureProperties.getClient().setApplicationId("application-id");

        TestClientBuilderFactory factory = new TestClientBuilderFactory(testAzureProperties);
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("application-id", builder.getApplicationId());
    }

    @Test
    void applicationIdAndSpringIdentifierShouldBeConfigured() {
        TestAzureProperties testAzureProperties = new TestAzureProperties();
        testAzureProperties.getClient().setApplicationId("application-id");
        TestClientBuilderFactory factory = new TestClientBuilderFactory(testAzureProperties);
        factory.setSpringIdentifier("identifier");
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals("application-ididentifier", builder.getApplicationId());
    }

    @Test
    void customizerShouldEffect() {
        TestBuilderCustomizer customizer = new TestBuilderCustomizer();

        TestClientBuilderFactory factory = new TestClientBuilderFactory(new TestAzureProperties());
        factory.addBuilderCustomizer(customizer);
        TestClientBuilder builder = factory.build(NOOP);
        assertEquals(1, builder.getCustomizedTimes());

        TestClientBuilderFactory anotherFactory = new TestClientBuilderFactory(new TestAzureProperties());
        anotherFactory.addBuilderCustomizer(customizer);
        anotherFactory.addBuilderCustomizer(customizer);
        TestClientBuilder anotherBuilder = factory.build(NOOP);
        assertEquals(2, anotherBuilder.getCustomizedTimes());
    }

    static class TestBuilderCustomizer implements AzureServiceClientBuilderCustomizer<TestClientBuilder> {

        @Override
        public void customize(TestClientBuilder builder) {
            builder.setCustomizedTimes(builder.getCustomizedTimes() + 1);
        }
    }

    static class TestClientBuilderFactory extends AbstractAzureServiceClientBuilderFactory<TestClientBuilder> {

        final TestAzureProperties properties;
        final TestClientBuilder builder = new TestClientBuilder();

        TestClientBuilderFactory(TestAzureProperties properties) {
            this.properties = properties;
        }

        @Override
        protected TestClientBuilder createBuilderInstance() {
            return this.builder;
        }

        @Override
        protected AzureProperties getAzureProperties() {
            return this.properties;
        }

        @Override
        protected void configureProxy(TestClientBuilder builder) {

        }

        @Override
        protected void configureRetry(TestClientBuilder builder) {

        }

        @Override
        protected void configureService(TestClientBuilder builder) {

        }

        @Override
        protected BiConsumer<TestClientBuilder, String> consumeApplicationId() {
            return TestClientBuilder::setApplicationId;
        }
    }

    static class TestClientBuilder {

        private String connectionString;
        private String applicationId;
        private int customizedTimes = 0;

        public String getConnectionString() {
            return connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }

        public String getApplicationId() {
            return applicationId;
        }

        public void setApplicationId(String applicationId) {
            this.applicationId = applicationId;
        }

        public int getCustomizedTimes() {
            return customizedTimes;
        }

        public void setCustomizedTimes(int customizedTimes) {
            this.customizedTimes = customizedTimes;
        }
    }

    static class TestAzureProperties extends AzureSdkProperties implements ConnectionStringAware {
        private String connectionString;
        private final ClientProperties client = new ClientProperties();
        private final ProxyProperties proxy = new ProxyProperties();
        private final RetryProperties retry = new RetryProperties();

        @Override
        public ClientProperties getClient() {
            return this.client;
        }

        @Override
        public String getConnectionString() {
            return connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }

        @Override
        public ProxyProperties getProxy() {
            return proxy;
        }

        @Override
        public RetryProperties getRetry() {
            return retry;
        }
    }



}
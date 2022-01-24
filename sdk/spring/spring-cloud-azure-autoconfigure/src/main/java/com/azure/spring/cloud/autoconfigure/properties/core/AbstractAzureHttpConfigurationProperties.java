// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.properties.core;

import com.azure.spring.cloud.autoconfigure.properties.core.client.HttpClientConfigurationProperties;
import com.azure.spring.cloud.autoconfigure.properties.core.proxy.HttpProxyConfigurationProperties;
import com.azure.spring.cloud.autoconfigure.properties.core.retry.HttpRetryConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * Configuration properties base class for all HTTP-based Azure Service clients.
 */
public abstract class AbstractAzureHttpConfigurationProperties extends AbstractAzureServiceConfigurationProperties {

    @NestedConfigurationProperty
    protected final HttpClientConfigurationProperties client = new HttpClientConfigurationProperties();

    @NestedConfigurationProperty
    protected final HttpProxyConfigurationProperties proxy = new HttpProxyConfigurationProperties();

    @NestedConfigurationProperty
    protected final HttpRetryConfigurationProperties retry = new HttpRetryConfigurationProperties();

    @Override
    public HttpClientConfigurationProperties getClient() {
        return client;
    }

    @Override
    public HttpProxyConfigurationProperties getProxy() {
        return proxy;
    }

    @Override
    public HttpRetryConfigurationProperties getRetry() {
        return retry;
    }
}
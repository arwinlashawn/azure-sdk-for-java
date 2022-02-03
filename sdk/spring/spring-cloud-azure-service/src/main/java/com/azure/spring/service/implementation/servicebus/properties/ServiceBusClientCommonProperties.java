// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.service.implementation.servicebus.properties;

import com.azure.spring.core.aware.authentication.ConnectionStringAware;
import com.azure.spring.core.properties.AzureProperties;
import com.azure.spring.service.servicebus.properties.ServiceBusEntityType;

/**
 *
 */
public interface ServiceBusClientCommonProperties extends AzureProperties, ConnectionStringAware {

    String getFullyQualifiedNamespace();

    String getDomainName();

    String getNamespace();

    String getConnectionString();

    String getEntityName();

    ServiceBusEntityType getEntityType();

}
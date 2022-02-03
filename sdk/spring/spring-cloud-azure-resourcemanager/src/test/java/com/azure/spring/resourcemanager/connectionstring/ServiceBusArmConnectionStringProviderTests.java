// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.resourcemanager.connectionstring;

import com.azure.spring.core.service.AzureServiceType;

public class ServiceBusArmConnectionStringProviderTests extends AbstractArmConnectionStringProviderTests<AzureServiceType.ServiceBus> {

    @Override
    ArmConnectionStringProvider<AzureServiceType.ServiceBus> getArmConnectionStringProvider() {
        return new ServiceBusArmConnectionStringProvider(resourceManager, resourceMetadata, "test");
    }
}
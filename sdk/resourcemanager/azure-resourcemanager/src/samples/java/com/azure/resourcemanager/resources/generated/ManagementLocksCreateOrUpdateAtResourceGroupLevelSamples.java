// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluent.models.ManagementLockObjectInner;
import com.azure.resourcemanager.resources.models.LockLevel;

/** Samples for ManagementLocks CreateOrUpdateAtResourceGroupLevel. */
public final class ManagementLocksCreateOrUpdateAtResourceGroupLevelSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2016-09-01/examples/ManagementLocks_CreateOrUpdateAtResourceGroupLevel.json
     */
    /**
     * Sample code: Create management lock at resource group level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createManagementLockAtResourceGroupLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .createOrUpdateAtResourceGroupLevelWithResponse(
                "resourcegroupname",
                "testlock",
                new ManagementLockObjectInner().withLevel(LockLevel.READ_ONLY),
                Context.NONE);
    }
}
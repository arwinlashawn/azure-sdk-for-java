// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

import com.azure.core.util.Context;

/** Samples for ResourceProvider ListOrderAtSubscriptionLevel. */
public final class ResourceProviderListOrderAtSubscriptionLevelSamples {
    /*
     * x-ms-original-file: specification/edgeorder/resource-manager/Microsoft.EdgeOrder/stable/2021-12-01/examples/ListOrderAtSubscriptionLevel.json
     */
    /**
     * Sample code: ListOrderAtSubscriptionLevel.
     *
     * @param manager Entry point to EdgeOrderManager.
     */
    public static void listOrderAtSubscriptionLevel(com.azure.resourcemanager.edgeorder.EdgeOrderManager manager) {
        manager.resourceProviders().listOrderAtSubscriptionLevel(null, Context.NONE);
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for TopLevelDomains List. */
public final class TopLevelDomainsListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.DomainRegistration/stable/2021-03-01/examples/ListTopLevelDomains.json
     */
    /**
     * Sample code: List Top Level Domains.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listTopLevelDomains(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getTopLevelDomains().list(Context.NONE);
    }
}
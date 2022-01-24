// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.PurviewScanningClientBuilder;
import com.azure.analytics.purview.scanning.SystemScanRulesetsClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class SystemScanRulesetsListAll {
    public static void main(String[] args) {
        SystemScanRulesetsClient client =
                new PurviewScanningClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildSystemScanRulesetsClient();
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = client.listAll(requestOptions);
    }
}
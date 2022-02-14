// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.models.LogMetric;
import com.azure.resourcemanager.cdn.models.LogMetricsGranularity;
import com.azure.resourcemanager.cdn.models.LogMetricsGroupBy;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for LogAnalytics GetLogAnalyticsMetrics. */
public final class LogAnalyticsGetLogAnalyticsMetricsSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/LogAnalytics_GetLogAnalyticsMetrics.json
     */
    /**
     * Sample code: LogAnalytics_GetLogAnalyticsMetrics.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void logAnalyticsGetLogAnalyticsMetrics(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getLogAnalytics()
            .getLogAnalyticsMetricsWithResponse(
                "RG",
                "profile1",
                Arrays.asList(LogMetric.CLIENT_REQUEST_COUNT),
                OffsetDateTime.parse("2020-11-04T04:30:00.000Z"),
                OffsetDateTime.parse("2020-11-04T05:00:00.000Z"),
                LogMetricsGranularity.PT5M,
                Arrays.asList("customdomain1.azurecdn.net", "customdomain2.azurecdn.net"),
                Arrays.asList("https"),
                Arrays.asList(LogMetricsGroupBy.PROTOCOL),
                null,
                null,
                Context.NONE);
    }
}
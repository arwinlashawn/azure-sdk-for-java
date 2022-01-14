// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.Context;

/** Samples for StreamingJobs Delete. */
public final class StreamingJobsDeleteSamples {
    /*
     * x-ms-original-file: specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/StreamingJob_Delete.json
     */
    /**
     * Sample code: Delete a streaming job.
     *
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void deleteAStreamingJob(com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.streamingJobs().delete("sjrg6936", "sj59", Context.NONE);
    }
}
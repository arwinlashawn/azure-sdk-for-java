// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.resourcemanager.labservices.fluent.models.GetRegionalAvailabilityResponseInner;
import java.util.List;

/** An immutable client-side representation of GetRegionalAvailabilityResponse. */
public interface GetRegionalAvailabilityResponse {
    /**
     * Gets the regionalAvailability property: Availability information for different size categories per region.
     *
     * @return the regionalAvailability value.
     */
    List<RegionalAvailability> regionalAvailability();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.GetRegionalAvailabilityResponseInner object.
     *
     * @return the inner object.
     */
    GetRegionalAvailabilityResponseInner innerModel();
}
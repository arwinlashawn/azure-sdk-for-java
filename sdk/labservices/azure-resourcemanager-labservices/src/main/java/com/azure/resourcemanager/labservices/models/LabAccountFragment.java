// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents a lab account. */
@JsonFlatten
@Fluent
public class LabAccountFragment extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabAccountFragment.class);

    /*
     * Represents if region selection is enabled
     */
    @JsonProperty(value = "properties.enabledRegionSelection")
    private Boolean enabledRegionSelection;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the enabledRegionSelection property: Represents if region selection is enabled.
     *
     * @return the enabledRegionSelection value.
     */
    public Boolean enabledRegionSelection() {
        return this.enabledRegionSelection;
    }

    /**
     * Set the enabledRegionSelection property: Represents if region selection is enabled.
     *
     * @param enabledRegionSelection the enabledRegionSelection value to set.
     * @return the LabAccountFragment object itself.
     */
    public LabAccountFragment withEnabledRegionSelection(Boolean enabledRegionSelection) {
        this.enabledRegionSelection = enabledRegionSelection;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the LabAccountFragment object itself.
     */
    public LabAccountFragment withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set.
     * @return the LabAccountFragment object itself.
     */
    public LabAccountFragment withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabAccountFragment withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabAccountFragment withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
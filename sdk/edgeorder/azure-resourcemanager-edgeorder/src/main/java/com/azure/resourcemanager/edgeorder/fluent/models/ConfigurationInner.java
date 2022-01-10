// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.edgeorder.models.AvailabilityInformation;
import com.azure.resourcemanager.edgeorder.models.CostInformation;
import com.azure.resourcemanager.edgeorder.models.Description;
import com.azure.resourcemanager.edgeorder.models.Dimensions;
import com.azure.resourcemanager.edgeorder.models.FilterableProperty;
import com.azure.resourcemanager.edgeorder.models.HierarchyInformation;
import com.azure.resourcemanager.edgeorder.models.ImageInformation;
import com.azure.resourcemanager.edgeorder.models.Specification;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configuration object. */
@Immutable
public final class ConfigurationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationInner.class);

    /*
     * Properties of configuration
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of configuration.
     *
     * @return the innerProperties value.
     */
    private ConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the specifications property: Specifications of the configuration.
     *
     * @return the specifications value.
     */
    public List<Specification> specifications() {
        return this.innerProperties() == null ? null : this.innerProperties().specifications();
    }

    /**
     * Get the dimensions property: Dimensions of the configuration.
     *
     * @return the dimensions value.
     */
    public Dimensions dimensions() {
        return this.innerProperties() == null ? null : this.innerProperties().dimensions();
    }

    /**
     * Get the filterableProperties property: list of filters supported for a product.
     *
     * @return the filterableProperties value.
     */
    public List<FilterableProperty> filterableProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().filterableProperties();
    }

    /**
     * Get the displayName property: Display Name for the product system.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the description property: Description related to the product system.
     *
     * @return the description value.
     */
    public Description description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the imageInformation property: Image information for the product system.
     *
     * @return the imageInformation value.
     */
    public List<ImageInformation> imageInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().imageInformation();
    }

    /**
     * Get the costInformation property: Cost information for the product system.
     *
     * @return the costInformation value.
     */
    public CostInformation costInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().costInformation();
    }

    /**
     * Get the availabilityInformation property: Availability information of the product system.
     *
     * @return the availabilityInformation value.
     */
    public AvailabilityInformation availabilityInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityInformation();
    }

    /**
     * Get the hierarchyInformation property: Hierarchy information of a product.
     *
     * @return the hierarchyInformation value.
     */
    public HierarchyInformation hierarchyInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().hierarchyInformation();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
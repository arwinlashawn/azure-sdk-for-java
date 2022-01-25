// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.UebaDataSources;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Ueba property bag. */
@Fluent
public final class UebaProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UebaProperties.class);

    /*
     * The relevant data sources that enriched by ueba
     */
    @JsonProperty(value = "dataSources")
    private List<UebaDataSources> dataSources;

    /**
     * Get the dataSources property: The relevant data sources that enriched by ueba.
     *
     * @return the dataSources value.
     */
    public List<UebaDataSources> dataSources() {
        return this.dataSources;
    }

    /**
     * Set the dataSources property: The relevant data sources that enriched by ueba.
     *
     * @param dataSources the dataSources value to set.
     * @return the UebaProperties object itself.
     */
    public UebaProperties withDataSources(List<UebaDataSources> dataSources) {
        this.dataSources = dataSources;
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
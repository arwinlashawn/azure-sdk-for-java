// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed Environment resource SKU properties. */
@Fluent
public final class EnvironmentSkuProperties {
    /*
     * Name of the Sku.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /** Creates an instance of EnvironmentSkuProperties class. */
    public EnvironmentSkuProperties() {
    }

    /**
     * Get the name property: Name of the Sku.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Sku.
     *
     * @param name the name value to set.
     * @return the EnvironmentSkuProperties object itself.
     */
    public EnvironmentSkuProperties withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model EnvironmentSkuProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentSkuProperties.class);
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.ActionPropertiesBase;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Action property bag. */
@Fluent
public final class ActionRequestProperties extends ActionPropertiesBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionRequestProperties.class);

    /*
     * Logic App Callback URL for this specific workflow.
     */
    @JsonProperty(value = "triggerUri", required = true)
    private String triggerUri;

    /**
     * Get the triggerUri property: Logic App Callback URL for this specific workflow.
     *
     * @return the triggerUri value.
     */
    public String triggerUri() {
        return this.triggerUri;
    }

    /**
     * Set the triggerUri property: Logic App Callback URL for this specific workflow.
     *
     * @param triggerUri the triggerUri value to set.
     * @return the ActionRequestProperties object itself.
     */
    public ActionRequestProperties withTriggerUri(String triggerUri) {
        this.triggerUri = triggerUri;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ActionRequestProperties withLogicAppResourceId(String logicAppResourceId) {
        super.withLogicAppResourceId(logicAppResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (triggerUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property triggerUri in model ActionRequestProperties"));
        }
    }
}
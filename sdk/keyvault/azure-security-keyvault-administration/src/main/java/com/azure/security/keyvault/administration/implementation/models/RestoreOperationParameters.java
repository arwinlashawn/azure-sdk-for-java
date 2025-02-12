// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RestoreOperationParameters model. */
@Fluent
public final class RestoreOperationParameters {
    /*
     * The sasTokenParameters property.
     */
    @JsonProperty(value = "sasTokenParameters", required = true)
    private SASTokenParameter sasTokenParameters;

    /*
     * The Folder name of the blob where the previous successful full backup was stored
     */
    @JsonProperty(value = "folderToRestore", required = true)
    private String folderToRestore;

    /** Creates an instance of RestoreOperationParameters class. */
    public RestoreOperationParameters() {}

    /**
     * Get the sasTokenParameters property: The sasTokenParameters property.
     *
     * @return the sasTokenParameters value.
     */
    public SASTokenParameter getSasTokenParameters() {
        return this.sasTokenParameters;
    }

    /**
     * Set the sasTokenParameters property: The sasTokenParameters property.
     *
     * @param sasTokenParameters the sasTokenParameters value to set.
     * @return the RestoreOperationParameters object itself.
     */
    public RestoreOperationParameters setSasTokenParameters(SASTokenParameter sasTokenParameters) {
        this.sasTokenParameters = sasTokenParameters;
        return this;
    }

    /**
     * Get the folderToRestore property: The Folder name of the blob where the previous successful full backup was
     * stored.
     *
     * @return the folderToRestore value.
     */
    public String getFolderToRestore() {
        return this.folderToRestore;
    }

    /**
     * Set the folderToRestore property: The Folder name of the blob where the previous successful full backup was
     * stored.
     *
     * @param folderToRestore the folderToRestore value to set.
     * @return the RestoreOperationParameters object itself.
     */
    public RestoreOperationParameters setFolderToRestore(String folderToRestore) {
        this.folderToRestore = folderToRestore;
        return this;
    }
}

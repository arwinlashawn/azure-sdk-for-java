// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a log file. */
@Fluent
public final class LogFileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogFileProperties.class);

    /*
     * Size of the log file.
     */
    @JsonProperty(value = "sizeInKB")
    private Long sizeInKB;

    /*
     * Creation timestamp of the log file.
     */
    @JsonProperty(value = "createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Last modified timestamp of the log file.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * Type of the log file.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The url to download the log file from.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the sizeInKB property: Size of the log file.
     *
     * @return the sizeInKB value.
     */
    public Long sizeInKB() {
        return this.sizeInKB;
    }

    /**
     * Set the sizeInKB property: Size of the log file.
     *
     * @param sizeInKB the sizeInKB value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withSizeInKB(Long sizeInKB) {
        this.sizeInKB = sizeInKB;
        return this;
    }

    /**
     * Get the createdTime property: Creation timestamp of the log file.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the lastModifiedTime property: Last modified timestamp of the log file.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the type property: Type of the log file.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the log file.
     *
     * @param type the type value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the url property: The url to download the log file from.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The url to download the log file from.
     *
     * @param url the url value to set.
     * @return the LogFileProperties object itself.
     */
    public LogFileProperties withUrl(String url) {
        this.url = url;
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
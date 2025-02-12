// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Open Data Protocol (OData) resource dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ODataResource")
@JsonFlatten
@Fluent
public class ODataResourceDataset extends Dataset {
    /*
     * The OData resource path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.path")
    private Object path;

    /**
     * Get the path property: The OData resource path. Type: string (or Expression with resultType string).
     *
     * @return the path value.
     */
    public Object getPath() {
        return this.path;
    }

    /**
     * Set the path property: The OData resource path. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set.
     * @return the ODataResourceDataset object itself.
     */
    public ODataResourceDataset setPath(Object path) {
        this.path = path;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ODataResourceDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}

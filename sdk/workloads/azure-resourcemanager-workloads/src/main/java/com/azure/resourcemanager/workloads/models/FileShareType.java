// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FileShareType. */
public final class FileShareType extends ExpandableStringEnum<FileShareType> {
    /** Static value NfsOnController for FileShareType. */
    public static final FileShareType NFS_ON_CONTROLLER = fromString("NfsOnController");

    /** Static value AzureFiles for FileShareType. */
    public static final FileShareType AZURE_FILES = fromString("AzureFiles");

    /**
     * Creates or finds a FileShareType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileShareType.
     */
    @JsonCreator
    public static FileShareType fromString(String name) {
        return fromString(name, FileShareType.class);
    }

    /**
     * Gets known FileShareType values.
     *
     * @return known FileShareType values.
     */
    public static Collection<FileShareType> values() {
        return values(FileShareType.class);
    }
}

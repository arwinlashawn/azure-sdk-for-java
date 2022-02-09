// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.oep {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.oep;
    exports com.azure.resourcemanager.oep.fluent;
    exports com.azure.resourcemanager.oep.fluent.models;
    exports com.azure.resourcemanager.oep.models;

    opens com.azure.resourcemanager.oep.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.oep.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
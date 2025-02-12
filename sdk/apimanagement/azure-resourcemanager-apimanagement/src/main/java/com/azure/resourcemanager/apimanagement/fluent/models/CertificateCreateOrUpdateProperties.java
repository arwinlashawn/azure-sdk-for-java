// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.KeyVaultContractCreateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the CreateOrUpdate certificate operation. */
@Fluent
public final class CertificateCreateOrUpdateProperties {
    /*
     * Base 64 encoded certificate using the application/x-pkcs12
     * representation.
     */
    @JsonProperty(value = "data")
    private String data;

    /*
     * Password for the Certificate
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * KeyVault location details of the certificate.
     */
    @JsonProperty(value = "keyVault")
    private KeyVaultContractCreateProperties keyVault;

    /**
     * Get the data property: Base 64 encoded certificate using the application/x-pkcs12 representation.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Base 64 encoded certificate using the application/x-pkcs12 representation.
     *
     * @param data the data value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the password property: Password for the Certificate.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password for the Certificate.
     *
     * @param password the password value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the keyVault property: KeyVault location details of the certificate.
     *
     * @return the keyVault value.
     */
    public KeyVaultContractCreateProperties keyVault() {
        return this.keyVault;
    }

    /**
     * Set the keyVault property: KeyVault location details of the certificate.
     *
     * @param keyVault the keyVault value to set.
     * @return the CertificateCreateOrUpdateProperties object itself.
     */
    public CertificateCreateOrUpdateProperties withKeyVault(KeyVaultContractCreateProperties keyVault) {
        this.keyVault = keyVault;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVault() != null) {
            keyVault().validate();
        }
    }
}

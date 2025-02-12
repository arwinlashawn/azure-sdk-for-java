// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Notification Parameter contract. */
@Fluent
public final class RecipientsContractProperties {
    /*
     * List of Emails subscribed for the notification.
     */
    @JsonProperty(value = "emails")
    private List<String> emails;

    /*
     * List of Users subscribed for the notification.
     */
    @JsonProperty(value = "users")
    private List<String> users;

    /**
     * Get the emails property: List of Emails subscribed for the notification.
     *
     * @return the emails value.
     */
    public List<String> emails() {
        return this.emails;
    }

    /**
     * Set the emails property: List of Emails subscribed for the notification.
     *
     * @param emails the emails value to set.
     * @return the RecipientsContractProperties object itself.
     */
    public RecipientsContractProperties withEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the users property: List of Users subscribed for the notification.
     *
     * @return the users value.
     */
    public List<String> users() {
        return this.users;
    }

    /**
     * Set the users property: List of Users subscribed for the notification.
     *
     * @param users the users value to set.
     * @return the RecipientsContractProperties object itself.
     */
    public RecipientsContractProperties withUsers(List<String> users) {
        this.users = users;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.edgeorder.models.AddressDetails;
import com.azure.resourcemanager.edgeorder.models.OrderItemDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents order item contract. */
@Fluent
public final class OrderItemResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrderItemResourceInner.class);

    /*
     * Order item properties
     */
    @JsonProperty(value = "properties", required = true)
    private OrderItemProperties innerProperties = new OrderItemProperties();

    /*
     * Represents resource creation and update time
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Order item properties.
     *
     * @return the innerProperties value.
     */
    private OrderItemProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Represents resource creation and update time.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public OrderItemResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrderItemResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the orderItemDetails property: Represents order item details.
     *
     * @return the orderItemDetails value.
     */
    public OrderItemDetails orderItemDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().orderItemDetails();
    }

    /**
     * Set the orderItemDetails property: Represents order item details.
     *
     * @param orderItemDetails the orderItemDetails value to set.
     * @return the OrderItemResourceInner object itself.
     */
    public OrderItemResourceInner withOrderItemDetails(OrderItemDetails orderItemDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderItemProperties();
        }
        this.innerProperties().withOrderItemDetails(orderItemDetails);
        return this;
    }

    /**
     * Get the addressDetails property: Represents shipping and return address for order item.
     *
     * @return the addressDetails value.
     */
    public AddressDetails addressDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().addressDetails();
    }

    /**
     * Set the addressDetails property: Represents shipping and return address for order item.
     *
     * @param addressDetails the addressDetails value to set.
     * @return the OrderItemResourceInner object itself.
     */
    public OrderItemResourceInner withAddressDetails(AddressDetails addressDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderItemProperties();
        }
        this.innerProperties().withAddressDetails(addressDetails);
        return this;
    }

    /**
     * Get the startTime property: Start time of order item.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Get the orderId property: Id of the order to which order item belongs to.
     *
     * @return the orderId value.
     */
    public String orderId() {
        return this.innerProperties() == null ? null : this.innerProperties().orderId();
    }

    /**
     * Set the orderId property: Id of the order to which order item belongs to.
     *
     * @param orderId the orderId value to set.
     * @return the OrderItemResourceInner object itself.
     */
    public OrderItemResourceInner withOrderId(String orderId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OrderItemProperties();
        }
        this.innerProperties().withOrderId(orderId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model OrderItemResourceInner"));
        } else {
            innerProperties().validate();
        }
    }
}
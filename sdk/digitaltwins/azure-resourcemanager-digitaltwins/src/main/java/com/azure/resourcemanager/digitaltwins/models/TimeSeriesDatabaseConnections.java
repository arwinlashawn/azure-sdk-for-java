// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TimeSeriesDatabaseConnections. */
public interface TimeSeriesDatabaseConnections {
    /**
     * Get all existing time series database connections for this DigitalTwins instance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all existing time series database connections for this DigitalTwins instance as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<TimeSeriesDatabaseConnection> list(String resourceGroupName, String resourceName);

    /**
     * Get all existing time series database connections for this DigitalTwins instance.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all existing time series database connections for this DigitalTwins instance as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<TimeSeriesDatabaseConnection> list(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection.
     */
    TimeSeriesDatabaseConnection get(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection along with {@link Response}.
     */
    Response<TimeSeriesDatabaseConnection> getWithResponse(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName, Context context);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    TimeSeriesDatabaseConnection delete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName);

    /**
     * Delete a time series database connection.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param timeSeriesDatabaseConnectionName Name of time series database connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    TimeSeriesDatabaseConnection delete(
        String resourceGroupName, String resourceName, String timeSeriesDatabaseConnectionName, Context context);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection along with {@link Response}.
     */
    TimeSeriesDatabaseConnection getById(String id);

    /**
     * Get the description of an existing time series database connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the description of an existing time series database connection along with {@link Response}.
     */
    Response<TimeSeriesDatabaseConnection> getByIdWithResponse(String id, Context context);

    /**
     * Delete a time series database connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    TimeSeriesDatabaseConnection deleteById(String id);

    /**
     * Delete a time series database connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a time series database connection resource.
     */
    TimeSeriesDatabaseConnection deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TimeSeriesDatabaseConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new TimeSeriesDatabaseConnection definition.
     */
    TimeSeriesDatabaseConnection.DefinitionStages.Blank define(String name);
}
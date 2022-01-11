// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.fluent.models.ScopeMapInner;
import com.azure.resourcemanager.containerregistry.models.ScopeMapUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ScopeMapsClient. */
public interface ScopeMapsClient {
    /**
     * Gets the properties of the specified scope map.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified scope map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ScopeMapInner>> getWithResponseAsync(
        String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Gets the properties of the specified scope map.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified scope map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScopeMapInner> getAsync(String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Gets the properties of the specified scope map.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified scope map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeMapInner get(String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Gets the properties of the specified scope map.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified scope map.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScopeMapInner> getWithResponse(
        String resourceGroupName, String registryName, String scopeMapName, Context context);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String registryName, String scopeMapName, ScopeMapInner scopeMapCreateParameters);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ScopeMapInner>, ScopeMapInner> beginCreateAsync(
        String resourceGroupName, String registryName, String scopeMapName, ScopeMapInner scopeMapCreateParameters);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScopeMapInner>, ScopeMapInner> beginCreate(
        String resourceGroupName, String registryName, String scopeMapName, ScopeMapInner scopeMapCreateParameters);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScopeMapInner>, ScopeMapInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapInner scopeMapCreateParameters,
        Context context);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScopeMapInner> createAsync(
        String resourceGroupName, String registryName, String scopeMapName, ScopeMapInner scopeMapCreateParameters);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeMapInner create(
        String resourceGroupName, String registryName, String scopeMapName, ScopeMapInner scopeMapCreateParameters);

    /**
     * Creates a scope map for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapCreateParameters The parameters for creating a scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeMapInner create(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapInner scopeMapCreateParameters,
        Context context);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String scopeMapName, Context context);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String scopeMapName);

    /**
     * Deletes a scope map from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String scopeMapName, Context context);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ScopeMapInner>, ScopeMapInner> beginUpdateAsync(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScopeMapInner>, ScopeMapInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScopeMapInner>, ScopeMapInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters,
        Context context);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ScopeMapInner> updateAsync(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeMapInner update(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters);

    /**
     * Updates a scope map with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param scopeMapName The name of the scope map.
     * @param scopeMapUpdateParameters The parameters for updating a scope map.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a scope map for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScopeMapInner update(
        String resourceGroupName,
        String registryName,
        String scopeMapName,
        ScopeMapUpdateParameters scopeMapUpdateParameters,
        Context context);

    /**
     * Lists all the scope maps for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list scope maps for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ScopeMapInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all the scope maps for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list scope maps for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScopeMapInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the scope maps for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list scope maps for a container registry.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScopeMapInner> list(String resourceGroupName, String registryName, Context context);
}
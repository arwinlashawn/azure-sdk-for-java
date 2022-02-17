// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;

/** An instance of this class provides access to all the operations defined in ValidateOperationStatusesClient. */
public interface ValidateOperationStatusesClient {
    /**
     * Fetches the status of a triggered validate operation. The status can be in progress, completed or failed. You can
     * refer to the OperationStatus enum for all the possible states of the operation. If operation has completed, this
     * method returns the list of errors obtained while validating the operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID represents the operation whose status needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationStatusInner get(String vaultName, String resourceGroupName, String operationId);

    /**
     * Fetches the status of a triggered validate operation. The status can be in progress, completed or failed. You can
     * refer to the OperationStatus enum for all the possible states of the operation. If operation has completed, this
     * method returns the list of errors obtained while validating the operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param operationId OperationID represents the operation whose status needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation status along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationStatusInner> getWithResponse(
        String vaultName, String resourceGroupName, String operationId, Context context);
}
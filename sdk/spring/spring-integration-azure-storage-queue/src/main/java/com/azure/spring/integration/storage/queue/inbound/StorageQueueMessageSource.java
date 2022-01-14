// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.storage.queue.inbound;

import com.azure.spring.storage.queue.core.StorageQueueOperation;
import org.springframework.integration.endpoint.AbstractMessageSource;
import org.springframework.messaging.Message;
import org.springframework.util.Assert;

/**
 * Inbound Message Source to receive messages from Azure Storage Queue.
 *
 * @author Miao Cao
 */
public class StorageQueueMessageSource extends AbstractMessageSource<Message<?>> {

    private final StorageQueueOperation storageQueueOperation;
    private final String destination;

    /**
     * Construct a {@link StorageQueueMessageSource} with the specified destination and {@link StorageQueueOperation}.
     *
     * @param destination the destination
     * @param storageQueueOperation the storage queue operation
     */
    public StorageQueueMessageSource(String destination, StorageQueueOperation storageQueueOperation) {
        Assert.hasText(destination, "destination can't be null or empty");
        this.storageQueueOperation = storageQueueOperation;
        this.destination = destination;
    }

    @Override
    public Object doReceive() {
        return storageQueueOperation.receiveAsync(destination).block();
    }

    @Override
    public String getComponentType() {
        return "storage-queue:message-source";
    }
}
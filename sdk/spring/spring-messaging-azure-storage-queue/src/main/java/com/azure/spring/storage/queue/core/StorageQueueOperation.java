// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.storage.queue.core;

import com.azure.spring.messaging.core.ReceiveOperation;
import com.azure.spring.messaging.core.SendOperation;

import java.time.Duration;

/**
 * Azure storage queue operation to support send and receive
 * {@link org.springframework.messaging.Message} asynchronously
 * <p>
 * You should checkpoint if message has been processed successfully, otherwise it will be visible again after certain
 * time specified by {@link #setVisibilityTimeout(Duration)}.
 *
 */
public interface StorageQueueOperation extends SendOperation, ReceiveOperation {

    /**
     * Set visibility timeout. Default is 30
     *
     * @param visibilityTimeoutDuration visibility timeout
     */
    void setVisibilityTimeout(Duration visibilityTimeoutDuration);
}
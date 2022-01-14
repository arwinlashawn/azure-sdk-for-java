// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.fluent.models.DeploymentInner;
import com.azure.resourcemanager.resources.models.DeploymentMode;
import com.azure.resourcemanager.resources.models.DeploymentProperties;
import com.azure.resourcemanager.resources.models.OnErrorDeployment;
import com.azure.resourcemanager.resources.models.OnErrorDeploymentType;
import com.azure.resourcemanager.resources.models.TemplateLink;
import java.io.IOException;

/** Samples for Deployments CreateOrUpdate. */
public final class DeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/PutDeploymentResourceGroup.json
     */
    /**
     * Sample code: Create a deployment that will deploy a template with a uri and queryString.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADeploymentThatWillDeployATemplateWithAUriAndQueryString(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getDeployments()
            .createOrUpdate(
                "my-resource-group",
                "my-deployment",
                new DeploymentInner()
                    .withProperties(
                        new DeploymentProperties()
                            .withTemplateLink(
                                new TemplateLink()
                                    .withUri("https://example.com/exampleTemplate.json")
                                    .withQueryString(
                                        "sv=2019-02-02&st=2019-04-29T22%3A18%3A26Z&se=2019-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=xxxxxxxx0xxxxxxxxxxxxx%2bxxxxxxxxxxxxxxxxxxxx%3d"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.INCREMENTAL)),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/PutDeploymentResourceGroupTemplateSpecsWithId.json
     */
    /**
     * Sample code: Create a deployment that will deploy a templateSpec with the given resourceId.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADeploymentThatWillDeployATemplateSpecWithTheGivenResourceId(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getDeployments()
            .createOrUpdate(
                "my-resource-group",
                "my-deployment",
                new DeploymentInner()
                    .withProperties(
                        new DeploymentProperties()
                            .withTemplateLink(
                                new TemplateLink()
                                    .withId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000001/resourceGroups/my-resource-group/providers/Microsoft.Resources/TemplateSpecs/TemplateSpec-Name/versions/v1"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.INCREMENTAL)),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/PutDeploymentWithOnErrorDeploymentSpecificDeployment.json
     */
    /**
     * Sample code: Create a deployment that will redeploy another deployment on failure.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADeploymentThatWillRedeployAnotherDeploymentOnFailure(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getDeployments()
            .createOrUpdate(
                "my-resource-group",
                "my-deployment",
                new DeploymentInner()
                    .withProperties(
                        new DeploymentProperties()
                            .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.COMPLETE)
                            .withOnErrorDeployment(
                                new OnErrorDeployment()
                                    .withType(OnErrorDeploymentType.SPECIFIC_DEPLOYMENT)
                                    .withDeploymentName("name-of-deployment-to-use"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/PutDeploymentWithOnErrorDeploymentLastSuccessful.json
     */
    /**
     * Sample code: Create a deployment that will redeploy the last successful deployment on failure.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADeploymentThatWillRedeployTheLastSuccessfulDeploymentOnFailure(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getDeployments()
            .createOrUpdate(
                "my-resource-group",
                "my-deployment",
                new DeploymentInner()
                    .withProperties(
                        new DeploymentProperties()
                            .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.COMPLETE)
                            .withOnErrorDeployment(
                                new OnErrorDeployment().withType(OnErrorDeploymentType.LAST_SUCCESSFUL))),
                Context.NONE);
    }
}
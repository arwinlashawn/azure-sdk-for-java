// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.util;

import com.azure.core.util.TestConfigurationSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.azure.core.util.Configuration.PROPERTY_AZURE_TRACING_DISABLED;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests the configuration API.
 */
public class EnvironmentConfigurationTests {
    private static final String MY_CONFIGURATION = "myConfigurationABC123";
    private static final String EXPECTED_VALUE = "aConfigurationValueAbc123";
    private static final String UNEXPECTED_VALUE = "notMyConfigurationValueDef456";
    private static final String DEFAULT_VALUE = "theDefaultValueGhi789";

    /**
     * Verifies that a runtime parameter is able to be retrieved.
     */
    @Test
    public void runtimeConfigurationFound() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource(MY_CONFIGURATION, EXPECTED_VALUE));
        assertEquals(EXPECTED_VALUE, configuration.get(MY_CONFIGURATION));
    }

    /**
     * Verifies that null is returned when a configuration isn't found.
     */
    @Test
    public void configurationNotFound() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource());
        assertNull(configuration.get(MY_CONFIGURATION));
    }

    /**
     * Verifies that a found configuration value is preferred over the default value.
     */
    @Test
    public void foundConfigurationPreferredOverDefault() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource(MY_CONFIGURATION, EXPECTED_VALUE));

        assertEquals(EXPECTED_VALUE, configuration.get(MY_CONFIGURATION, DEFAULT_VALUE));
    }

    /**
     * Verifies that when a configuration value isn't found the default will be returned.
     */
    @Test
    public void fallbackToDefaultConfiguration() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource());

        assertEquals(DEFAULT_VALUE, configuration.get(MY_CONFIGURATION, DEFAULT_VALUE));
    }

    /**
     * Verifies that a found configuration value is able to be mapped.
     */
    @Test
    public void foundConfigurationIsConverted() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource(MY_CONFIGURATION, EXPECTED_VALUE));

        assertEquals(EXPECTED_VALUE.toUpperCase(), configuration.get(MY_CONFIGURATION, String::toUpperCase));
    }

    /**
     * Verifies that when a configuration isn't found the converter returns null.
     */
    @Test
    public void notFoundConfigurationIsConvertedToNull() {
        assertNull(new EnvironmentConfiguration(new TestConfigurationSource()).get(MY_CONFIGURATION, String::toUpperCase));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void cloneConfiguration() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource(
            "variable1", "value1",
            "variable2", "value2"));

        EnvironmentConfiguration configurationClone = configuration.clone();

        // Verify that the clone has the expected values.
        assertEquals(configuration.get("variable1"), configurationClone.get("variable1"));
        assertEquals(configuration.get("variable2"), configurationClone.get("variable2"));

        // The clone should be a separate instance, verify its modifications won't affect the original copy.
        configurationClone.remove("variable2");
        assertTrue(configuration.contains("variable2"));
    }

    @Test
    public void loadValueTwice() {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource());
        String tracingDisabled = configuration.get(PROPERTY_AZURE_TRACING_DISABLED);
        String tracingDisabled2 = configuration.get(PROPERTY_AZURE_TRACING_DISABLED);

        assertEquals(tracingDisabled, tracingDisabled2);
    }

    @ParameterizedTest
    @MethodSource("getOrDefaultSupplier")
    public void getOrDefault(String configurationValue, Object defaultValue, Object expectedValue) {
        EnvironmentConfiguration configuration = new EnvironmentConfiguration(new TestConfigurationSource("getOrDefault", configurationValue));
        assertEquals(expectedValue, configuration.get("getOrDefault", defaultValue));
    }

    private static Stream<Arguments> getOrDefaultSupplier() {
        return Stream.of(
            Arguments.of(String.valueOf((byte) 42), (byte) 12, (byte) 42),
            Arguments.of(String.valueOf((short) 42), (short) 12, (short) 42),
            Arguments.of(String.valueOf(42), 12, 42),
            Arguments.of(String.valueOf(42L), 12L, 42L),
            Arguments.of(String.valueOf(42F), 12F, 42F),
            Arguments.of(String.valueOf(42D), 12D, 42D),
            Arguments.of(String.valueOf(true), false, true),
            Arguments.of("42", "12", "42")
        );
    }

    @Test
    public void getOrDefaultReturnsDefault() {
        assertEquals("42",new EnvironmentConfiguration(new TestConfigurationSource()).get("empty", "42"));
    }
}
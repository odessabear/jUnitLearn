package com.odebar.jUnit5Structure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FirstParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "789"})
    void testLength_Greater_Then_Zero(String arg) {
        assertTrue(arg.length() > 0);
    }
}

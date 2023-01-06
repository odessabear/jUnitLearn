package com.odebar.jUnit5Structure;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondParameterizedTest {

    @ParameterizedTest
    @CsvSource(value = {"QWERTY,qwerty", "12345,12345"})
    void testToLowerCase(String arg, String lowered) {
        assertEquals(lowered, arg.toLowerCase());
    }

    @Disabled
    @ParameterizedTest(name = "The string is {0} with length {1}")
    @CsvSource({"QWERTY,6", "12345,5"})
    void testStringLength(String arg, int length) {
        assertEquals(length, arg.length());
    }
}

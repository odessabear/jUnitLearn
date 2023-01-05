package com.odebar.jUnit5Structure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SecondParameterizedTest {

    @ParameterizedTest
    @CsvSource(value = {"QWERTY,qwerty", "12345,12345"})
    void testToLowerCase(String arg, String lowered) {
        assertEquals(lowered, arg.toLowerCase());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "")
    void testToLowerCaseInFile(String arg, String lowered) {
        assertEquals(lowered, arg.toLowerCase());
    }
}

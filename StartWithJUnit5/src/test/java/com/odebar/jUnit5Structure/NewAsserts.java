package com.odebar.jUnit5Structure;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class NewAsserts {

    @Test
    void test() {
        List<String> actual = Arrays.asList("one", "two", "three");
        List<String> expected = new ArrayList<>(actual);
        assertIterableEquals(expected, actual);
    }

    @Test
    void testAssertingAll() {
        assertAll(
                () -> MatcherAssert.assertThat("www.google.com", endsWith("com")),
                () -> MatcherAssert.assertThat("12345", isA(String.class)),
                () -> MatcherAssert.assertThat("They differ!", "10", is("10"))
        );

        //deprecated
//        assertAll(
//                () -> assertThat("www.google.com", endsWith("com")),
//                () -> assertThat("12345", isA(String.class)),
//                () -> assertThat("They differ!", "10", is("10"))
//        );
    }

    @Test
    void testLinesMatch() {
        List<String> actualLines = Arrays.asList("Happy New Year 2023!".split(" "));
        assertLinesMatch(Arrays.asList("Happy", "New", "Year", "2023!"), actualLines);
    }
}

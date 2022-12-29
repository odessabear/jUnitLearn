package com.odebar.jUnitLearn;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class StringUtilsParameterizedTest {

    private final Boolean boo;
    private final String arg;

    public StringUtilsParameterizedTest(Boolean boo, String arg) {
        this.boo = boo;
        this.arg = arg;
    }

    @Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {Boolean.FALSE, "1234"},
                {Boolean.TRUE, "1212"},
                {Boolean.FALSE, "1"},
                {Boolean.TRUE, "12"},
        });
    }

    // "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual() {
        StringUtils su = new StringUtils();
        assertEquals(boo, su.are2CharsAtHeadAndTailEqual(arg));
    }

}
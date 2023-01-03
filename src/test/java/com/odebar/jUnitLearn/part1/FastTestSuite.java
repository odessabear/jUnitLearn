package com.odebar.jUnitLearn.part1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringUtilsParameterizedTest.class, StringUtilsTest.class})
public class FastTestSuite {
}

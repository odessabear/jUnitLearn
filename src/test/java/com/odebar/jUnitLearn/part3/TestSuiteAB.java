package com.odebar.jUnitLearn.part3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;;

@RunWith(value = Suite.class)
@SuiteClasses(value = { TestCaseA.class, TestCaseB.class })
public class TestSuiteAB {
}
package com.odebar.jUnit5Structure;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class TestSequence {

    @BeforeAll
    static void initAll(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
        //System.out.println("before all tests");
    }

    @AfterAll
    static void destroyAll(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
        //System.out.println("after all tests");
    }

    @Test
    void test1(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
        //System.out.println("in test()");
    }

    @Test
    void hello(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
        //System.out.println("in test()");
    }

    @Test
    void hiThere(TestInfo info) {
        System.out.println("in " + info.getDisplayName());
        //System.out.println("in test()");
    }

    @Test
    @DisplayName("When string is null, throw an NPE")
    void testException() {
        String str = null;
        assertThrows(
                NullPointerException.class,
                () -> str.length()
        );
    }

  //  @Test
    @RepeatedTest(5)
    void testRepeated() {
        System.out.println("in testRepeated()");
    }
}

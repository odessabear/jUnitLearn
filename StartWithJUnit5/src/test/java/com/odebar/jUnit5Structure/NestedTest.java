package com.odebar.jUnit5Structure;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Outer tests")
public class NestedTest {

    @BeforeAll
    static void initAllOuter() {
        System.out.println("--- before all in Outer ---");
    }

    @BeforeEach
    void initEachOuter() {
        System.out.println("\tbefore each in Outer---");
    }

    @AfterAll
    static void destroyAllOuter() {
        System.out.println("--- after all in Outer ---");
    }

    @AfterEach
    void destroyEachOuter() {
        System.out.println("\tafter each in Outer---");
    }

    @Test
    void testOuter1() {
        System.out.println("\t--- in testOuter1()");
    }

    @Test
    void testOuter2() {
        System.out.println("\t--- in testOuter2()");
    }

    @Nested
    @DisplayName("Nested Arraylist tests")
    class ArrayListRelatedTests {
        List<String> list;

        @BeforeEach
        void init() {
            System.out.println("\t\tbefore each on NestedArrayListClass");
            list = Arrays.asList("one", "two", "three");
        }

        @AfterEach
        void destroy() {
            System.out.println("\t\tafter each on NestedArrayListClass\"");
        }

        @Test
        void testForNull() {
            System.out.println("\t\t---in testForNull()");
            assertNotNull(list);
        }

        @Test
        void testListSize() {
            System.out.println("\t\t---in testListSize()");
            assertEquals(3, list.size());
        }
    }

    @Nested
    @DisplayName("Nested TreeSet tests")
    class ArraySetRelatedTests {
        Set<String> set;

        @BeforeEach
        void init() {
            System.out.println("\t\tbefore each on NestedSetClass");
            set = new TreeSet<>(Arrays.asList("one", "two", "two"));
        }

        @AfterEach
        void destroy() {
            System.out.println("\t\tafter each on NestedSetClass");
        }

        @Test
        void testSetForNull() {
            System.out.println("\t\t---in testSetForNull()");
            assertNotNull(set);
        }

        @Test
        void testSetSize() {
            System.out.println("\t\t---in testSetSize()");
            assertEquals(2, set.size());
        }
    }
}

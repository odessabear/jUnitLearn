package com.odebar.jUnitLearn.part1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    // "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
    StringUtils su = new StringUtils();

    @Test
    public void testChopOff2SpacesAtHead_Both() {
        assertEquals("**", su.chopOff2SpacesAtHead("  **"));
    }

    @Test
    public void testChopOff2SpacesAtHead_Single() {
        assertEquals("**", su.chopOff2SpacesAtHead(" **"));
    }

    @Test
    public void testChopOff2SpacesAtHead_None() {
        assertEquals("****", su.chopOff2SpacesAtHead("****"));
    }

    @Test
    public void testChopOff2SpacesAtHead_BothAtRight() {
        assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
    }

    //	 "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllDiffFalse() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllSameFalse() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyTwo() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
    }

//	@Test
//	public void testBubbleSort() {
//		int[] arr = {4, 12, -17, 3};
//		int[] expected = {-17, 3, 4, 12};
//		learn.Test.bubbleSort(arr);
//		assertArrayEquals(expected, arr);
//
//	}

//	static User kolya = new User("Kolya", 24);
//
//	@BeforeClass
//	public static void setUpBeforeClass() {
//		System.out.println("in setUpBeforeClass()");
//		kolya.setAge(25);
//	}
//
//	@Before
//	public void setUp() {
//		System.out.println("in setUp()");
////		kolya.setAge(25);
//	}
//
//	@Test
//	public void test1() {
//		System.out.println("in test1()");
//		System.out.println(kolya.getAge());
//	}
//
//	@Test
//	public void test2() {
//		System.out.println("in test2()");
//		System.out.println(kolya.getAge());
//	}
//
//	@After
//	public void tearDown() {
////		kolya.setAge(24);
//		System.out.println("in tearDown()");
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() {
//		kolya.setAge(24);
//		System.out.println("in tearDownAfterClass()");
//	}

//	@Test(expected=NullPointerException.class)
//	public void testBubbleSort_2() {
//		int[] arr = null;
//		int[] expected = {-17, 3, 4, 12};
//		learn.Test.bubbleSort(arr);
//		assertArrayEquals(expected, arr);
//	}

}
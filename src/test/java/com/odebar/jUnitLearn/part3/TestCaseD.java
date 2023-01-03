package com.odebar.jUnitLearn.part3;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestCaseD {
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("\n--- TestCase D ---");
	}
	@Test
	@Ignore
	public void testD1() {
		System.out.println("running TestCaseD1");
	}
	@Test
	public void testD2() {
		System.out.println("running TestCaseD2");
	}
	@Test
	public void testD3() {
		System.out.println("running TestCaseD3");
	}
}
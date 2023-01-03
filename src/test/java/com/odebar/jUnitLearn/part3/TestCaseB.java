package com.odebar.jUnitLearn.part3;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestCaseB {
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("\n--- TestCase B ---");
	}
	@Test
	public void testB1() {
		System.out.println("running TestCaseB1");
	}
	@Test
	@Ignore
	public void testB2() {
		System.out.println("running TestCaseB2");
	}
	@Test
	public void testB3() {
		System.out.println("running TestCaseB3");
	}

}
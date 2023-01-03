package com.odebar.jUnitLearn.part3;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestCaseC {
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("\n--- TestCase C ---");
	}
	@Test
	public void testC1() {
		System.out.println("running TestCaseC1");
	}
	@Test
	@Ignore
	public void testC2() {
		System.out.println("running TestCaseC2");
	}
	@Test
	@Ignore
	public void testC3() {
		System.out.println("running TestCaseC3");
	}
	@Test
	public void testC4() {
		System.out.println("running TestCaseC4");
	}
}
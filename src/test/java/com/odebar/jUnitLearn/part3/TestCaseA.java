package com.odebar.jUnitLearn.part3;
import org.junit.Test;
import org.junit.BeforeClass;

public class TestCaseA {
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("\n--- TestCase A ---");
	}
	@Test
	public void testA1() {
		System.out.println("running TestCaseA1");
	}
	@Test
	public void testA2() {
		System.out.println("running TestCaseA2");
	}
	@Test
	public void testA3() {
		System.out.println("running TestCaseA3");
	}
}
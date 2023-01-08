package intermediate.lecture_03_CodeCoverage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import intermediate.lecture_03_CodeCoverage.StringUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtilsTest {

	StringUtils su = new StringUtils();
	
	// "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
	@Test
	public void testChopOff2SpacesAtHead_BothLeft(){
		assertEquals("**", su.chopOff2SpacesAtHead("  **"));
	}
	@Test
	public void testChopOff2SpacesAtHead_OneLeft() {
		assertEquals("**", su.chopOff2SpacesAtHead(" **"));
	}
	@Test
	public void testChopOff2SpacesAtHead_None() {
		assertEquals("****", su.chopOff2SpacesAtHead("****"));
	}
	@Test
	public void testChopOff2SpacesAtHead_TwoRight() {
		assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
	}
	@Test
	public void testChopOff2SpacesAtHead_JustTwo() {
		assertEquals("**", su.chopOff2SpacesAtHead("**"));
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
	
	
}

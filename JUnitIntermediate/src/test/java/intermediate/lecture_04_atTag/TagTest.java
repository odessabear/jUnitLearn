package intermediate.lecture_04_atTag;

import org.junit.jupiter.api.*;

class TagTest {

	@Test
	@DisplayName("CaseA: prod & dev")
	@Tag("production")
	@Tag("development")
	void testCaseA(TestInfo testInfo) {}

	@Test
	@DisplayName("CaseB: dev")
	@Tag("development")
	void testCaseB(TestInfo testInfo) {}

	@Test
	@DisplayName("CaseC: prod")
	@Tag("production")
	void testCaseC(TestInfo testInfo) {}

}

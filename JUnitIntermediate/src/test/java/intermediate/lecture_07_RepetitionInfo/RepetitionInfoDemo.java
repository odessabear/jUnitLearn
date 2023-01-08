package intermediate.lecture_07_RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

class RepetitionInfoDemo {

	@RepeatedTest(3)
	void testWithRepetitionInfo(RepetitionInfo repetitionInfo, TestReporter testReporter) {
		testReporter.publishEntry("Repetition #" + repetitionInfo.getCurrentRepetition());
		assertEquals(3, repetitionInfo.getTotalRepetitions());
	}

}

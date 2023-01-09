package intermediate.lecture_03_CodeCoverage;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BranchCoverageTest {

	@ParameterizedTest
	@CsvSource({"1,2,3","1,1,1","2,1,0"})
	void testSumAllNumbers(String start, String end, String sum) {
		int expected = Integer.parseInt(sum);
		int actual = BranchCoverage.sumAllNumbers(Integer.parseInt(start), Integer.parseInt(end));
		assertEquals(expected, actual);
	}

}

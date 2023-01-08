package intermediate.lecture_02_Assumptions;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest1 {

	@Test
	public void testIfVersionGreaterThan4() {
		String versionNumber = "3";  // get it from configuration on runtime
		Assume.assumeTrue(Integer.parseInt(versionNumber) >= 4);
		System.out.println("Test executed");
	}

}

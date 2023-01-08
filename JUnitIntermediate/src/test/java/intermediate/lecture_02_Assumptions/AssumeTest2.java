package intermediate.lecture_02_Assumptions;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class AssumeTest2 {

	@Before
	public void setUp() {
		String versionNumber = "5";  // get it from configuration on runtime
		Assume.assumeTrue(Integer.parseInt(versionNumber) >= 4);
		
	}
	
	@Test
	public void testOneThing() {
		System.out.println("Now we can test a thing...");
	}
	@Test
	public void testAnotherThing() {
		System.out.println("... or two...");
	}

}

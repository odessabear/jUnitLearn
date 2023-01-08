package intermediate.lecture_11_BlackBoxWhiteBox;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BlackBoxTest {

	@ParameterizedTest
	@ValueSource (  ints = {-10,10,0,1024} )
	void testPrintNumBytes( int ints ) {
		BlackBox.printNumBytes(  ints  );
	}

}

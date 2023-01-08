package intermediate.lecture_11_BlackBoxWhiteBox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class WhiteBoxTest {

	@ParameterizedTest
	@ValueSource( ints = {-1,1} )
	void testFuncOdd( int ints ) {
		assertEquals(ints, WhiteBox.func(ints));
	}
	@ParameterizedTest
	@ValueSource( ints = {-12,2,0} )
	void testFuncEven( int ints ) {
		assertEquals(ints/2, WhiteBox.func(ints));
	}

}

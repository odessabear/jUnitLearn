package intermediate.lecture_08_UserExtensions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@DisplayName("Testing PersonValidator")
class PersonValidatorTest {

	@Nested
	@DisplayName("When using valid data")
	@ExtendWith(ValidPersonParameterResolver.class)
	public class ValidData{
		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
	}
	
	@Nested
	@DisplayName("When using invalid data")
	@ExtendWith(InvalidPersonParameterResolver.class)
	public class InvalidData{
		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
	}
	
	
}

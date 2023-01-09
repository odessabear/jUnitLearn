package intermediate.lecture_10_atEnumSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class EnumSourceDemo {

    @DisplayName("Passing enum values to the test method")
    @ParameterizedTest(name = "{index} => pet = ''{0}''")
//	@EnumSource(Pet.class)
    @EnumSource(value = Pet.class, names = {"CAT", "DOG"})
    void testEnumValuesForNonNullity(Pet pet) {
        assertNotNull(pet);
    }
}
// @ValueSource, @CsvSource and @CsvFileSource

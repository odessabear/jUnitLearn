package intermediate.lecture_05_ParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import intermediate.lecture_05_ParameterResolver.Thing;
import intermediate.lecture_05_ParameterResolver.ThingParameterResolver;

@ExtendWith(ThingParameterResolver.class)
class ThingTest {

    @Test
    void testAnswer(Thing thing) {
        assertEquals(42, thing.answer());
    }

}

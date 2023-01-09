package intermediate.lecture_06_TestReporter;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

class TestReporterDemo {

    @Test
    void testKeyValuePair(TestReporter testReporter) {
        testReporter.publishEntry("my key", "my value");
    }

    @Test
    void testMultipleKeyValuePairs(TestReporter testReporter) {
        Map<String, String> values = new HashMap<>();
        values.put("name", "Kolya");
        values.put("handle", "Pikachu");
        testReporter.publishEntry(values);
    }

}

package intermediate.lecture_09_DynamicTests;

/* Source:
	code: https://github.com/eugenp/tutorials/tree/master/testing-modules/junit-5
	tutorial: https://www.baeldung.com/junit5-dynamic-tests

MIT License
Copyright (c) 2017 Eugen Paraschiv

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

public class DynamicTestsDemo {

/********************************************************************************************** 
 * Part 1.
 * Simplest examples: Collection, Iterable, Iterator, and Stream
 **********************************************************************************************
 */ 	
    @TestFactory
    Collection<DynamicTest> dynamicTestsWithCollection() {
        return Arrays.asList(
        	DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
        	DynamicTest.dynamicTest("Multiply Test", () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsWithIterable() {
        return Arrays.asList(
        	DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
        	DynamicTest.dynamicTest("Multiply Test", () -> assertEquals(4, Math.multiplyExact(2, 2))));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsWithIterator() {
        return Arrays.asList(
        	DynamicTest.dynamicTest("Add test", () -> assertEquals(2, Math.addExact(1, 1))),
        	DynamicTest.dynamicTest("Multiply Test", () -> assertEquals(4, Math.multiplyExact(2, 2))))
            .iterator();
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {
        return IntStream.iterate(0, n -> n + 2)
            .limit(10)
            .mapToObj(n -> DynamicTest.dynamicTest("test" + n, () -> assertTrue(n % 2 == 0)));
    }

/********************************************************************************************** 
 * Part 2.
 * An example of how to generate an assembled Stream of DynamicTests
 **********************************************************************************************
 */    
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        // sample input and output
        List<String> inputList = Arrays.asList(
        		"www.somedomain.com", "www.anotherdomain.com", "www.yetanotherdomain.com");
        List<String> outputList = Arrays.asList("154.174.10.56", "211.152.104.132", "178.144.120.156");

        // input generator that generates inputs using inputList
        Iterator<String> inputGenerator = inputList.iterator();

        // a display name generator that creates a different name based on the input
        Function<String, String> displayNameGenerator = (input) -> "Resolving: " + input;

        // the test executor, which actually has the logic of how to execute the test case
        DomainNameResolver resolver = new DomainNameResolver();
        ThrowingConsumer<String> testExecutor = (input) -> {
            int id = inputList.indexOf(input);
            assertEquals(outputList.get(id), resolver.resolveDomain(input));
        };

        // combine everything and return a Stream of DynamicTest
        return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor);
    }

/********************************************************************************************** 
 * Part 3.
 * How to improve Part 2 with Java 8 features: The inputList.stream().map() provides the stream
 * of inputs (input generator). The first argument to dynamicTest() is our display name generator
 * while the second argument, a lambda, is our test executor.
 **********************************************************************************************
 */ 
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {

        DomainNameResolver resolver = new DomainNameResolver();
        List<String> inputList = Arrays.asList(
        		"www.somedomain.com", "www.anotherdomain.com", "www.yetanotherdomain.com");
        List<String> outputList = Arrays.asList("154.174.10.56", "211.152.104.132", "178.144.120.156");

        return inputList.stream()
            .map(dom -> DynamicTest.dynamicTest("Resolving: " + dom, () -> {
                int id = inputList.indexOf(dom);
                assertEquals(outputList.get(id), resolver.resolveDomain(dom));
            }));
    }

/********************************************************************************************** 
 * Part 4.
 * An example of how to filter inputs based on test cases. The EmployeeDao#save(Long) method
 * needs only the employeeId. Hence, it utilizes all the Employee instances.
 * On the other hand, the save(Long, String) method needs firstName, as well. Hence, it filters
 * out the Employee instances that have no firstName.
 **********************************************************************************************
 */ 
    @TestFactory
    Stream<DynamicTest> dynamicTestsForEmployeeWorkflows() {
        List<Employee> inputList = Arrays.asList(
        		new Employee(1, "Fred"),
        		new Employee(2),
        		new Employee(3, "John"));
        EmployeeDao dao = new EmployeeDao();
        Stream<DynamicTest> saveEmployeeStream = inputList.stream()
            .map(emp -> DynamicTest.dynamicTest("saveEmployee: " + emp.toString(), () -> {
                Employee returned = dao.save(emp.getId());
                assertEquals(returned.getId(), emp.getId());
            }));

        Stream<DynamicTest> saveEmployeeWithFirstNameStream = inputList.stream()
            .filter(emp -> !emp.getFirstName()
            	.isEmpty())
            .map(emp -> DynamicTest.dynamicTest("saveEmployeeWithName" + emp.toString(), () -> {
                Employee returned = dao.save(emp.getId(), emp.getFirstName());
                assertEquals(returned.getId(), emp.getId());
                assertEquals(returned.getFirstName(), emp.getFirstName());
            }));
        return Stream.concat(saveEmployeeStream, saveEmployeeWithFirstNameStream);
    }
}
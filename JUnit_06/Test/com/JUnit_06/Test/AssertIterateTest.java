package com.JUnit_06.Test;
import com.JUnit_06.*;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.api.Test;

/* IN JUnit Testing, every time we write a test method by using the @Test annotation
the class will automatically instantiate itself. it means the many tests we are 
writing in the class, that many objects are creating behind the scenes. it is not 
necessary, we can run all tests using one instance of the class. which can be
achieved by using the "TestInstance" Annotation*/

import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // It will instance class once and run all tests
public class AssertIterateTest {
	AssertIterate ai = new AssertIterate();
	List<Integer> sortedlst = Arrays.asList(2,4,5,8,9);
	@Test
	void assertIterate() {
		assertIterableEquals(sortedlst,ai.IterateList());
	}
}

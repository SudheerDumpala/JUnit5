package com.JUnit_07.Test;
import com.JUnit_07.AssertTimeout;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Disabled;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/* we can able to print out custom test method and class names instead of the real ones.
 * we can do this by using the special annotation "@DisplayName".
 * by using this, 1) we can give the names to the methods or classes with spaces
 * 2) with using the special characters and also we can use the emoji's.
 * */
@DisplayName("Asssert Timeout Test class (spaces)")
public class AssertTimeoutTest {
	AssertTimeout at = new AssertTimeout();
	@Test
	@DisplayName("@assert Timeout Test method (@)")
	public void assertTimeoutTest() {
		int[] unsorted = {5,7,6,9,1,3};
		assertTimeout(Duration.ofMillis(10),()->at.assertTimeout(unsorted)); // In milli seconds
	// This test will pass if the iterator i in AssertTimeout iterates 1 million times in 10 ms
	// or it will fail. similarly we can also give ofMinutes(),ofHours(),ofDays() .. etc in this.
	}
	
	// we can also able to disable a test case by using "Disabled" annotation
	@Disabled("This test is disabled until #45 issue gets solved") // message is optional
	@Test
	// we can also skip all tests in a class by writing this annotation above the class declaration
	public void randomTest() {
		assertEquals(9,4+5);
	}
}

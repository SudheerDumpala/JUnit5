package com.Junit_03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaTest {
	Areas area = new Areas();
	@Test
	void squareAreaTest() {
		assertEquals(area.square(4),16);
	}
	@Test
	void circleAreaTest() {
		assertEquals(area.circle(5),78.5,()-> "didn't get expected output");
	}
	/* Here we give the custom message to be display in case of the Test failure
	by using the supplier interface, ()->.
	ofcourse, we can also pass the direct string message without the supplier interface but the 
	difference is, in supplier interface, the message gets evaluate only if the test case is fail.
	but in the custom message, in evaluates even when success but not display.it displays test fails. */
	@Test
	void circleAreaTest1() {
		assertNotEquals(area.circle(5),78.5,()-> "didn't get expected output");
		// assertNotEquals is completely opposite to the assertEquals method. This test case will fail 
		// because the answer is correct.
	}
	@Test
	void test() {
		String str = "sudheer";
		assertTrue(str.equals("SUDHEER")); // fails
		// This returns true or false. if test is true, then success , else fails.
	}
	
/* Refer to the plugins in the pom.xml file in the target. in that we included
 *  the maven-surefire-plugin , which helps to run the Maven project tests 
 *  by selecting  package(JUnit-03)- run as - Maven project(7). 
 *  this helps us not use the in-built test runners in the IDE and use our own plugin */
}

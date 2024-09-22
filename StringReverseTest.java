package com.Junit5_02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringReverseTest {
	StringReverse sr = new StringReverse();
	
	@Test
	// we need to declare the "test" annotation, because we are telling the
	// compiler that from this point the test begins.
	void singleWord_testcase() {
		assertEquals("neevarp",sr.stringReversing("praveen")); // success
	}
	@Test
	void multipleWord_testcase() { //fail cause of "neeevarp"	
		assertEquals("alapmud neeevarp",sr.stringReversing("praveen dumpala"));
	}

}

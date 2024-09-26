package com.Junit_5.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.JUnit_05.AssertArray;

public class AssertArrayTest {
	@Test
	void assertArrayTest() {
		try {
			int[] unsortedArray = {9,4,7,5,6,2}; //null;
			AssertArray arr = new AssertArray();
			int[] sortedArray = arr.arraySort(unsortedArray);
			
			assertArrayEquals(unsortedArray,sortedArray);
			
			//fail(); //we are failing the Test explicitly if the arrayEquals is satisfied.
			
			// we can also do this by using the assertThrows. 
			
			assertThrows(NullPointerException.class,()->arr.arraySort(unsortedArray));
			//asseretThrows invokes only in case of any exception throws. it means it will pass if exception
			//occurs or fails if no exception occurs.
			
			// we here are used the lambda expression to invoke the method.
		}
		catch(Exception e) {
			System.out.println("Oops..! Error Occured.. "+e);
		}
	}
}
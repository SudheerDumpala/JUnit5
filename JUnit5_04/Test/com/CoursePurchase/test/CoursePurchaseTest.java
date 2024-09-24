package com.CoursePurchase.test;

import static org.junit.jupiter.api.Assertions.*;

import com.courses.purchase.*;
import com.purchase.service.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoursePurchaseTest {
	CoursePurchase cp = new CoursePurchase();
	// some useful Annotations 
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("@BeforeAll annotation excecutes the respective method before starting the all test (only once)");
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("@BeforeEach annotation excecutes the respective method before starting every test");
	}
	@AfterEach
	void afterEach() {
		System.out.println("@AfterEach annotation excecutes the respective method after ending every test");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("@AfterAll annotation excecutes the respective method after ending the all test (only once)");
	}
		
	// Tests 
		
	@Test
	void javaCoursePurchase() { // This will fail because itisassertFalse and the return statement is true
		assertFalse(cp.implementCoursePurchase(new JavaCourse()));
	}
	@Test
	void junitCoursePurchase() {
		assertTrue(cp.implementCoursePurchase(new JunitCourse()));
	}
	@Test
	void springbootCoursePurchase() {
		assertTrue(cp.implementCoursePurchase(new SpringbootCourse()));
	}
	

}

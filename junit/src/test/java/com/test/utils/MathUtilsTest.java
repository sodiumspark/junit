package com.test.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathutils;;

	

	@BeforeAll
	static void beforeAll() {
		System.out.println("@beforeAll");
	}

	@BeforeEach
	void initialize() {
		mathutils = new MathUtils();
		System.out.println("@BeforeEach");
	}


	@AfterEach
	void endEach() {
		System.out.println("@AfterEach");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("@AfterAll");
	}


	@Test
	void addTest() {

		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected, actual,"addTest");
	}


	@Test
	void multiplyTest() {


		int expected = 6;
		int actual = mathutils.multiply(2, 3);
		assertEquals(expected, actual,"multiplyTest");
	}

	@Test
	void divTest() {

		//assertThrows(ArithmeticException.class, () -> mathutils.divide(1,0), "Divide By Zero");
		assertThrows(NullPointerException.class, () -> mathutils.divide(1,0), "Divide By Zero");
	}

}

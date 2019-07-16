package com.test.utils;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	MathUtils mathutils;;



	@BeforeAll
	static void beforeAll() {
		System.out.println("@beforeAll");
	}
	
	TestReporter tReporter;
	TestInfo tInfo;

	@BeforeEach
	void initialize(TestReporter tr, TestInfo tinfo) {
		mathutils = new MathUtils();
		
		this.tReporter = tr;
		this.tInfo = tinfo;
		tr.publishEntry(tinfo.getDisplayName());
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



	@Nested
	class addTest {


		@Test
		void addPostives(){

			assertEquals(3, mathutils.add(1,2));
		}

		@Test
		void addNegatives(){
			assertEquals(-13, mathutils.add(-11,-2));
		}




	}

	@Test
	@DisplayName("Addition Test")
	void addTest() {

		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected, actual,"addTest");
	}


	@Test
	@DisplayName("Multiplocation Test")
	@Tag("Math")
	void multiplyTest() {

		boolean isRemoteSrverUp = true;
		assumeTrue(isRemoteSrverUp);
		assertAll(
				() -> assertEquals(-15, mathutils.multiply(2, 3)),
				() -> assertEquals(10, mathutils.multiply(2, 5)),
				() -> assertEquals(-6, mathutils.multiply(2, -3))
				);
		

	}

	@Test
	@Tag("Math1")
	@DisplayName("Division Exception Test")
	void divTest() {

		//assertThrows(NullPointerException.class, () -> mathutils.divide(1,0), "Divide By Zero");
		assertThrows(ArithmeticException.class, () -> mathutils.divide(1,0), "Divide By Zero");
	}

	@Test
	@Disabled
	@DisplayName("For Test Driven Development")
	void disbaledTest() {
		System.out.println("Dsiabled Test");
	}

	@Test
	@RepeatedTest(3)
	@DisplayName("Repeated Test Produ  ct")
	void productTest() {

		assertEquals(5, mathutils.add(2, 3));
		//System.out.println("Repeated Test " + infoObj.getCurrentRepetition());
	}



	//21 assertall
	//22 nested
	//repearirion
	//supplier
	//tags


	@Test
	@EnabledOnOs(OS.MAC)
	@DisplayName("OS Condition test")
	void osTest() {
		System.out.println("On Windows");
	}
}

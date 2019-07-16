package com.test.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathutils = new MathUtils();
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


		int expected = 5;
		int actual = mathutils.divide(10, 2);
		assertEquals(expected, actual,"v");
	}

}

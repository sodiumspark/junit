package com.test.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
	
		MathUtils mathutils = new MathUtils();
		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected, actual);
	}

}

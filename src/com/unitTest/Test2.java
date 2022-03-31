package com.unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test2 {

	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "test";
		String str5 = "test";
		assertEquals(str1, str2);

		int val1 = 5;
		int val2 = 6;

		assertTrue(val1 < val2);

		assertFalse(val1 > val2);

		assertNotNull(str1);

		assertNull(str3);

		assertSame(str4, str5);

		assertNotSame(str1, str3);

	}
}

package com.calculator;


import org.junit.Test;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
	
	@Test
	public void testAdd() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(stringCalculator.Add("100,12,2"), 114);
	}

}

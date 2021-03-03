package com.calculator;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
	
	private StringCalculator stringCalculator;
	
	@Before
	public void setUp() {
		stringCalculator = new StringCalculator();
	}
	
	@After
    public void tearDown() {
		stringCalculator = null;
	}
	
	
	@Test
	public void testAdd() {
		assertEquals(stringCalculator.Add(""), 0);
	}
	
	@Test
	public void testAddNewLineHandle() {
		assertEquals(stringCalculator.AddNewLineHandle("1,3\n4"), 8);
	}

}

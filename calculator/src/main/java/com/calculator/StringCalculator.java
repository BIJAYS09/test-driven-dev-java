package com.calculator;

import org.junit.Before;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	
	
	public int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		int sum = 0;
		String[] str = parseString(numbers);
		for(int i=0; i<str.length; i++) {
			sum += Integer.valueOf(str[i]);
		}	
		return sum;
	}

	
	private String[] parseString(String str) {
		return str.split(",|\n");
	}
	
	public int AddNewLineHandle(String numbers) {
		int sum =0;
		String[] str = parseString(numbers);
		for(int i=0; i<str.length; i++) {
			sum += Integer.valueOf(str[i]);
		}	
		return sum;
	}
   
}

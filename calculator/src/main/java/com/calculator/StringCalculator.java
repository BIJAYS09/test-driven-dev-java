package com.calculator;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
	
	public int Add(String numbers) {
		int sum = 0;
		try {
			String[] str = parseString(numbers);
			for(int i=0; i<str.length; i++) {
				sum += Integer.valueOf(str[i]);
			}
		}catch (Exception e) {
			return sum;
		}
		return sum;
	}
	
	private String[] parseString(String str) {
		return str.split(",");
	}
   
}

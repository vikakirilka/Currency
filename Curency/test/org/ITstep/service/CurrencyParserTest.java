package org.ITstep.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrencyParserTest {

	@Test
	void testGetFinalText() {
		
	}

	@Test
	public void testConvertToMoneyIntPositive() {
		int testInt = 123456;
		CurrencyParser parser= new CurrencyParser();
		String outText = parser.convertToMoney(testInt);
		assertEquals("1234,56", outText);
		
	}
	@Test
	public void testConvertToMoneyIntNegative() {
		int testInt = -123456;
		CurrencyParser parser= new CurrencyParser();
		String outText = parser.convertToMoney(testInt);
		assertEquals("1234,56", outText);
		
	}

	@Test
	void testGetObjectsFromText() {
		
	}

	@Test
	void testGetIntegerFromCourse() {
		
	}

}

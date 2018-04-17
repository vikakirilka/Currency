package org.ITstep.service;

import java.util.ArrayList;

import org.ITstep.pojo.Currency;

public class CurrencyParser {
	public String getFinalText(ArrayList<Currency> currencies) {
		String finalText = "";
		/*for(int i=0;i<currencies.size();i++) {
			Currency tempCurrency=currencies.get(i);
		}*/
		for (Currency currency : currencies) {
			
			finalText+=currency.getName() + ": " + convertToMoney(currency.getCourse()) + " grn.\n";
			
		}
		
		return finalText;
	}

	public String convertToMoney(int course) {
		return course/100 + "," + course%100;
	}
	
	public ArrayList<Currency> getObjectsFromText(String text){
		ArrayList<Currency> currencies=new ArrayList<Currency>();
		String[] rows=text.split("\n");
		for (String row : rows) {
			String[] rowParts = row.split(":");
			
			Currency currency=new Currency();
			currency.setName(rowParts[0]);
			currency.setCourse(getIntegerFromCourse(rowParts[1]));
			
			currencies.add(currency);
		}
		
		return currencies;
	}

	public int getIntegerFromCourse(String course) {
		char[] symbols=course.toCharArray();
		String numberAsString = "";
		for (char symbol : symbols) {
			if(Character.isDigit(symbol)) {
				numberAsString = numberAsString+ Character.getNumericValue(symbol);
			}
			
		}
		return Integer.valueOf(numberAsString);
	}

}

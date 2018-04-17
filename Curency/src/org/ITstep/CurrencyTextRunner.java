package org.ITstep;

import java.util.ArrayList;

import org.ITstep.pojo.Currency;
import org.ITstep.service.CurrencyParser;


public class CurrencyTextRunner {

	public static void main(String[] args) {
		Currency usd=new Currency("USD", 2638);
		Currency eur=new Currency("EUR", 3110);
		Currency rub=new Currency("RUB", 41);
		
		ArrayList<Currency> currencies=new ArrayList<Currency>();
		currencies.add(usd);
		currencies.add(eur);
		currencies.add(rub);
		
		CurrencyParser parser=new CurrencyParser();
		String finalText=parser.getFinalText(currencies);
		System.out.println(finalText);
		
		ArrayList<Currency> curList=parser.getObjectsFromText(finalText);
		System.out.println(curList.get(1).getCourse());

	}

}

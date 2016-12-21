package com.ford.learning;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {


	Map<String, Integer> stock = new HashMap<String, Integer>();

	public void add(String tickerSymbol, int noOfShares) {
		this.stock.put(tickerSymbol, noOfShares);
	}

	public int getNoOfShares(String tickerSymbol) {
		return this.stock.get(tickerSymbol);
	}

	public double getSharePrice(String ticker) {
		return 0;
	}

}

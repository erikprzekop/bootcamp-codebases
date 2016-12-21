package com.ford.learning;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PortfolioTest {

	private static final String CHINA_CENTRAL = "CCPL";
	private static final String APPLE = "AAPL";
	private Portfolio portfolio;
	
	@Before
	public void setUp(){
		this.portfolio = new Portfolio();
	}

	@Test
	public void checkIfPortfolioExist() {
		assertNotNull(portfolio);
	}

	@Test
	public void canAddStock() throws Exception {
		portfolio.add(APPLE, 10);
		assertEquals(10, portfolio.getNoOfShares(APPLE));
	}

	@Test
	public void canAddMultipleStock() throws Exception {
		portfolio.add(APPLE, 15);
		portfolio.add(CHINA_CENTRAL, 20);
		assertEquals(20,portfolio.getNoOfShares(CHINA_CENTRAL));		
		assertEquals(15,portfolio.getNoOfShares(APPLE));		

	}
	
 
}

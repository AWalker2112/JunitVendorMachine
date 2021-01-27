package vendormachine.users.util;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Before;
import org.junit.Test;

import org.junit.jupiter.api.*;

import vendormachine.users.Person;

public class WalletTEST {

	private Wallet wallet = new Wallet();
	private Wallet walletWithCash = new Wallet(25f);
	private Wallet walletWishCashNName = new Wallet("Alex", 100f);

//	@Before
//	public void init() {
//		Person alex = new Person("Alex", new Wallet(15.0f));
//	}

	@Test
	public void getCreditTest() {

		assertEquals(0, wallet.getCredit(10f), 0);

		assertEquals(0.4f, wallet.getCredit(0.4f), 0);

	}

	@Test
	public void getAllCreditTest() {

		assertEquals(0.5f, wallet.getAllCredit(), 0);
	}

	@Test
	public void addCreditTest() {

		float addCreditCredit1 = wallet.getAllCredit() + 10;

		wallet.addCredit(10);
		float addCreditCreditCheck = wallet.getAllCredit();

		assertEquals(addCreditCredit1, addCreditCreditCheck, 0);
	}

	@Test

	public void getBrandTest() {
		assertEquals("Alex", walletWishCashNName.getBrand());
	}
	
	
	@Test
	
	public void setCreditTest(){
		
		walletWithCash.setCredit(50);
		
		assertEquals(50,walletWithCash.getAllCredit(),0);
	}
	
	@Test
	
	public void setBrandTest() {
		
		walletWithCash.setBrand("Bob");
		
		assertEquals("Bob",walletWithCash.getBrand());
	}
	

	
}

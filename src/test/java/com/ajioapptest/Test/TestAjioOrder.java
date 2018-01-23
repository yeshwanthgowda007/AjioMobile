package com.ajioapptest.Test;

import org.testng.annotations.Test;

import com.ajioapptest.POM.AjiohomeTestPage;
import com.ajioapptest.POM.ProductdetailsTestPage;
import com.ajioapptest.POM.TshirtresultTestPage;

public class TestAjioOrder {
	
	@Test
	public void verifyOrder()
	{
		AjiohomeTestPage ajiohome=new AjiohomeTestPage();
		ajiohome.openApp();
		ajiohome.clickSection();
		ajiohome.clickMenu();
		ajiohome.selectProduct("T-SHIRTS",1);
		
		TshirtresultTestPage shirt=new TshirtresultTestPage();
		shirt.clickSortBy();
		shirt.clickLowestToHighest();
		shirt.verifyProductList();
		shirt.selectProductByIndex(1);
		
		ProductdetailsTestPage product=new ProductdetailsTestPage();
		product.verifyProductDetailsPage();
		product.addToCart();
		product.verifySignInPopUp();
		product.clickClosePopUp();
		product.clickBack();
		
		shirt.clickHomeButton();
		
	}

}

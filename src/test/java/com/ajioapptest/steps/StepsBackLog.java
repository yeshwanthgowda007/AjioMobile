/**
 * 
 */
package com.ajioapptest.steps;

import com.ajioapptest.POM.AjiohomeTestPage;
import com.ajioapptest.POM.ProductdetailsTestPage;
import com.ajioapptest.POM.TshirtresultTestPage;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class StepsBackLog {
	AjiohomeTestPage ajiohome = new AjiohomeTestPage();
	TshirtresultTestPage shirt = new TshirtresultTestPage();
	ProductdetailsTestPage product = new ProductdetailsTestPage();

	@QAFTestStep(description = "user opens AJio application")
	public void userOpensAJioApplication() {
		ajiohome.openApp();
	}

	@QAFTestStep(description = "user gets AJio home page")
	public void userGetsAJioHomePage() {
		ajiohome.verifyHomePage();
	}

	@QAFTestStep(description = "user selects Men from homepage")
	public void userSelectsMenFromHomepage() {
		ajiohome.clickSection();
	}

	@QAFTestStep(description = "user selects Menu from the homepage")
	public void userSelectsMenuFromTheHomepage() {
		ajiohome.clickMenu();
	}

	// @QAFTestStep(description = "user selects {0} from {1} from the Menu")
	// public void userSelectsFromFromTheMenu(String str0, String str1) {
	// ajiohome.selectProduct(str1, str0);
	// }

	@QAFTestStep(description = "user selects sort by and selects lowest to highest filter")
	public void userSelectsSortByAndSelectsLowestToHighestFilter() {
		shirt.clickSortBy();
		shirt.clickLowestToHighest();
	}

	@QAFTestStep(description = "user gets the search result page")
	public void userGetsTheSearchResultPage() {
		shirt.verifyProductList();
	}

	@QAFTestStep(description = "user selects the {0} product")
	public void userSelectsTheProduct(String str0) {
		shirt.selectProductByIndex(1);
	}

	@QAFTestStep(description = "user should get the product details page")
	public void userShouldGetTheProductDetailsPage() {
		product.verifyProductDetailsPage();
	}

	@QAFTestStep(description = "user selects SaveToCloset")
	public void userSelectsSaveToCloset() {
		product.addToCart();
	}

	@QAFTestStep(description = "user should get SignIn popup")
	public void userShouldGetSignInPopup() {
		product.verifySignInPopUp();
		product.clickClosePopUp();
		product.clickBack();

		shirt.clickHomeButton();
	}

	@QAFTestStep(description = "user selects {0} and clicks {1} in Menu")
	public void userSelectsAndClicksInMenu(String str0, String str1) {
		ajiohome.selectProduct(str0, Integer.parseInt(str1));
	}

}

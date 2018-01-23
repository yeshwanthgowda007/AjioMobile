package com.ajioapptest.POM;

import org.hamcrest.Matchers;

import com.ajioapptest.productinfobean.ProductInfoBean;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class ProductdetailsTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.productname.productdetailspage")
	private QAFWebElement lnkProductnameProductdetailspage;
	@FindBy(locator = "lnk.productprice.productdetailspage")
	private QAFWebElement lnkProductpriceProductdetailspage;
	@FindBy(locator = "lnk.savetocloset.productdetailspage")
	private QAFWebElement lnkSavetoclosetProductdetailspage;
	@FindBy(locator = "lnk.addtobag.productdetailspage")
	private QAFWebElement lnkAddtobagProductdetailspage;
	@FindBy(locator = "lnk.closepopup.productdetailspage")
	private QAFWebElement lnkClosepopupProductdetailspage;
	@FindBy(locator = "btn.back.productdetailspage")
	private QAFWebElement btnbackProductdetailspage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getLnkProductnameProductdetailspage() {
		return lnkProductnameProductdetailspage;
	}

	public QAFWebElement getLnkProductpriceProductdetailspage() {
		return lnkProductpriceProductdetailspage;
	}

	public QAFWebElement getLnkSavetoclosetProductdetailspage() {
		return lnkSavetoclosetProductdetailspage;
	}

	public QAFWebElement getLnkAddtobagProductdetailspage() {
		return lnkAddtobagProductdetailspage;
	}

	public QAFWebElement getLnkClosepopupProductdetailspage() {
		return lnkClosepopupProductdetailspage;
	}
	
	public QAFWebElement getbtnbackProductdetailspage() {
		return btnbackProductdetailspage;
	}
	
	public void verifyProductDetailsPage()
	{
		getLnkProductnameProductdetailspage().waitForVisible();
		
		ProductInfoBean details=(ProductInfoBean)ConfigurationManager.getBundle().getProperty("product.information");
		
		Validator.verifyThat(getLnkProductnameProductdetailspage().getText(), Matchers.containsString(details.getProductName()));
		Validator.verifyThat(getLnkProductpriceProductdetailspage().getText(), Matchers.containsString(details.getProductPrice()));
	
	}
	
	public void addToCart() {
		getLnkSavetoclosetProductdetailspage().click();
	}
	
	public void verifySignInPopUp()
	{
		Validator.verifyThat(getLnkClosepopupProductdetailspage().isPresent(),Matchers.equalTo(true));
	}
	
	public void clickClosePopUp()
	{
		getLnkClosepopupProductdetailspage().click();
	}
	
	public void clickBack()
	{
		getbtnbackProductdetailspage().waitForVisible();
		getbtnbackProductdetailspage().click();
		
	}

}

package com.ajioapptest.productcomponent;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductComponent extends QAFWebComponent {
	
	public ProductComponent(String locator)
	{
		super(locator);
	}

	@FindBy(locator ="lnk.productname.tshirtspage")
	private QAFWebElement lnkproductnameproductspage;
	
	@FindBy(locator="lnk.productprice.tshirtspage")
	private QAFWebElement lnkproductpriceproductpage;
	
	

	public QAFWebElement getproductnameproductspage() {
		return lnkproductnameproductspage;
	}

	public QAFWebElement getproductpriceproductpage() {
		return lnkproductpriceproductpage;
	}
		
}

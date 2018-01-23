package com.ajioapptest.POM;

import java.util.List;

import org.hamcrest.Matchers;

import com.ajioapptest.productcomponent.ProductComponent;
import com.ajioapptest.productinfobean.ProductInfoBean;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class TshirtresultTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.productdivision.tshirtspage")
	private List<ProductComponent> lnkProductdivisionTshirtspage;
	@FindBy(locator = "lnk.productname.tshirtspage")
	private QAFWebElement lnkProductnameTshirtspage;
	@FindBy(locator = "lnk.productprice.tshirtspage")
	private QAFWebElement lnkProductpriceTshirtspage;
	@FindBy(locator = "lnk.sortby.tshirtpage")
	private QAFWebElement lnksortbyTshirtspage;
	@FindBy(locator = "lnk.lowesttohighest.tshirtpage")
	private QAFWebElement lnkLowestToHighestTshirtspage;
	@FindBy(locator = "lnk.home.tshirtresultpage")
	private QAFWebElement lnkhomeTshirtspage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<ProductComponent> getLnkProductdivisionTshirtspage() {
		return lnkProductdivisionTshirtspage;
	}

	public QAFWebElement getLnkProductnameTshirtspage() {
		return lnkProductnameTshirtspage;
	}

	public QAFWebElement getLnkProductpriceTshirtspage() {
		return lnkProductpriceTshirtspage;
	}
	
	public QAFWebElement getLnksortbyTshirtspage() {
		return lnksortbyTshirtspage;
	}

	public QAFWebElement getLnklowesrtohighestTshirtspage() {
		return lnkLowestToHighestTshirtspage;
	}
	
	public QAFWebElement getLnkHomeTshirtspage() {
		return lnkhomeTshirtspage;
	}

	
	public void verifyProductList()
	{
		Validator.verifyThat(getLnkProductdivisionTshirtspage().size(),Matchers.greaterThan(0));
		getLnkProductdivisionTshirtspage().get(1).waitForVisible();
			
	}
	
	public void clickSortBy()
	{
		getLnksortbyTshirtspage().waitForVisible();
		getLnksortbyTshirtspage().click();
	}
	
	public void clickLowestToHighest()
	{
		getLnklowesrtohighestTshirtspage().waitForVisible();
		getLnklowesrtohighestTshirtspage().click();
	}
	
	public void selectProductName(int index)
	{
		ProductInfoBean productinfobean=new ProductInfoBean();
		productinfobean.setProductName(getLnkProductdivisionTshirtspage().get(index).getproductnameproductspage().getText());
		productinfobean.setProductPrice(getLnkProductdivisionTshirtspage().get(index).getproductpriceproductpage().getText());
		
		ConfigurationManager.getBundle().addProperty("product.information", productinfobean);
			
		getLnkProductdivisionTshirtspage().get(index).getproductnameproductspage().click();
	}
	
	public void selectProductByIndex(int index) {
		selectProductName((index-1));
	}	
	
	public void clickHomeButton()
	{
		getLnkHomeTshirtspage().waitForVisible();
		getLnkHomeTshirtspage().click();
	}

}

package com.ajioapptest.POM;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AjiohomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.Men.homepage")
	private QAFWebElement lnkMenHomepage;
	@FindBy(locator = "btn.menu.homepage")
	private QAFWebElement btnMenuHomepage;
	@FindBy(locator = "lnk.submenu.homepage")
	private QAFWebElement lnkSubmenuHomepage;
	@FindBy(locator = "lnk.category.homepage")
	private QAFWebElement lnkCategoryHomepage;
	@FindBy(locator = "lnk.sample.homepage")
	private QAFWebElement lnkSampleHomepage;
	@FindBy(locator = "lnk.catImage.homepage")
	private QAFWebElement lnkCatImageHomepage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getLnkMenHomepage() {
		return lnkMenHomepage;
	}
	
	public QAFWebElement getLnkCategoryImageHomepage() {
		return lnkCatImageHomepage;
	}

	public QAFWebElement getBtnMenuHomepage() {
		return btnMenuHomepage;
	}

	public QAFWebElement getLnkSubmenuHomepage() {
		return lnkSubmenuHomepage;
	}

	public QAFWebElement getLnkCategoryHomepage() {
		return lnkCategoryHomepage;
	}
	
	public QAFWebElement getLnkSampleHomepage() {
		return lnkSampleHomepage;
	}
	
	public void openApp()
	{
		driver.get("/");
	}
	
	public void clickMenu()
	{
		try
		{
			if(getBtnMenuHomepage().isDisplayed()&&getBtnMenuHomepage().isPresent())
			{
				getBtnMenuHomepage().click();
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void verifyHomePage()
	{
		
	}
	
	public void clickSection()
	{
		try
		{
			if(getLnkMenHomepage().isDisplayed() && getLnkMenHomepage().isPresent())
			{
				getLnkMenHomepage().click();
				getLnkMenHomepage().click();
				getLnkSampleHomepage().click();
			}
		}
		catch(Exception e)
		{
			
		}
	}
		
	
	public void selectProduct(String subMenu,int catNum)
	{
		
//		QAFExtendedWebElement category=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.submenu.homepage"), menu));
//		category.waitForVisible();
//		try
//		{
//			if(category.isDisplayed()&&category.isPresent())
//			{	
//				category.click();
//			}
//		}
//		catch(Exception e)
//		{
//			QAFExtendedWebElement categoryimage=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.catImage.homepage"), catNum));
//			categoryimage.waitForVisible();
//			categoryimage.click();
//		}
		
		try
		{
			QAFExtendedWebElement categoryimage=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.catImage.homepage"), catNum));
			categoryimage.waitForVisible();
			categoryimage.click();
		}
		catch(Exception e)
		{
			
		}
		
		QAFExtendedWebElement subCategory=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.category.homepage"), subMenu));
		try
		{
			if(subCategory.isDisplayed()&&subCategory.isPresent())
			{
				subCategory.click();
			}
		}
		catch(Exception e)
		{
			clickMenu();
			subCategory.click();
		}
	}
}

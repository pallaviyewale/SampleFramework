package helperMethods;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MySharedObjects
{

	Base baseObject;

	@Before("@LoginTests,@SearchProductTests,@AddProductsToBasketTests,@CheckoutProductsFromBasketTests")
	public WebDriver setUp()
	{
		baseObject = new Base();
		return baseObject.openBrowser();
	}
	
	@After("@LoginTests,@SearchProductTests,@AddProductsToBasketTests,@CheckoutProductsFromBasketTests")
	public void tearDown()
	{
		baseObject.closeBrowser();
	}
}

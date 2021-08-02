package stepDefinitions;

import org.openqa.selenium.WebDriver;

import helperMethods.MySharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.SearchProductsPageActions;;

public class SearchProductStepDefinition 
{
	private WebDriver driver;
	SearchProductsPageActions searchProductActions = new SearchProductsPageActions();
    
	public SearchProductStepDefinition(MySharedObjects hk)
	{
		driver = hk.setUp();
	}
	@When("^Search Product (.+)$")
	public void searchProduct(String ProductName)
	{
		searchProductActions.searchProduct(driver,ProductName);
	}

	@Then("^Validate the Product (.+)$")
	public void validateProduct(String ProductName)
	{
		searchProductActions.validateProduct(driver,ProductName);
	}
}

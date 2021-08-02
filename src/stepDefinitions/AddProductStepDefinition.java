package stepDefinitions;

import org.openqa.selenium.WebDriver;

import helperMethods.MySharedObjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AddProductPageActions;

public class AddProductStepDefinition {

	
	private WebDriver driver;
	AddProductPageActions searchProductActions = new AddProductPageActions();
    
	public AddProductStepDefinition(MySharedObjects hk)
	{
		driver = hk.setUp();
	}
	
	
	@When("^Add Product (.+) to basket$")
	public void searchProduct(String ProductName)
	{
		searchProductActions.addProduct(driver,ProductName);
	}
	
	
	@Then("^Validate the basket with Product (.+)$")
	public void validateBasketProducts(String ProductName)
	{
		searchProductActions.validateBasket(driver,ProductName);
	}
}

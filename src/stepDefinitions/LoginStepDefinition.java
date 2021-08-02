package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import helperMethods.MySharedObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageActions.LoginPageActions;;


@RunWith(Cucumber.class)
public class LoginStepDefinition
{
	private WebDriver driver;
	LoginPageActions loginActions = new LoginPageActions();
    
	public LoginStepDefinition(MySharedObjects hk)
	{
		driver = hk.setUp();
	}


	@Given("^Open Main page$") 
	public void openMainPage() throws Throwable
	{
		loginActions.openMainPage(driver);
	}
	
	@Given("^Enter User Credentials on login page with (.+) and password (.+)$")
	public void enterUserCredentials(String username, String password) throws Throwable
	{
		loginActions.enterUserCredentials(driver, username, password);
	}
	
	@When("^Click on Login$")
	public void clickOnLogin() throws Throwable
	{
		loginActions.clickOnLogin(driver);
	}
	
	@Given("^Login with User$")
	public void loginWithUser() throws Throwable
	{
		loginActions.loginWithUserDetails(driver);
	}
	
	@Then("^Verify User has logged in$")
	public void verifyUserLogin() throws Throwable
	{

	}
	
	@Then("^Verify login error message$")
	public void VerifyLoginMessage() throws Throwable
	{

	}
	
}


package pageActions;

import pageObjects.LoginPageObjects;
import config.ConfigHelper;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {

	LoginPageObjects loginObjects = new LoginPageObjects();
	
	public void openMainPage(WebDriver driver) throws InterruptedException
	{
		String url = ConfigHelper.getGetconfig().getUrl();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(loginObjects.allowCookies).click();
	}
	
	public void enterUserCredentials(WebDriver driver,String username, String password)
	{
		driver.findElement(loginObjects.signIn).click();
		driver.findElement(loginObjects.userNameBy).clear();
		driver.findElement(loginObjects.userPasswordBy).clear();
		driver.findElement(loginObjects.userNameBy).sendKeys(username);
		driver.findElement(loginObjects.userPasswordBy).sendKeys(password);
	}
	
	public void clickOnLogin(WebDriver driver)
	{
		driver.findElement(loginObjects.signInBy).click();
	}
	
	public void loginWithUserDetails(WebDriver driver)
	{
		String user = ConfigHelper.getGetconfig().getLoginUser();
		String password = ConfigHelper.getGetconfig().getLoginPassword();
		
		driver.findElement(loginObjects.signIn).click();
		driver.findElement(loginObjects.userNameBy).clear();
		driver.findElement(loginObjects.userPasswordBy).clear();
		driver.findElement(loginObjects.userNameBy).sendKeys(user);
		driver.findElement(loginObjects.userPasswordBy).sendKeys(password);
		driver.findElement(loginObjects.signInBy).click();
	}
}

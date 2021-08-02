package pageObjects;

import org.openqa.selenium.By;

//This is object repository for sign in page.
public class LoginPageObjects
{

	public By allowCookies = By.xpath("//button[text()='Allow all']");
	public By signIn = By.xpath("//div/a[text()='Sign in']");
	public By userNameBy = By.id("email");
	public By userPasswordBy = By.id("password");
	public By signInBy = By.id("loginForm");
	
	public By signInFailedMessage = By.xpath("//h[@data-test='error']");
}
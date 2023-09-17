package PageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	  
	WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	
	}
	//Driver.findelement(by.xpath("//input[@name='username']"))

	private By UserName = By.xpath("//input[@name='username']");
	private By passWord = By.xpath("//input[@name='password']");
	private By login =    By.xpath("//button[@type='submit']");
	
	 private By ActualPageText=By.xpath("//h6[text()='Dashboard']");
	 private By ExpectedErrorText =By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	public WebElement EnterUserName() {
	return driver.findElement(UserName);
	}
	
	public WebElement EnterPassword() {
	return driver.findElement(passWord);
	
	}
	 
	public WebElement Clickonlogin() {
	return driver.findElement(login);
		
	}
	
	public WebElement ActualPageText() {
	return driver.findElement(ActualPageText);
	}
	
	public WebElement Errortext() {
	return driver.findElement(ExpectedErrorText);
	}
	
	
}

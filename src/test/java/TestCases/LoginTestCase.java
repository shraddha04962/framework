
package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class LoginTestCase extends BaseClass {

	//added one line for git demo purpose
	@Test(priority = 0)

	public void verifyingValidLogin() throws IOException, InterruptedException {
		
		
		 //initializeDriver();
		 //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		

		LoginPage obj = new LoginPage(driver);
		
		CommonMethod.expwait(driver, obj.EnterUserName(),10);
		obj.EnterUserName().sendKeys(Constants.EnterUserName);
		obj.EnterPassword().sendKeys(Constants.EnterPassword);
		obj.Clickonlogin().click();
		Thread.sleep(2000);
		
		CommonMethod.handlesoftassert(obj.ActualPageText().getText(),Constants.ActualPageText);

		
	}

	public void verifyinvalidlogin() throws IOException, InterruptedException {
		initializeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

		LoginPage obj = new LoginPage(driver);
		obj.EnterUserName().sendKeys(Constants.InvalidUserName);
		obj.EnterPassword().sendKeys(Constants.invalidpassword);
		obj.Clickonlogin().click();
		
		CommonMethod.expwait(driver, obj.ExpectedErrortext(),10);
		
		CommonMethod.handlesoftassert(obj.ExpectedErrortext().getText(),Constants.InvalidExpectedErrortext);

		
	}

}

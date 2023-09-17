
package TestCases;

import java.io.IOException;


import org.testng.annotations.Test;


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

		
        Thread.sleep(2000);
		LoginPage obj = new LoginPage(driver);
		
		
		obj.EnterUserName().sendKeys(Constants.EnterUserName);
		Thread.sleep(2000);
		obj.EnterPassword().sendKeys(Constants.EnterPassword);
		Thread.sleep(2000);
		obj.Clickonlogin().click();
		Thread.sleep(2000);
		
		CommonMethod.handlesoftassert(obj.ActualPageText().getText(),Constants.ActualPageText);

		
	}
      @Test
	public void verifyinvalidlogin() throws IOException, InterruptedException {
		
		
        Thread.sleep(2000);
		LoginPage obj = new LoginPage(driver);
		obj.EnterUserName().sendKeys(Constants.InvalidUserName);
		Thread.sleep(2000);
		obj.EnterPassword().sendKeys(Constants.invalidpassword);
		Thread.sleep(2000);
		obj.Clickonlogin().click();
		
		
		Thread.sleep(2000);
		CommonMethod.handlesoftassert(obj.Errortext().getText(),Constants.InvalidExpectedErrortext);

		
	}

}

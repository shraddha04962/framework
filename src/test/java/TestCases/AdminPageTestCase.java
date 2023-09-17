package TestCases;

import org.testng.annotations.Test;
import PageObjectModel.AdminPageObject;
import PageObjectModel.LoginPage;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;
import Resources.BaseClass;

public class AdminPageTestCase extends BaseClass { 
	
	@Test
	public void verifyVisibilityOfWebElement() {

		driver.manage().window().maximize();

		LoginPage lpo = new LoginPage(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.EnterUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.EnterPassword);
		CommonMethod.clickOnElement(lpo.Clickonlogin());

		CommonMethod.handlesoftassert(lpo.ActualPageText().getText(), Constants.Expected_DashboardText);

		AdminPageObject apo = new AdminPageObject(driver);

		CommonMethod.isElementDisplayed(apo.AdminText());
		System.out.println(CommonMethod.isElementDisplayed(apo.AdminText()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.AdminText());
		


	}

	@Test
	public void verifyAdminPage() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPage lpo = new LoginPage(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.EnterUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.EnterPassword);
		CommonMethod.clickOnElement(lpo.Clickonlogin());

		CommonMethod.handlesoftassert(lpo.ActualPageText().getText(), Constants.Expected_DashboardText);

		AdminPageObject apo = new AdminPageObject(driver);

		CommonMethod.clickOnElement(apo.AdminText());
		CommonMethod.handlesoftassert(apo.ActualText_UserManagement().getText(), Constants.Expected_UserManagement);

		CommonMethod.clickOnElement(apo.UserManagement());
		CommonMethod.handlesoftassert(apo.User().getText(), Constants.Expected_UserText);
		
		CommonMethod.clickOnElement(apo.User());
		
		CommonMethod.isElementDisplayed(apo.SystemUsers());
		System.out.println(CommonMethod.isElementDisplayed(apo.SystemUsers()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.SystemUsers());
		
		CommonMethod.isElementDisplayed(apo.UserName());
		System.out.println(CommonMethod.isElementDisplayed(apo.UserName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.UserName());
		
		CommonMethod.setText(apo.UserName_TextField(), Constants.UserName_TextField);
		
		CommonMethod.isElementDisplayed(apo.UserRole());
		System.out.println(CommonMethod.isElementDisplayed(apo.UserRole()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.UserRole());
		
		CommonMethod.clickOnElement(apo.UserRole_ArrowKey());
		CommonMethod.handleDropdown(apo.UserRole_Dropdown(), Constants.Choose_UserRole);
		
		CommonMethod.isElementDisplayed(apo.EmployeeName());
		System.out.println(CommonMethod.isElementDisplayed(apo.EmployeeName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.EmployeeName());
		
		CommonMethod.setText(apo.EmployeeName_TextField(), Constants.EmployeeName_TextField);
		
		CommonMethod.isElementDisplayed(apo.Status());
		System.out.println(CommonMethod.isElementDisplayed(apo.Status()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.Status());
		
		CommonMethod.clickOnElement(apo.Status_ArrowKey());
		
		CommonMethod.handleDropdown(apo.Status_Dropdown(),Constants.Choose_Status_Dropdown );
		
		CommonMethod.clickOnElement(apo.SubmitButton());
		CommonMethod.isElementDisplayed(apo.RecordFound_LabelName());
		System.out.println(CommonMethod.isElementDisplayed(apo.RecordFound_LabelName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.RecordFound_LabelName());
		
		
		
	}

}




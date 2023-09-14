package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import PageObjectModel.LoginPage;
import PageObjectModel.myInfoPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import bsh.org.objectweb.asm.Constants;

public class MyInfoTestCases extends BaseClass {

	@Test
	public void fillpersonalDetails() throws IOException, InterruptedException, AWTException {

		//initializeDriver();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		LoginPage obj = new LoginPage(driver);
		obj.EnterUserName().sendKeys("Admin");
		obj.EnterPassword().sendKeys("admin123");
		obj.Clickonlogin().click();
		Thread.sleep(2000);

		myInfoPageObject mpo = new myInfoPageObject(driver);
		Thread.sleep(5000);
		mpo.clickOnMyInfo().click();
		Thread.sleep(5000);

		mpo.enterFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterFirstName().sendKeys("shraddha");
		Thread.sleep(2000);

		mpo.entermiddleName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.entermiddleName().sendKeys("Bhaskarrao");
		Thread.sleep(2000);

		mpo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterLastName().sendKeys("deshmukh");
		Thread.sleep(2000);

		mpo.enternickname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enternickname().sendKeys("soni");
		Thread.sleep(2000);

		mpo.enterEmpolyeeid().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterEmpolyeeid().sendKeys("0012");
		Thread.sleep(2000);
		
		mpo.enterotherid().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterotherid().sendKeys("0426");
		Thread.sleep(2000);
		
		mpo.enterdriverlicence().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterdriverlicence().sendKeys("9435");
		Thread.sleep(2000);
		
		mpo.enterLicenceExpairyDate().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterLicenceExpairyDate().sendKeys("2023.09.09");
		Thread.sleep(2000);
		
		mpo.enterSSNnumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterSSNnumber().sendKeys("9156");
		Thread.sleep(2000);
		
		mpo.enterSINnumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterSINnumber().sendKeys("7276");
		Thread.sleep(2000);
		
	    mpo.NationalityDropdown().click();
		Thread.sleep(2000);

		CommonMethod.handleDropdown(mpo.NationalityOpetions(),"Indian");
		
		List<WebElement> obj1 = mpo.NationalityOpetions();
		Thread.sleep(2000);
		for (WebElement a : obj1) {
			if (a.getText().equalsIgnoreCase("Indian")) {
				a.click();
				break;
			}
		}
  
		mpo.clickonMaritalStatus().click();
		Thread.sleep(2000);
		
		List<WebElement> obj2 = mpo.MaterialStatusDropdown();
		for (WebElement b : obj2) {
			if (b.getText().equalsIgnoreCase("Single")) {
				b.click();
				break;
			}

		}

		mpo.clickOngender().click();
		Thread.sleep(2000);
		
		mpo.entermilitaryservice().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.entermilitaryservice().sendKeys("yes");
		
		mpo.clickonsmoker().click();
		Thread.sleep(2000);
		
		mpo.BloodGroup().click();
		Thread.sleep(2000);
		
		List<WebElement> obj3 = mpo.BloodGroupDropdown();
		for (WebElement c : obj3) {
			if (c.getText().equalsIgnoreCase("o+")) {
				c.click();
				break;

	}
		}
		
		mpo.clickonAddButton().click();
		Thread.sleep(2000);
		
		mpo.BrowseButton().click();
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		
		StringSelection selection=new StringSelection("C:\\Users\\test\\Downloads\\Sample PDF file.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		mpo.entercommentbox().sendKeys("pdf file added successfully");
		
	}
}

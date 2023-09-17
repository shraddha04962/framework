package Resources;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	 public static void handlesoftassert(String Actual, String  Expected) {
		 
		 SoftAssert sa= new SoftAssert();
		 
		 String ActualText= Actual;
		 String ExpectedText=Expected;
		 
		 sa.assertEquals(ActualText, ExpectedText);
		 sa.assertAll();
		 
		 
	 }
	 public static void handleDropdown(List<WebElement>b,String Text) {
	 List<WebElement> obj1 =b;
	  for (WebElement a : obj1) {
			if (a.getText().equalsIgnoreCase(Text)) {
				a.click();
				break;
			}
		}
	 
	
	 }
	 
	    public  static void expwait(WebDriver driver,WebElement xpath,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(xpath));
		
	   }
}

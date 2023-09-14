package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
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

}

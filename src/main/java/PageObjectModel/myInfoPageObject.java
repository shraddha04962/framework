package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObject {
	
	public WebDriver driver;
	
	public myInfoPageObject( WebDriver driver) {
	this.driver=driver;
	}
	
	private By myInfo=By.xpath("//span[text()='My Info']");
	private By firstName=By.xpath("//input[@name='firstName']");
	private By middelName=By.xpath("//input[@name='middleName']");
	private By LastName=By.xpath("//input[@name='lastName']");
	private By NickName=By.xpath("(//div[@data-v-957b4417]/input)[4]");
	private By Employeeid=By.xpath("(//div[@data-v-957b4417]/input)[5]");
	private By otherid=By.xpath("(//div[@data-v-957b4417]/input)[6]");
	private By driverslicence=By.xpath("(//div[@data-v-957b4417]/input)[7]");
	private By LicenceExpairyDate=By.xpath("//div[@data-v-4a95a2e0]/input[1]");
	private By SSNnumber=By.xpath("(//div[@data-v-957b4417]/input)[8]");
	private By SINnumber=By.xpath("(//div[@data-v-957b4417]/input)[9]");
	private By NationalityDropdown=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");
	private By MaritalStatus=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By MaterialStatusDropdown = By.xpath("//div[@class='oxd-select-option']");
	private By gender=By.xpath("(//div[@class='oxd-radio-wrapper'])[2]");
	private By militaryservice=By.xpath("(//div[@data-v-957b4417]/input)[10]");
	private By smoker=By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	private By BloodGroup=By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	private By BloodTypeDropdown = By.xpath("//div[@class='oxd-select-option']");
	private By AddButton=By.xpath("(//button[@type='button'])[3]");
	private By BrowseButton=By.xpath("//div[@class='oxd-file-button']") ;
	private By commentbox=By.xpath("//textarea[@placeholder='Type comment here']");
	
	public WebElement clickOnMyInfo() {
	return driver.findElement(myInfo);
	
	}
	public WebElement enterFirstName() {
	return driver.findElement(firstName);
	}
	
	public WebElement entermiddleName() {
	return driver.findElement(middelName);
	}
	
	public WebElement enterLastName() {
	return driver.findElement(LastName);
	}
	
	public WebElement enternickname() {
	return driver.findElement(NickName);
	}
	
	public WebElement enterEmpolyeeid() {
	return driver.findElement(Employeeid);
	}
	
	public WebElement enterotherid() {
	return driver.findElement(otherid);
	}
	
	public WebElement enterdriverlicence() {
	return driver.findElement(driverslicence);
	}
	
	public WebElement enterLicenceExpairyDate() {
	return driver.findElement(LicenceExpairyDate);
	}
	
	public WebElement enterSSNnumber() {
	return driver.findElement(SSNnumber);
	}
	
	public WebElement enterSINnumber() {
	return driver.findElement(SINnumber);
	}
	
	public WebElement NationalityDropdown() {
	return driver.findElement(NationalityDropdown);
	}
	
	public List<WebElement> NationalityOpetions() {
	return driver.findElements(nationalityOptions);
	}
	
	public WebElement clickonMaritalStatus() {
	return driver.findElement(MaritalStatus);
	}
	
	public List<WebElement>MaterialStatusDropdown(){
	return driver.findElements(MaterialStatusDropdown);
	}
	
	public WebElement clickOngender() {
	return driver.findElement(gender);
	}
	
	public WebElement entermilitaryservice() {
	return driver.findElement(militaryservice);
	}
	
	public WebElement clickonsmoker() {
	return driver.findElement(smoker);
	}
	
	public WebElement BloodGroup(){
	return driver.findElement(BloodGroup);
	}
	
	public List<WebElement>BloodGroupDropdown(){
	return driver.findElements(BloodTypeDropdown);
	}
	
	public WebElement clickonAddButton() {
	return driver.findElement(AddButton);	
	}
	
	public WebElement BrowseButton() {
	return driver.findElement(BrowseButton);
	}
	
	public WebElement entercommentbox() {
	return driver.findElement(commentbox);
	}
	
	
	}
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);	
	}
//Locators
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement Signup_login;
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	WebElement New_User_Signup;
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement userName;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement Email;
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement SignUp_Button;
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement Account_info_text;
	
	public void clicksignup() {
		Signup_login.click();
	}
    public boolean NewUser() {
    	return New_User_Signup.isDisplayed();   	
    }
    public void Enter_Name(String Name) {
    	userName.sendKeys(Name);
    }
    public void Enter_Email(String email) {
    	Email.sendKeys(email);
    }
    public void Click_Signup() {
    	SignUp_Button.click();
    }
    public boolean Account_info_text() {
    	return Account_info_text.isDisplayed();
    }
}
package testBase;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	public WebDriver driver;
	public org.apache.logging.log4j.Logger logger ;
	@BeforeClass
	public void setup() {
		logger =LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
	}
    @AfterClass
    public void teardown() {
    	driver.quit();
    }
 /*   public String RandomData() {
    	String generatedString = RandomStringUtils.randomAlphabetic(10);
    return generatedString;
    
    }*/
    
    
}

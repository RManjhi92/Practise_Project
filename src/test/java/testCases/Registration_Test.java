package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class Registration_Test extends BaseClass{
	
	@Test
	public void test_registration() {
		logger.info("HomePge");
		try {
		HomePage HP=new HomePage(driver);
		String curr_url=driver.getCurrentUrl();
		Assert.assertEquals(curr_url,"https://automationexercise.com/");
		HP.clicksignup();
		HP.Enter_Name("Tester");
		HP.Enter_Email("testr1294h@yopmail.com");
		HP.Click_Signup();
		}
		catch  (Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		logger.info("Test complete");
	}

}

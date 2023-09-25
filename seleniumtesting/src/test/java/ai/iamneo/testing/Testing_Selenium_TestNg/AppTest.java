package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	
	/* Do not modify the code given below*/
	@BeforeTest
	public void beforeTest() throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "/home/coder/project/workspace/Testing-with-Selenium-TestNg/chromedriver");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}
	/************************************/
	/* You can edit the code given below*/
	@Test
	public void test_case1_verifytitle() throws InterruptedException {
		//Fill your code
		
		Assert.assertEquals(/*Fill your code*/);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

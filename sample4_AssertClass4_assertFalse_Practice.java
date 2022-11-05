package Verification_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample4_AssertClass4_assertFalse_Practice 
{
	@Test
	public void assertfalse() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\Desktop\\26March Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");

	boolean actresult = driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
	
	Assert.assertTrue(actresult);
	
	driver.close();
	}
}
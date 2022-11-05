package Verification_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample3_AssertClass3_assertTrue_Practice 
{
	@Test
	public void assertTrue() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\Desktop\\26March Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		 boolean actResult = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
		
	Thread.sleep(2000);
		 
		 Assert.assertFalse(actResult);
	
	driver.close();
}
}
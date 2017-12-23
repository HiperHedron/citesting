package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
	
	

}

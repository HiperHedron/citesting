package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lux/eclispe-oxygen-workspace/Entrust/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
	
	

}

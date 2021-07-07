package SeleniumTrack.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		//driver.navigate().to(“http://www.flipkart.com”);
		//WebElement Ixio = driver.findElement(By.id("ixiLogoImg"));
		//driver.quit();

		
	}

}

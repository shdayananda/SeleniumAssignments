package SeleniumTrack.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public void selenium() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "/Users/Desktop/CHROME_WEBDRIVERS/chromedriver");
		   WebDriver driver = new ChromeDriver();
		   String baseUrl = "https://the-internet.herokuapp.com/";
		   driver.get(baseUrl);
		   WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[10]/a"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		   element.click();

		   Actions builder = new Actions(driver);
		   WebElement from = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		   WebElement to = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		//Perform drag and drop
		   builder.dragAndDrop(from,to).perform();
		   Thread.sleep(2000);

		   driver.close();
		  System.exit(0);


	}

}

package firstSeleniumScripts;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.utilities;

public class implictAndExplicitWaits {
	

	ChromeDriver driver;
	String url = "https://www.flipkart.com/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
						   "C:\\Folder for testing\\JARS-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void mouseHover() {
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		utilities.waitTillElementVisible(driver, By.xpath("//span[text()='Electronics']"), 10);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		
		utilities.waitTillElementVisible(driver, By.xpath("(//a[text()='Samsung'])"), 10);
		
		WebElement samsung = driver.findElement(By.xpath("(//a[text()='Samsung'])"));
		action.moveToElement(samsung).click().build().perform();
		
	}
	
	public static void main(String[] args) {
		
		implictAndExplicitWaits etc = new implictAndExplicitWaits();
		etc.invokeBrowser();
		etc.mouseHover();
	}

}

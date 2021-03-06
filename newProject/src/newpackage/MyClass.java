package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class MyClass {
	
	public static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		// setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}
	
	//setBrowser
	//setBrowserConfig
	//runTest
	
	
	public static void setBrowser(){
		browser="Chrome";
	}
	
	public static void setBrowserConfig(){
		String projectLocation = System.getProperty("user.dir");
		
		if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\lib\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		if(browser.contains("Firefox")) {
		System.setProperty("webdriver.gecko.driver",projectLocation+"\\lib\\geckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
	}
	
	public static void runTest(){
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		driver.quit();
		
	}

}

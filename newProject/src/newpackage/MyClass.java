package newpackage;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	
	public static void main(String[] args) {
		
		String projectLocation = System.getProperty("user.dir");
		
		// System.setProperty("webdriver.chrome.driver",projectLocation+"\lib\chromeDriver\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",projectLocation+"\\lib\\geckoDriver\\geckodriver.exe");
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.guru99.com/first-webdriver-script.html");
		driver.quit();
	}

}
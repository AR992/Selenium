package firstSeleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithChromeBrowser {
	
	ChromeDriver driver;
	String url = "https://www.selenium.dev/downloads/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Folder for testing\\JARS-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	public void getTitle() {
		
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		workingWithChromeBrowser wc = new workingWithChromeBrowser();
		
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
	}
}

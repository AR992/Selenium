package assigment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	
	ChromeDriver driver;
	String QAHub = "http://qatechhub.com";
	String Facebook = "https://www.facebook.com";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
						   "C:\\Folder for testing\\JARS-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(QAHub);
	}
	
	public void getTitle() {
		
		String expectedTitleOfThePage = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String actualTitleOfThePage = driver.getTitle();
		
		if(actualTitleOfThePage.equals(expectedTitleOfThePage)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	
	}
	
	public void navigateToFacebook() {
		
		driver.navigate().to(Facebook);
		driver.navigate().back();
		
	}
	
	public void printTheUrl() {
		
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
	}
	
	public void navigateForwardAndReloadPage() {
		
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		task1 etc = new task1();
		
		etc.invokeBrowser();
		etc.getTitle();
		etc.navigateToFacebook();
		etc.printTheUrl();
		etc.navigateForwardAndReloadPage();
		etc.closeBrowser();
	}
	
}

package assigment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {
	
	ChromeDriver driver;
	String fb = "https://www.facebook.com/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Folder for testing\\JARS-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(fb);
		
	}
	
	public void verifyUrl() {
		
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
	
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	
	public void clickButtonName() {
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
	}
	
	public void fillForm() {
		
		driver.findElement(By.name("firstname")).sendKeys("Jolynn");
		driver.findElement(By.name("lastname")).sendKeys("Regnier");
		
		driver.findElement(By.name("reg_email__")).sendKeys("test@name.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@name.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password123#");
		
		Select dropdown = new Select(driver.findElement(By.name("birthday_year")));
	    dropdown.selectByValue("1998");
	    
	    driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	    driver.findElement(By.name("websubmit")).click();
	
	}
	
	public void closeBrowser(){
		
		driver.quit();	
	}
	
	public static void main(String[] args) {
		
		task2 etc = new task2();
		
		etc.invokeBrowser();
		etc.verifyUrl();
		etc.clickButtonName();
		etc.fillForm();
		etc.closeBrowser();
	}

}

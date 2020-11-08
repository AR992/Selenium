package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99Class {
	
	ChromeDriver driver;
	String url = "http://demo.guru99.com/v4/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				   "C:\\Folder for testing\\JARS-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	
	public void login(String username, String password) {
		
		WebElement usernameElement = driver.findElement(By.name("uid"));
		
		usernameElement.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer() {
		
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("02/14/1990");
		driver.findElement(By.name("addr")).sendKeys("this is address");
		driver.findElement(By.name("city")).sendKeys("Sarajevo");
		driver.findElement(By.name("state")).sendKeys("Bosna i Hercegovina");
		driver.findElement(By.name("pinno")).sendKeys("710000");
		driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
		
		String emailid = "Test" + System.currentTimeMillis() + "@name.com";
		driver.findElement(By.name("emailid")).sendKeys(emailid);
		
		driver.findElement(By.name("password")).sendKeys("thisisnewpassword1");
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId() {
		
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}

}

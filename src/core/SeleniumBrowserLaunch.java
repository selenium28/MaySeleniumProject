package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserLaunch {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userNameText = driver.findElement(By.name("username"));
		userNameText.clear();
		userNameText.sendKeys("Admin");
		
		WebElement passwordText = driver.findElement(By.name("password"));
		passwordText.clear();
		passwordText.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		String dashboardURL = driver.getCurrentUrl();
		System.out.println(dashboardURL);
		
		driver.findElement(By.xpath("(//*[text()='Dashboard'])[2]")).isDisplayed();
		
		driver.quit();
		
		
	}

}

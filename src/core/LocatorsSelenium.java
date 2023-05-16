package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelenium {

	public static void main(String[] args) {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		1. Name
		WebElement userNameText = driver.findElement(By.name("username"));
		userNameText.clear();
		userNameText.sendKeys("Admin");
		
//		2. ID
		WebElement userNameReg = driver.findElement(By.id("email"));
		userNameReg.sendKeys("ABCD");
		
//		3. Link Text
		WebElement loginLink = driver.findElement(By.linkText("SIGN-ON"));
		loginLink.click();
		
//		4. Partial Link Text
		WebElement forgetPassword = driver.findElement(By.partialLinkText("Forgot"));
		forgetPassword.click();
		
//		5. Tag names
		WebElement urls = driver.findElement(By.tagName("a"));
		urls.click();
		
//		6. ClassName
		WebElement resetUserName = driver.findElement(By.className("oxd-input oxd-input--active"));
		resetUserName.sendKeys("abcd");
		
//		7. xPath  --> There are 2 type a. Absolute xPAth b. Relative  xpath
		WebElement userNameAbsolute = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[2]/input"));
		
//		Relative xPath
//		1. Normal xPath -- > //input[@name='firstName']
//		2. Text xPath --> //*[text()='City:']
//		3. Contains --> //*[contains(text(),'Log in to Facebook')]
//		4. Following xPath --> //*[text()='Employee Id']/following::div[1]
//		5. Preceding xPath --> //*[text()='Employee Id']/preceding::input[1]
//		6. And xPAth --> //*[@id='email' and @name='email']
//		7. OR xPAth --> //*[@id='pass' or @name='pass']
		
//		8. cSS Selector
//		input[name='pass']
		

	}

}

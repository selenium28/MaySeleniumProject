package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		String url = "https://demo.guru99.com/test/newtours/register.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement selectCountry = driver.findElement(By.name("country"));
		
		Select dropCountry = new Select(selectCountry);
//		dropCountry.selectByVisibleText("INDIA");
		dropCountry.selectByIndex(7);
//		dropCountry.selectByValue("JAPAN");

	}

}

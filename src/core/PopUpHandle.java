package core;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/delete_customer.php";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		
		alert.accept();
//		alert.dismiss();

	}

}

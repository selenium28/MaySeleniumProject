package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://demo.guru99.com/test/upload/";

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\devid\\Documents\\New Text Document.txt");
		
		WebElement iAcceptCheckBox = driver.findElement(By.id("terms"));
		iAcceptCheckBox.click();
		
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
		WebElement successfulMsg = driver.findElement(By.xpath("//*[text()='has been successfully uploaded.']"));
		successfulMsg.isDisplayed();
		
		driver.quit();

	}

}

package ch.ilv.crm.test.web;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomerCreateTest {

	@Test
	public void testCreateCustomer() throws Exception {
		// Configure firefox driver
		
		 System.setProperty("webdriver.gecko.driver", "C:\\emmenegger\\Dev-Tools\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		// Start firefox driver
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:7070/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));

		WebElement forename = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		forename.sendKeys("Michael");

		WebElement name = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
		name.sendKeys("Hauck");

		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		
		Thread.sleep(5000);
		
		button.click();

		WebElement username = driver.findElement(By.xpath("/html/body/span"));

		assertTrue(username.getText().trim().contains("Michael Hauck"));
	}
	
}

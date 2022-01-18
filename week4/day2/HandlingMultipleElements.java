package week4.day2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> inputTags = driver.findElements(By.tagName("input"));
		
		
		for(WebElement eachTag : inputTags) {
			
			String className = eachTag.getAttribute("class");
			System.out.println(className);
			
		}

		/*	
		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // Enter Username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter Password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click Submit
		
		

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); // Click on CRM/SFA

		driver.findElement(By.linkText("Contacts")).click(); // Click on Contacts Tab

		driver.findElement(By.linkText("Merge Contacts")).click(); // Click on Merge Contacts

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		*/
		
	}

}

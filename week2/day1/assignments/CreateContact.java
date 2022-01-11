package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leaftaps.com/opentaps/"); // Open URL
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 

		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // Enter Username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter Password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click Submit

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); // Click on CRM/SFA

		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		
		driver.findElement(By.linkText("Contacts")).click(); // Click on Contacts Tab
		
		driver.findElement(By.linkText("Create Contact")).click(); // Click on Create Contact
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		
		String firstName = "Santhosh";
		
		driver.findElement(By.id("firstNameField")).sendKeys(firstName);
		driver.findElement(By.id("lastNameField")).sendKeys("M R");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(firstName);
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}

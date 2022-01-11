package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launching URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the Window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement((By.xpath("//input[@id='firstNameField']"))).sendKeys("Venba");
		driver.findElement(By.xpath(("//input[@id='lastNameField']"))).sendKeys("GR");
		driver.findElement((By.xpath("//input[@name='submitButton']"))).click();
		System.out.println("First Name is :" + " "+ driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText());
		System.out.println("Page Title is :" + " " + driver.getTitle());
		driver.close();



	}

}

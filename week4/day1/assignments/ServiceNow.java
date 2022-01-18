package week4.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://dev57814.service-now.com/navpage.do");
		
		driver.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id = 'user_password']")).sendKeys("gNKIh00tbGRp");
		driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
		
		WebElement s1 = driver.findElement(By.xpath("//div[@class = 'input-group-transparent']//input[@id = 'filter']"));
		s1.sendKeys("incident");
		s1.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@id= 'sysverb_new']")).click();
		String incnum = driver.findElement(By.xpath("//input[@id= 'incident.number']")).getText();
		System.out.println(incnum);
		driver.findElement(By.xpath("//input[@id= 'incident.short_description']")).sendKeys("Just a Trial work");
		driver.findElement(By.xpath("//button[@id= 'sysverb_insert']")).click();
		
		WebElement s2 = driver.findElement(By.xpath("//div[@class = 'input-group']/input[@placeholder= 'Search']"));
		s2.sendKeys(incnum);
		s1.sendKeys(Keys.ENTER);
		
		String num = driver.findElement(By.xpath("//table[@id = 'incident_table']//tr[1]/td[3]")).getText();

		if(incnum ==num) {
			System.out.println("The incident is created successfully");
		} else {
			System.out.println("The incident is not created");
		}
		
	}

}

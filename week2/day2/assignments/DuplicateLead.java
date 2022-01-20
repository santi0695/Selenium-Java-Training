package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	@SuppressWarnings("deprecation")
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
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); // Click on Leads button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();  //Click on Find Leads button
		driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']//tr[1]/td[1]/div/a")).click(); //Click on first resulting link
		String name1 = driver.findElement(By.xpath("//span[@id = 'viewLead_firstName_sp']")).getText(); //Get the name of first lead 
		System.out.println(name1);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click(); //Click on Duplicate Lead
		
		String a = driver.getTitle(); // 
		System.out.println(a);
		
		if (a.contains("Duplicate")){
			System.out.println("The Title of the page Duplicate Lead is verified");
		} else {
			System.out.println("The Title of the page Duplicate Lead is not verified");
		}
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click(); //Click on Create Lead
		String name2 = driver.findElement(By.xpath("//span[@id = 'viewLead_firstName_sp']")).getText(); //Get the name of duplicated lead
		System.out.println(name2);
		
		if(name1 == name2) {
			System.out.println("The Names are the same");
		} else {
			System.out.println("The Names are not the same");
		}
		
		driver.close();
	}

}

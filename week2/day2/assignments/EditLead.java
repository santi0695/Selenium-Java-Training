package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("//a[text()='Edit']")).click(); //Click on Edit Lead
		String a = "MindTech";
		WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));// Change the Company name
		companyName.clear();
		companyName.sendKeys(a);
		driver.findElement(By.xpath("//input[@value='Update']")).click(); // Click on update
		String s = driver.findElement(By.xpath("//span[@id = 'viewLead_companyName_sp']")).getText();
		
		if(s.contains(a)) {
			System.out.println("The Company Name has been changed");
		} else {
			System.out.println("The Company name has not been changed");
		}
		
		driver.close();
	}
		
	

}

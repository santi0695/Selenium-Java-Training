package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); // Click on Leads button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();  //Click on Find Leads button
		
		//Find by Phone Number
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		
		
		WebElement leadID = driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']//tr[1]/td[1]/div/a[@class = 'linktext']")); //Click on first resulting link
		String lead = leadID.getText();
		System.out.println(lead);
		leadID.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click(); //Click on Delete Lead
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();  //Click on Find Leads button
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
		String msg = driver.findElement(By.xpath("//div[@class = 'x-paging-info']")).getText();
		
		if (msg.contains("No records to display")) {
			System.out.println("The Lead has been deleted");
		} else {
			System.out.println("The Lead has not been deleted");
		}
		
	}

}

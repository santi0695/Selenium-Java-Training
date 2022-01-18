package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoCSR"); // Enter Username
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // Enter Password
		driver.findElement(By.className("decorativeSubmit")).click(); // Click Submit

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); // Click on CRM/SFA

		driver.findElement(By.xpath("//div/a[text()='Contacts']")).click(); // Click on Contacts Tab

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click(); // Click on Merge Contacts

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[1]/td[2]/a/img")).click();  //Click on From Popup
				
		Set<String> s = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(s);
		String c1 = l.get(1);
		driver.switchTo().window(c1);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a")).click();
		
		Set<String> s1 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(s1);
		driver.switchTo().window(l1.get(0));
		//driver.switchTo().window(c.get(0));
		
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tr[2]/td[2]/a/img")).click();
		Set<String> s2 = driver.getWindowHandles();
		List<String> l2 = new ArrayList<String>(s2);
		driver.switchTo().window(l2.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a)[2]")).click();
		
		Set<String> s3 = driver.getWindowHandles();
		List<String> l3 = new ArrayList<String>(s3);
		driver.switchTo().window(l3.get(0));
		//driver.switchTo().window(c.get(0));
				
	
		driver.findElement(By.xpath("//table[@class = 'twoColumnForm']//tr/td/a[contains(text(),'Merge')]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("View Contact")) {
			System.out.println("The Title is verified and the Contacts are merged");
		} else {
			System.out.println("The Contacts are not merged due to mismatch");
		}

		driver.close();
	}

}

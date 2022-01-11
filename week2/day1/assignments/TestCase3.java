package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("WIPRO");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ganapathy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("B");
		WebElement ss = driver.findElement((By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		Select dropdown = new Select(ss);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("10/07/1989");
		driver.findElement((By.xpath("//input[@name='primaryPhoneCountryCode']"))).sendKeys("+91");
		driver.findElement((By.xpath("//input[@name='primaryEmail']"))).sendKeys("g.pathy.bit@gmail.com");
		driver.findElement((By.xpath("//input[@name='primaryPhoneNumber']"))).sendKeys("9677911238");
		driver.findElement((By.xpath("//input[@name='generalAddress1']"))).sendKeys("1/776 Saivaperavai Nager");
		driver.findElement((By.xpath("//input[@name='generalAddress2']"))).sendKeys("Dharapuram Road");
		driver.findElement((By.xpath("//input[@name='generalCity']"))).sendKeys("Tiruppur");
		WebElement country = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select cc = new Select(country);
		cc.selectByValue("IND");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select sss = new Select(state);
		sss.selectByValue("IN-TN");
		driver.findElement(By.xpath("//input[@name='generalPostalCode']")).sendKeys("641605");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Lead First Name is : "
				+ driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText());
		String title = driver.getTitle();
		if (title == "View Lead") {
			System.out.println("Page Title is Successfully Validated");
			System.out.println("PAge Title is :" + title);
		} else {
			System.out.println("Page Title is Incorrect");
			System.out.println("Correct Page Title is :" + title);
		}
		driver.close();
	}

}
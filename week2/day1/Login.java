package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//Setup the Driver
		
		    //using web driver manager
		    WebDriverManager.chromedriver().setup();
		    //WebDriverManager.firefoxdriver().setup();
		
		    //using manualdownload
		    //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");)
				
		
		//Open the Browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("http://www.leaftaps.com/opentaps/");
		//driver.get("http://www.leafground.com/home.html");
		
		
		//Get the Title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//Enter the Username
		//WebElement userName = driver.findElement(By.id("username"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("DemoCSR");
		
		//Enter the Password
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Enter Lead Details and submit
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MT1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SanthoshTest");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M R");
		
		//Select Source from Dropdown
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown = new Select(source);
		
		int size = dropdown.getOptions().size();
		dropdown.selectByIndex(size-3);
		
		//Submit
		driver.findElement(By.name("submitButton")).click();
		
		//Close the Browser
		driver.close();
	
	
	}

}
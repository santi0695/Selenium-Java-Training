package week2.day2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Santhosh");
		driver.findElement(By.name("lastname")).sendKeys("MR");
		driver.findElement(By.name("reg_email__")).sendKeys("9345352152");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mrs1995*#");
		
		WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(10));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='birthday_day']")));
		
		WebElement day = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
		Select dobday = new Select(day);
		dobday.selectByValue("8");	

		WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
		Select dobmonth = new Select(month);
		dobmonth.selectByValue("4");
	
		WebElement year = driver.findElement(By.xpath("//select[@id = 'year']"));
		Select dobyear = new Select(year);
		dobyear.selectByValue("1995");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("Account Created Successfully");
		
			
		
		
	}

}

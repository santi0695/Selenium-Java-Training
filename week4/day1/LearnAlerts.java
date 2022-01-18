package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		//Accept the Alert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		System.out.println(text);
		
		
		
		
	}

}

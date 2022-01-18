package week4.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Alert.html");

		// Alert Box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();

		// Confirm Box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		// Prompt Box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("TestLeaf");
		a3.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result1']")).getText());

		// LineBreaks
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert a4 = driver.switchTo().alert();
		System.out.println(a4.getText());
		a4.accept();

		// Sweet Alert
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();

	}

}

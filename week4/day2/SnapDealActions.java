package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealActions {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();

		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com/");
		
		Actions action = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement men = driver.findElement(By.xpath("//span[text() = \"Men's Fashion\"]"));
			
		action.moveToElement(men).pause(1000).perform();
		
		WebElement shirt = driver.findElement(By.xpath("//span[text() = 'Shirts']"));
		
		action.moveToElement(shirt).click(shirt).perform();
					
		WebElement firstshirt = driver.findElement(By.xpath("//div[contains(@class = 'product-tuple-image')][1]"));
		WebElement quickview = driver.findElement(By.xpath("//div[contains(@class = 'clearfix row-disc')][1]"));
		
		action.moveToElement(firstshirt).pause(1000).click(quickview).perform();
		
	}

}

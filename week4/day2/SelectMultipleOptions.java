package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleOptions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		driver.findElement(By.xpath("//option[text()='Select your programs']")).click();
		WebElement selenium = driver.findElement(By.xpath("(//option[text() = 'Selenium'])[6]"));
		WebElement loadrunner = driver.findElement(By.xpath("(//option[text() = 'Loadrunner'])[6]"));
		
		action.keyDown(Keys.CONTROL).click(selenium).click(loadrunner).keyUp(Keys.CONTROL).perform();
		
		

	}

}

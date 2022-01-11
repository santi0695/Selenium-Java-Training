package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/Dropdown.html");
		
		//Locate the Element with Select Tag in URL
		WebElement dd = driver.findElement(By.id("dropdown1"));
		
		//Create Element for Select Class
		Select s = new Select(dd);
		
		//Select from dropdown using the created object s
		
		s.selectByVisibleText("Appium");
		
		s.selectByValue("3");
		
		int size = s.getOptions().size();
		s.selectByIndex(size-1);
		
		
	}

}

package week4.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTestLeafPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		//I am inside a Frame
		driver.switchTo().frame(0);
		WebElement a = driver.findElement(By.xpath("//button[@id = 'Click']"));
		a.click();
		System.out.println(a.getText());
		driver.switchTo().defaultContent();
		
		//I am inside a nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement b = driver.findElement(By.xpath("//button[@id = 'Click1']"));
		b.click();
		System.out.println(b.getText());
		driver.switchTo().defaultContent();
		
		//Find total number of frames
		int framesize = driver.findElements(By.tagName("iframe")).size();
		System.out.println("There are "+framesize+" frames in this page");
		

	}

}

package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	@SuppressWarnings("deprecation")
	
	
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Window.html");
		
		String windowpage = driver.getWindowHandle();
		
		//Open Home Page in new window		
		driver.findElement(By.xpath("//button[@id ='home']")).click();
		Set<String> w1 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(w1);
		driver.switchTo().window(l1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(windowpage);
		System.out.println("Open Home Page in new Window - Completed");
		
		//Find the number of opened windows
		driver.findElement(By.xpath("//button[text() ='Open Multiple Windows']")).click();
		Set<String> set1 = driver.getWindowHandles();
		List<String> l2 = new ArrayList<String>(set1);
		String win2 = l2.get(1);
		String win3 = l2.get(2);
		System.out.println("The Number of Open Windows is "+l2.size());
		driver.switchTo().window(win2).close();
		driver.switchTo().window(win3).close();
		System.out.println("All the Pop up Windows are Closed");
		
		driver.switchTo().window(windowpage);
		System.out.println("Find the number of opened windows - Completed");
	
		//Close all except this window
		driver.findElement(By.xpath("//button[contains(text(),'Do not close me')]")).click();
		Set<String> set2 = driver.getWindowHandles();
		List<String> l3 = new ArrayList<String>(set2);
		String w2 = l3.get(1);
		String w3 = l3.get(2);
		driver.switchTo().window(w2).close();
		driver.switchTo().window(w3).close();
		System.out.println("All the Pop up Windows are Closed");
		
		driver.switchTo().window(windowpage);
		System.out.println("Close all except this window - Completed");
		
		
		//Wait for 2 new Windows to open
		driver.findElement(By.xpath("//button[contains(text(),'Wait for 5 seconds')]")).click();
		Thread.sleep(10000);
		Set<String> set3 = driver.getWindowHandles();
		List<String> l4 = new ArrayList<String>(set3);
		String wi2 = l4.get(1);
		String wi3 = l4.get(2);
		driver.switchTo().window(wi2).close();
		driver.switchTo().window(wi3).close();
		System.out.println("All the Pop up Windows are Closed");
		
		driver.switchTo().window(windowpage);
		System.out.println("Wait for 2 new Windows to open - Completed");

	}

}

package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcWindowHandles {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver.findElement(By.xpath("//button[text() = 'OK']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"slide-menu\"]/p-sidebar/div/nav/ul/li[5]/a/label")).click();

		Set<String> windowhandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowhandles);

		String flights = windows.get(1);
		driver.switchTo().window(flights);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.switchTo().window(windows.get(0));
		driver.close();
		
		
		
		

	}

}

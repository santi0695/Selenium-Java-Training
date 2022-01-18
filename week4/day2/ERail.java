package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement from = driver.findElement(By.xpath("//input[contains(@id,'txtStationFrom')]"));
		from.clear();
		from.sendKeys("MS");
		from.sendKeys(Keys.RETURN);
		
		WebElement to = driver.findElement(By.xpath("//input[contains(@id,'txtStationTo')]"));
		to.clear();
		to.sendKeys("MDU");
		to.sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
		
		int rowSize = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr")).size();
		List<String> trainnames = new ArrayList<String>();
		
		for (int i=1;i<=rowSize;i++) {
		String text = driver.findElement(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']//tr["+ i +"]/td[2]")).getText();
		trainnames.add(text);
		
	}

		Set<String> s = new HashSet<String>(trainnames);
		
		if(trainnames.size() == s.size()) {
			System.out.println("There are no duplicates");
		} else {
			System.out.println("There are duplicates");
		}
		
		
		
	}
	}

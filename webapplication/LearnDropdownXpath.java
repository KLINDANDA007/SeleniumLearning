package webapplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropdownXpath {

	public static void main(String[] args) throws InterruptedException {
		
		// set up chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// Get the url
		driver.get("https://www.leafground.com/select.xhtml");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// waits 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000); 
		
		// Select the element
		driver.findElement(By.xpath("(//select)[1]")).sendKeys("Playwright");
		
		// Select the element
		driver.findElement(By.xpath("//label[text()='Select Country']")).sendKeys("India");

	}

}

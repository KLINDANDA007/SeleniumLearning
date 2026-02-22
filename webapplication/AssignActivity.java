package webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignActivity {

	public static void main(String[] args) {
		
		// set up chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// get the applicaion url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the window
		driver.manage().window().maximize();
		
		// find element username
		WebElement username = driver.findElement(By.id("username"));
		
		// enter values
		username.sendKeys("Demosalesmanager");
		
		// find the element password
		WebElement password = driver.findElement(By.id("password"));
		
		// enter values
		password.sendKeys("crmsfa");
		
		// find element login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// find element link CRM
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// find element of leads
		driver.findElement(By.linkText("Leads")).click();
	}

}

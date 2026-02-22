package webapplication;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		// set up chromedriver
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// STEP : 1 set up chromedriver
		//WebDriverManger.chromedriver().setup();
		
		// STEP : 2 open Chrome browser - create  an object for ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		// STEP : 3 load the application url
		driver.get("https://bssstmobileapp.plintron.com/");
		
		// STEP : 4 To maximize the chrome window
		driver.manage().window().maximize(); // maximize the window
		
		//driver.manage().window().minimize(); // minimizing window
		
		// STEP : 5 To locate the username text field
		WebElement username = driver.findElement(By.id("UserName"));
		
		// STEP : 6 To Enter/type value in username
		username.sendKeys("retita4");
		
		// STEP : 7 To locate password text field
		WebElement password = driver.findElement(By.id("Password"));
		
		//driver.findElement(By.name("")); if there is no id present for the specified field go with the name
		
		// STEP : 8 To Enter/type value in password
		password.sendKeys("1");
		
		// STEP : 9 To select the Login button using name
		driver.findElement(By.name("LoginButton")).click();
		
		// Java wait
		//Thread.sleep();
		
		// STEP : 10 Create WebDriverWait with 10 seconds timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // STEP : 11 Use explicit wait with locator
        WebElement Field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ContentPlaceHolder1_btnOkBusiness")));

		// STEP : 12 to select the ok on the pop-up
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOkBusiness")).click();
		
		
		// STEP :  To close the current window
		//driver.close();

	}

}

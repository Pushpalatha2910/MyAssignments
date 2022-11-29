package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
        driver.findElement(By.linkText("Contacts")).click();
        
        driver.findElement(By.linkText("Create Contact")).click();
        
        driver.findElement(By.id("firstNameField")).sendKeys("Pushpalatha");
        
        driver.findElement(By.id("lastNameField")).sendKeys("Venkatesan");
		
	    driver.findElement(By.name("submitButton"))	.click();
	    
	    String firstname = "Pushpalatha";
	    		System.out.println(firstname);
	    		
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.close();
	    
		
				
	}

}

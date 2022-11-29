package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.support.FindElementBy;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//5);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pushpalatha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesan");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pushpalatha V");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Execute sample Test scripts");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pushpalatha2910@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		
				
				
	}   

}

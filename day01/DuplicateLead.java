package Week2.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.support.FindElementBy;

public class DuplicateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pushpalatha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkatesan");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pushpalatha");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Execute sample Test scripts");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pushpalatha2910@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pushpa");
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		
		driver.findElement(By.className("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
	
		
		
		
			
		
		

	}

}

package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("bal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample demo3");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ani@gmail.com");
		WebElement ddown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel =new Select(ddown);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title is: "+driver.getTitle());
		driver.findElement(By.xpath("//a[text()=\'Duplicate Lead\']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bala123");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title1 is: "+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

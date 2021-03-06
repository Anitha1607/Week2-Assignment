package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tannu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample demo1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		WebElement ddown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel =new Select(ddown);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Best practice");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title is: "+driver.getTitle());

	}

}

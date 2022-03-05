package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tarshun");
		driver.findElement(By.id("lastNameField")).sendKeys("bala");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[8]")).sendKeys("ECE");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Hello Leaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[15]")).sendKeys("ECE@gmail.com");
		WebElement ddown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel =new Select(ddown);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[2]")).sendKeys("demo1");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		System.out.println("The title of the page:"+driver.getTitle());	
		
	
		
						
				
				

	}

}

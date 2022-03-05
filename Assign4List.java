package selnium;

import java.security.Key;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4List {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement ddown = driver.findElement(By.id("dropdown1"));
		Select sel = new Select(ddown);
		sel.selectByIndex(1);
		
		WebElement ddown1 = driver.findElement(By.name("dropdown2"));
		Select sel1 = new Select(ddown1);
		sel1.selectByVisibleText("Selenium");
		
		WebElement ddown2 = driver.findElement(By.id("dropdown3"));
		Select sel2 = new Select(ddown2);
		sel2.selectByValue("1");
		
		List<WebElement> ddown3 = driver.findElements(By.className("dropdown"));
						
		for (int i=0;i<ddown3.size();i++) {
			
			System.out.println(ddown3.get(i).getText());
			
		}
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Selenium");
		
		
		
		WebElement multisel=driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		Select sel3 = new Select(multisel);
		sel3.selectByIndex(1);
		sel3.selectByValue("4");
		
		
		}


	}



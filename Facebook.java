package selnium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tanu");
		driver.findElement(By.name("lastname")).sendKeys("sai");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("12345689");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("aaaa");
		
WebElement ddown=driver.findElement(By.id("day"));
Select sel=new Select(ddown);
sel.selectByIndex(15);
WebElement ddown1=driver.findElement(By.id("month"));
Select sel1=new Select(ddown1);
sel1.selectByIndex(2);
WebElement ddown2=driver.findElement(By.id("year"));
Select sel2=new Select(ddown2);
sel2.selectByIndex(11);
 WebElement radio=driver.findElement(By.name("sex"));
 radio.click();
 System.out.println(radio.isSelected());
 
 


 
		
		

	}

}

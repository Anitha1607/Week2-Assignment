package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//label[@for='java']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//label[@for='java']/following::input)[3]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//label[@for='java']/following::input)[6]")).isSelected());
		
       WebElement check=	driver.findElement(By.xpath("(//label[@for='java']/following::input)[8]"));
       check.click();
       System.out.println(check.isSelected());
       
       driver.findElement(By.xpath("(//label[@for='java']/following::input)[9]")).click();
       driver.findElement(By.xpath("(//label[@for='java']/following::input)[10]")).click();
       driver.findElement(By.xpath("(//label[@for='java']/following::input)[11]")).click();
       driver.findElement(By.xpath("(//label[@for='java']/following::input)[12]")).click();
       driver.findElement(By.xpath("(//label[@for='java']/following::input)[13]")).click();
	
	
	
	}

}

package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("ani",Keys.TAB);
		System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed());
		
	}

}

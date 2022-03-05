package selnium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize());

	}
	
	

}

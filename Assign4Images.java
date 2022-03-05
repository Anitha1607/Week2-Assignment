package selnium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4Images {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/pages/Image.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[1]")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[4]")).click();
		List<WebElement> imglist = driver.findElements(By.tagName("img"));
		System.out.println("no of image are:"+imglist.size());
		for(int i=0;i<imglist.size();i++) {
			
			WebElement element= imglist.get(i);
			String url=element.getAttribute("src");
			
			URL imglist1 =new URL(url);
			
			HttpURLConnection httpconn =(HttpURLConnection) imglist1.openConnection();
			
			Thread.sleep(1000);
			
			httpconn.connect();
			int rescode=httpconn.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url+" -"+ " is broken link");
			}
			else
			{
				System.out.println(url+" -"+ " is valid link");
			}
			
			
			
		}
		
		}
	
		
			
		

	}


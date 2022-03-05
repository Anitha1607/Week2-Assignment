package selnium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign4HyperLinks {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[1]")).click();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
		System.out
				.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"))
						.getAttribute("href"));
		WebElement links = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		String link2 = links.getAttribute("href");

		URL link1 = new URL(link2);

		HttpURLConnection httpcon = (HttpURLConnection) link1.openConnection();
		httpcon.connect();
		int response = httpcon.getResponseCode();
		if (response >= 400) {
			System.out.println("This is a broken link");
		} else {
			System.out.println("this is a valid link");

		}
List<WebElement> alllinks = driver.findElements(By.tagName("a"));
System.out.println("The total number of links :" +alllinks.size());

	}

}

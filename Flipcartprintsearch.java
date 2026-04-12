package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartprintsearch {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		//Thread.sleep(2000);
		element.click();
		//Thread.sleep(2000);
		element.sendKeys("Laptops");
		List<WebElement> element1=driver.findElements(By.xpath("//li[@class='Swx5kP']"));
		for(WebElement element2:element1) {
			System.out.println(element2.getText());
		}
		//Thread.sleep(20000);
}
}

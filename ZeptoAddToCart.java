package selenium_practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeptoAddToCart {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.zepto.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id=\"_r_d_--input\"]")).sendKeys("India Gate Jeera Rice | Short Grain");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id='_r_0_--input']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//span[.=\"Daawat Rozana Super Basmati Rice | Medium Grain\"]/../..//button[.=\"ADD\"]")).click();
}
}
package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartIphoneinAmazonByHYBRIDXPATH 
{
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	String p=driver.getWindowHandle();
	System.out.println(p);
	driver.findElement(By.id("nav-search-submit-button")).click();
    //Thread.sleep(5000);
    driver.findElement(By.xpath("//span[.='iPhone 17 Pro Max 256 GB: 17.42 cm (6.9″) Display with Promotion, A19 Pro Chip, Best Battery Life in Any iPhone Ever, Pro Fusion Camera System, Center Stage Front Camera; Silver']")).click();
    Set<String> s =driver.getWindowHandles();
    System.out.println(s);
    for(String w:s)
    {if(!w.equals(p))
    {driver.switchTo().window(w);}
	}
    System.out.println(driver.getWindowHandle());
    driver.findElement(By.linkText("Add to cart")).click();
	}
}

package selenium_practice;

import java.time.Duration;
//import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonaddtocart {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		 Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		 Thread.sleep(5000);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	     Thread.sleep(5000);
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     //Thread.sleep(5000);
	     driver.findElement(By.xpath("//span[text()='Dell 15, 13th Gen Intel Core i5-1334U (16GB DDR4, 512GB SSD) Anti-Glare FHD 15.6\"/39.62cm, Windows 11, Microsoft Office Home 2024, Grey, 1.66kg, [Vostro 3530], 12 Month McAfee, Thin & Light Laptop']")).click();
	     String Parentid = driver.getWindowHandle();
	 	System.out.println("parentid "+ Parentid);
	 	Set<String> tabsid = driver.getWindowHandles();
	 	System.out.println(tabsid);
	 	tabsid.remove(Parentid);
	 	System.out.println(tabsid);
	 	for(String tabsid1:tabsid) {
	 		driver.switchTo().window(tabsid1);
	 		System.out.println(driver.getCurrentUrl());
	 		Thread.sleep(1000);
	 		String title = driver.getTitle();
	 		System.out.println(title);
	 		 driver.findElement(By.name("submit.add-to-cart")).click();
	 		Thread.sleep(2000);
	 		}
	 	driver.switchTo().window(Parentid);
	 	}

	     /*driver.findElement(By.xpath("//span[text()=")).click();
	     String parent = driver.getWindowHandle();
	     for (String window : driver.getWindowHandles()) {
	         if (!window.equals(parent)) {
	             driver.switchTo().window(window);
	         }
	     }
	     //Thread.sleep(9000);
	     driver.findElement(By.name("submit.add-to-cart")).click();*/
}


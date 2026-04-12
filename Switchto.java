package selenium_practice;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Facebook")).click();
	driver.findElement(By.linkText("Twitter")).click();
	driver.findElement(By.linkText("YouTube")).click();
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
		Thread.sleep(2000);
		if (title.equals("NopCommerce | Facebook")) {//&& title.equals("Tricentis - YouTube"
			driver.close();
		}
	}
	driver.switchTo().window(Parentid);
}
}

package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twogetmethods {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	System.out.println(driver.getWindowHandles());
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.Flipkart.com");
	driver.switchTo().defaultContent();
	System.out.println(driver.getWindowHandle());
	Thread.sleep(2000);
	//driver.close();
}
}

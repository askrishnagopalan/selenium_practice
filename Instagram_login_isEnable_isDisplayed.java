package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login_isEnable_isDisplayed {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(2000);
	WebElement loginbutton=driver.findElement(By.xpath("//div[@aria-label='Log In']"));
	System.out.println("BEFORE ENTERING DATA");
	System.out.println("ISENABALED:"+loginbutton.isEnabled());
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashnegsy@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ashnegsy@123456789");
	System.out.println("AFTER ENTERING DATA");
	System.out.println("ISENABALED:"+loginbutton.isEnabled());
	driver.close();
}
}

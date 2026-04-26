package selenium_Dropdown;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_dropdown_using_robot_class {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		WebElement day =driver.findElement(By.xpath("//div[@aria-label=\"Select day\"]//..//../..//div[@class=\"x6s0dn4 x78zum5 x14ju556 x13fj5qh x1el4u5y\"]"));
		day.click();
		Robot robo=new Robot();
		for(int i=0;i<3;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		WebElement Month =driver.findElement(By.xpath("//div[@aria-label=\"Select month\"]//..//../..//div[@class=\"x6s0dn4 x78zum5 x14ju556 x13fj5qh x1el4u5y\"]"));
		Month.click();
		for(int i=0;i<9;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		WebElement Year =driver.findElement(By.xpath("//div[@aria-label=\"Select year\"]//..//../..//div[@class=\"x6s0dn4 x78zum5 x14ju556 x13fj5qh x1el4u5y\"]"));
		Year.click();
		for(int i=0;i<29;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span[.=\"Select your gender\"]//..//../..//div[@class=\"x6s0dn4 x78zum5 x14ju556 x13fj5qh x1el4u5y\"]")).click();
		for(int i=0;i<2;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}

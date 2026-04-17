package selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_logindop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup");
		Thread.sleep(2000);
		WebElement day =driver.findElement(By.xpath("//select[@aria-label='Day']"));
		day.click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_3);
		robo.keyRelease(KeyEvent.VK_3);
		robo.keyPress(KeyEvent.VK_3);
		robo.keyRelease(KeyEvent.VK_3);
		robo.keyPress(KeyEvent.VK_3);
		robo.keyRelease(KeyEvent.VK_3);
		WebElement Month =driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Month.click();
		Robot robo1=new Robot();
		robo1.keyPress(KeyEvent.VK_S);
		robo1.keyRelease(KeyEvent.VK_S);
		WebElement Year =driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Year.click();
		Robot robo2=new Robot();
		robo2.keyPress(KeyEvent.VK_1);
		robo2.keyRelease(KeyEvent.VK_1);
		robo2.keyPress(KeyEvent.VK_9);
		robo2.keyRelease(KeyEvent.VK_9);
		robo2.keyPress(KeyEvent.VK_9);
		robo2.keyRelease(KeyEvent.VK_9);
		robo2.keyPress(KeyEvent.VK_8);
		robo2.keyRelease(KeyEvent.VK_8);
		driver.findElement(By.xpath("//label[.='Male']")).click();
		
		
		
	}
}

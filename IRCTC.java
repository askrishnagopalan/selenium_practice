package selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Thread.sleep(2000);
	Robot robo= new Robot();
	robo.keyPress(KeyEvent.VK_ESCAPE);
	robo.keyRelease(KeyEvent.VK_ESCAPE);
	}
}

package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAxes {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id='icp-nav-flyout']/following-sibling::div[@id='nav-link-accountList']")).click();
	}
}

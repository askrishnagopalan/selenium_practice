package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.id(":r0:")).sendKeys("askrishnagopalan@gmail.com");
		driver.findElement(By.partialLinkText("Get Started")).click();
	}
}

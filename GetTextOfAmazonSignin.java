package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfAmazonSignin {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement a123 =driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		System.out.println("getText="+a123.getText());
		System.out.println("getAltribute"+a123.getAttribute("class"));
		System.out.println("getCssValue="+a123.getCssValue("background"));
}
}
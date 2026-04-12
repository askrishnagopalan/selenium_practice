package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsInDemoWedShop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement aaa1 =driver.findElement(By.className("ico-register"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(aaa1)).sendKeys("laptop");
		driver.findElement(By.tagName("type=submit")).click();
	}
}

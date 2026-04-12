package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopGetCSSVALUE {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement aa123=driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
		System.out.println("before sendkeys domAltribute:"+aa123.getDomAttribute("value"));
		System.out.println("before sendkeys domProperty :"+aa123.getDomProperty("value"));
		aa123.sendKeys("mobiles");
		System.out.println("*************************************************************");
		System.out.println("after sendkeys domAltribute:"+aa123.getDomAttribute("value"));
		System.out.println("after sendkeys domProperty :"+aa123.getDomProperty("value"));
	}
}

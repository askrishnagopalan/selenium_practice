package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement button=driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		System.out.println("BEFORE ENTERING DATA");
		System.out.println("before click:"+button.isEnabled());
		button.click();
		System.out.println("AFTER ENTERING DATA");
		System.out.println("after click:"+button.isEnabled());
		driver.close();
	}
}

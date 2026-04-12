package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodSubmitClear {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com/in/");
		WebElement a = driver.findElement(By.id(":r0:"));
		a.sendKeys("askrishnagopalan@gmail.com");
		Thread.sleep(2000);
		for(int i=0; i<22; i++) {
		    a.sendKeys(Keys.BACK_SPACE);
		}
		/*a.sendKeys(Keys.CONTROL + "a");
		a.sendKeys(Keys.DELETE);*/
		//a.clear();
		Thread.sleep(2000);
		a.sendKeys("hackeraskg@gmail.com");
		a.submit();
		}
}

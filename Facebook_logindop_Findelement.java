package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_logindop_Findelement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement day =driver.findElement(By.id("_r_3_"));
		day.click();
		for(int i=0;i<3;i++) {
			day.sendKeys(Keys.ARROW_DOWN);
		}
		day.sendKeys(Keys.ENTER);
		WebElement Month =driver.findElement(By.id("_r_9_"));
		Month.click();
		for(int i=0;i<9;i++) {
			Month.sendKeys(Keys.ARROW_DOWN);
		}
		Month.sendKeys(Keys.ENTER);
		WebElement Year =driver.findElement(By.id("_r_f_"));
		Year.click();
		for(int i=0;i<28;i++) {
			Year.sendKeys(Keys.ARROW_DOWN);
		}
		Year.sendKeys(Keys.ENTER);
	}
}

package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Business_Facebook_logindop_Findelement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup");
		WebElement day =driver.findElement(By.xpath("//select[@aria-label='Day']"));
		day.click();
		for(int i=0;i<21;i++) {
			day.sendKeys(Keys.ARROW_UP);
		}
		day.sendKeys(Keys.ENTER);
		WebElement Month =driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Month.click();
		for(int j=0;j<5;j++) {
			Month.sendKeys(Keys.ARROW_DOWN);
			}
		Month.sendKeys(Keys.ENTER);
		WebElement Year =driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Year.click();
		for(int k=0;k<28;k++) {
			Year.sendKeys(Keys.ARROW_DOWN);
			}
		Year.sendKeys(Keys.ENTER);
	}
}

package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Business_Facebook_logindop_Select_By_Value {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup");
		Thread.sleep(2000);
		WebElement day =driver.findElement(By.id("day"));
		day.click();
		Select DAY= new Select(day);
		DAY.selectByValue("3");
		WebElement Month =driver.findElement(By.id("month"));
		Month.click();
		Select MONTH= new Select(Month);
		MONTH.selectByValue("9");
		WebElement Year =driver.findElement(By.id("year"));
		Year.click();
		Select YEAR= new Select(Year);
		YEAR.selectByValue("1998");
		
	}
}

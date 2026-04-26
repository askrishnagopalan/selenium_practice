package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Business_Facebook_logindop_Javascript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup");
		Thread.sleep(500);
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		WebElement Gender=driver.findElement(By.xpath("//label[.='Male']"));
		//Gender.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='3'", day);//explain this line
		js.executeScript("arguments[0].value='9'", month);//explain this line
		js.executeScript("arguments[0].value='1998'", year);//explain this line
		js.executeScript("arguments[0].click()", Gender);
	}
}

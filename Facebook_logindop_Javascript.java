package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_logindop_Javascript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		Thread.sleep(2000);
		WebElement day =driver.findElement(By.xpath("//div[@aria-label=\"Select day\"]"));
		WebElement Month =driver.findElement(By.xpath("//div[@aria-label=\"Select month\"]"));
		WebElement Year =driver.findElement(By.xpath("//div[@aria-label=\"Select year\"]"));
		//day.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		day.click();
		js.executeScript("arguments[0].value='3'", day);//explain this line
		Month.click();
		js.executeScript("arguments[0].value='9'", Month);//explain this line
		Year.click();
		js.executeScript("arguments[0].value='1998'", Year);//explain this line
		
	}
	}
	


package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c2785778308-3 icon-cancel\"]")).click();
		driver.findElement(By.xpath("//input[@aria-label='User ID']")).sendKeys("abcde");
		WebElement pass=driver.findElement(By.xpath("//input[@aria-label='PASSWORD']"));
		WebElement show=driver.findElement(By.xpath("//button[@tabindex='0']"));
		pass.sendKeys("abcde");
		Thread.sleep(8000);
		//show.click();
		Actions PASSHOLD= new Actions(driver);
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
		PASSHOLD.clickAndHold(show).perform();
		PASSHOLD.release(show).perform();}
	}
}

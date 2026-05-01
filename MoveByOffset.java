package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		Thread.sleep(8000);
		WebElement More=driver.findElement(By.xpath("//span[.='More']"));
		Actions MORE= new Actions(driver);
		MORE.moveToElement(More).perform();
		//MORE.moveByOffset(1133, 230).perform();.MoveTargetOutOfBoundsException
		//reason 1133-1176=40,230-95
		Thread.sleep(9000);
		MORE.moveByOffset(-40,135).perform();
	}
}

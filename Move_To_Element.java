package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {
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
	}
}

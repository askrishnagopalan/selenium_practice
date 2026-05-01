package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(2000);
		WebElement rightclick=driver.findElement(By.id("rightBtn"));
		WebElement copy=driver.findElement(By.xpath("//button[.='Copy']"));
		Actions RIGHTCLICK=new Actions(driver);
		RIGHTCLICK.contextClick(rightclick).perform();
		Thread.sleep(2000);
		RIGHTCLICK.click(copy).perform();
	}

}

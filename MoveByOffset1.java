package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(2000);
		WebElement Demosites=driver.findElement(By.linkText("Demo Sites"));
		Actions DEMO= new Actions(driver);
		DEMO.moveToElement(Demosites).perform();
		DEMO.moveToLocation(1241, 154).perform();
		DEMO.moveToLocation(1048, 290).perform();
	}
}

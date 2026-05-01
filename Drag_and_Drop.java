package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(2000);
		WebElement Drag=driver.findElement(By.id("dragItem"));
		WebElement Drop=driver.findElement(By.id("dropZone"));
		Actions DRAG= new Actions(driver);
		DRAG.scrollByAmount(10, 550).perform();
		DRAG.dragAndDrop(Drag, Drop).perform();
		
	}
}

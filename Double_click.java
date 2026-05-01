package selenium_action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		Thread.sleep(2000);
		WebElement DoubleClick=driver.findElement(By.id("doubleBtn"));
		Actions DOUBLECLICK=new Actions(driver);
		DOUBLECLICK.doubleClick(DoubleClick).perform();
	}
}

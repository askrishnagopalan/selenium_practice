package selenium_practice;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mouse_pointer {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		 WebElement account = driver.findElement(By.id("nav-link-accountList"));
		org.openqa.selenium.Point p = account.getLocation();

        int x = p.getX();
        int y = p.getY();
        System.out.println(x);
        System.out.println(y);
		Robot robo=new Robot();
		robo.mouseMove(1197,150);
		
	}

}

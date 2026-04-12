package selenium_practice;
//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Launchbrowser {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	// driver.manage().window().fullscreen();
	// Thread.sleep(3000);
	 System.out.println(driver.manage().window().getSize());
	 System.out.println(driver.getTitle());
	 Thread.sleep(3000);
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
     Thread.sleep(3000);
     driver.findElement(By.id("nav-search-submit-button")).click();
	// driver.findElement(By.linkText("Facebook")).click();
	 Thread.sleep(3000);
	 String Parentwindowhandler =driver.getWindowHandle();
	 System.out.println(Parentwindowhandler);
	 Set<String> windowhandleres =driver.getWindowHandles();
	 System.out.println(windowhandleres);
	 driver.close();
	 Thread.sleep(1000);
	 driver.quit();
	}

}


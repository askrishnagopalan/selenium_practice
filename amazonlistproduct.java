package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class amazonlistproduct {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	 Thread.sleep(3000);
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
     Thread.sleep(3000);
     driver.findElement(By.id("nav-search-submit-button")).click();
	//find tag names
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(WebElement pageLink:links) {
		System.out.println(pageLink.getText());
	}
}
}

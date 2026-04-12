package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorOfIphone {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(8000);
		WebElement searcha = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("beforesearch:"+searcha.getDomProperty("value"));
		Thread.sleep(8000);
		searcha.sendKeys("iphone");
		System.out.println("aftersearch:"+searcha.getDomProperty("value"));
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(8000);
		List<WebElement> color =driver.findElements(By.xpath("//span[.='Apple iPhone 15, 128GB, Black - Unlocked (Renewed)']/../../../..//a[@aria-label]"));
		//List<WebElement> color =driver.findElements(By.xpath("List<WebElement> color =driver.findElements(By.xpath(\"//span[.='Apple iPhone 17 Pro, US Version, 256GB, eSIM, Cosmic Orange- Unlocked (Renewed)']/../../../../../..//a[@aria-label]"));
		//List<WebElement> color =driver.findElements(By.xpath("//span[.='Apple iPhone 17 Pro, US Version, 256GB, eSIM, Cosmic Orange- Unlocked (Renewed)']/../../../../../..//a[@aria-label]"));
		Thread.sleep(8000);
		for(WebElement pcolor:color) {
		System.out.println(pcolor.getAttribute("aria-label"));
		//System.out.println(pcolor.getDomAttribute("value"));
		//System.out.println(pcolor.getDomProperty("aria-label"));
	}
	}
}

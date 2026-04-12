package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocators {
		public static void main(String[] args)throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("don tamil song");
			driver.findElement(By.xpath("//button[@title='Search']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//yt-formatted-string[text()='Don - Jalabulajangu Video | Sivakarthikeyan | Anirudh Ravichander']")).click();
			driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
			WebElement ref =driver.findElement(By.xpath("//h1"));
			driver.findElement(RelativeLocator.with(By.tagName("video")).above(ref)).click();
			/*WebElement title = driver.findElement(By.xpath("//h1"));
            driver.findElement(with(By.tagName("video")).below(title)).click();*/
		}
		}
		//yt-formatted-string[text()="Don - Jalabulajangu Video | Sivakarthikeyan | Anirudh Ravichander"]


package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args)throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("don tamil song");
	driver.findElement(By.xpath("//button[@title='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//yt-formatted-string[text()='Don - Jalabulajangu Video | Sivakarthikeyan | Anirudh Ravichander']")).click();
	//driver.findElement(By.linkText("Don - Jalabulajangu Video | Sivakarthikeyan | Anirudh Ravichander")).click();;
}
}
//yt-formatted-string[text()="Don - Jalabulajangu Video | Sivakarthikeyan | Anirudh Ravichander"]
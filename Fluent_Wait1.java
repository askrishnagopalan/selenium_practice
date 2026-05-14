package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("dude song");
	driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	WebElement song = wait.until(driver1 ->
	driver1.findElement(By.xpath("//yt-formatted-string[.='Oorum Blood | Dude | Pradeep Ranganathan, Mamitha | Sai Abhyankkar| Keerthiswaran|Paal Dabba| Mythri']")));
	song.click();
}
}
package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Sleep {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(9000);
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("dude song");
	Thread.sleep(9000);
	driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath("//yt-formatted-string[.='Oorum Blood | Dude | Pradeep Ranganathan, Mamitha | Sai Abhyankkar| Keerthiswaran|Paal Dabba| Mythri']")).click();
	Thread.sleep(9000);
	driver.quit();
	}
}


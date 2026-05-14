package synchronization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicit_Wait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("dude song");
	driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
	driver.findElement(By.xpath("//yt-formatted-string[.='Oorum Blood | Dude | Pradeep Ranganathan, Mamitha | Sai Abhyankkar| Keerthiswaran|Paal Dabba| Mythri']")).click();
    }
}

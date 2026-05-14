package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("dude song");
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		driver.findElement(By.xpath("//yt-formatted-string[.='Oorum Blood | Dude | Pradeep Ranganathan, Mamitha | Sai Abhyankkar| Keerthiswaran|Paal Dabba| Mythri']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		try{
			WebElement skip=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ytp-skip-ad-button')]")));
			skip.click();
			System.out.println("SKIP IS CLICKED");
			}
			    catch(Exception e){
			    System.out.println("NO ADD IS CAME ENJOY");
			                      }
		try {
		    WebElement nothanks=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='No thanks']")));
			nothanks.click();
			System.out.println("YT THANKS");
		     }
		        catch(Exception c){
			    System.out.println("YT NO THANKS");
		                          }
		try{
		    WebElement skip=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ytp-skip-ad-button')]")));
		    skip.click();
		    System.out.println("SKIP IS CLICKED");
		   }
		       catch(Exception e){
			   System.out.println("NO ADD IS CAME ENJOY");
		                         }
		try {
			 WebElement nothanks=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='No thanks']")));
		     nothanks.click();
			 System.out.println("YT THANKS");
			}
			    catch(Exception c){
				System.out.println("YT NO THANKS");
			                      }
	}
}

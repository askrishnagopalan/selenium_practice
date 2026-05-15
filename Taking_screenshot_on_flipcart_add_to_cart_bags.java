package takingscreenshots;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taking_screenshot_on_flipcart_add_to_cart_bags {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://www.flipkart.com/");
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
	String timestamp = now.format(format);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File temp4=ts.getScreenshotAs(OutputType.FILE);
	File per4=new File("./ScreenShots/flipcarthome"+timestamp+".png");
	FileHandler.copy(temp4, per4);
	driver.findElement(By.xpath("//span[.='✕']")).click();
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File per=new File("./ScreenShots/flipcarthome"+timestamp+".png");
	FileHandler.copy(temp, per);
	WebElement search=driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]"));
	search.click();
	search.sendKeys("bags");
	File temp1=ts.getScreenshotAs(OutputType.FILE);
	File per1=new File("./ScreenShots/flipcartsearch"+timestamp+".png");
	FileHandler.copy(temp1, per1);
	search.sendKeys(Keys.ENTER);
	List<WebElement> products = driver.findElements(By.xpath("//a[@class='CIaYa1']"));
	for(int i=0;i<products.size();i++) {
			if(i<3)
			{
				products.get(i).click();
				Thread.sleep(5000);
		}
	}
	String Parentid = driver.getWindowHandle();
	System.out.println("parentid "+ Parentid);
	Set<String>Windowsid=driver.getWindowHandles();
	Windowsid.remove(Parentid);
	System.out.println(Windowsid);
		for(String windowsid:Windowsid) {
			driver.switchTo().window(windowsid);
			Thread.sleep(4000);
			File temp5=ts.getScreenshotAs(OutputType.FILE);
			File per5=new File("./ScreenShots/flipcartswithto"+windowsid+timestamp+".png");
			FileHandler.copy(temp5, per5);
			Thread.sleep(4000);
			try {
			driver.findElement(By.xpath("//div[.='Add to cart']")).click();}
			catch (Exception e) {
				System.out.println("EMI option is only visiable");
			}
			Thread.sleep(4000);
			WebElement cart=driver.findElement(By.xpath("//a[@title='Cart']"));
			File temp3=cart.getScreenshotAs(OutputType.FILE);
			File per3=new File("./ScreenShots/flipcartcart"+windowsid+timestamp+".png");
			FileHandler.copy(temp3, per3);
		}
		driver.switchTo().window(Parentid);
}
}

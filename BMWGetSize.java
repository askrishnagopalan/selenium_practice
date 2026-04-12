package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMWGetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bmw.in/en/index.html");
	WebElement Discoverbutton=driver.findElement(By.xpath("//A[@id='button-109c9c4af7']"));
	//System.out.println("get"+Discoverbutton.get);
	System.out.println("getSize    :"+Discoverbutton.getSize());
	System.out.println("getLocation:"+Discoverbutton.getLocation());
	System.out.println("getRect    :"+Discoverbutton.getRect().getDimension());
	System.out.println("getRectX   :"+Discoverbutton.getRect().getPoint().getX());
	System.out.println("getRectY   :"+Discoverbutton.getRect().getPoint().getY());
	System.out.println("getRectHASHCODE:"+Discoverbutton.getRect().getPoint().hashCode());
	driver.close();
}
}

package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddLast5product {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(5000);
	List<WebElement> Product= driver.findElements(By.xpath("//BUTTON[.='Add to cart']"));
	int Psize=Product.size();
	System.out.println(Psize);
	for(int i=Psize-5;i<=Psize;i++)
		Product.get(i).click();
		//((WebElement) driver.findElements(By.xpath("//BUTTON[.='Add to cart']"))).click();
	/*for(WebElement P:Product)
	System.out.println(P.getText());*/
	/*driver.findElement(By.xpath("(//BUTTON[.='Add to cart'])[23]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//BUTTON[.='Add to cart'])[24]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//BUTTON[.='Add to cart'])[25]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//BUTTON[.='Add to cart'])[26]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//BUTTON[.='Add to cart'])[27]")).click();*/
}
}

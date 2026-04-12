package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho_getCSS_DOMp_DOMa {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/?srsltid=AfmBOorLsr7HrTm_22wnSk9zc6pfPbsBnISxr4KpYwuCnQtXLvB8f45Y");
		WebElement aa123=driver.findElement(By.xpath("//input[@class=\"sc-dOfePm kBqyGz sc-buNqiq egrFLn search-input-elm\"]"));
		System.out.println("before sendkeys domAltribute:"+aa123.getDomAttribute("value"));
		System.out.println("before sendkeys domProperty :"+aa123.getDomProperty("value"));
		aa123.sendKeys("mobiles");
		System.out.println("*************************************************************");
		System.out.println("after sendkeys domAltribute:"+aa123.getDomAttribute("value"));
		System.out.println("after sendkeys domProperty :"+aa123.getDomProperty("value"));
	}
}

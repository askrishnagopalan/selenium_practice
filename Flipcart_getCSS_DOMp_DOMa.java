package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipcart_getCSS_DOMp_DOMa {
	//Flipcart_getCSS_DOMp_DOMa
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role=\"button\"]")));
		closeBtn.click();
		Thread.sleep(1000);
		WebElement aa1234 = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']")));
		//WebElement aa1234=driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']/../../../../../../../../../../..//div[@class='lfFUxn']"));
		//WebElement aa123=driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']/../../../../../../../../../../..//div[@class='lfFUxn']"));
		System.out.println("before sendkeys domAltribute:"+aa1234.getDomAttribute("value"));
		System.out.println("before sendkeys domProperty :"+aa1234.getDomProperty("value"));
		//aa1234.click();
		aa1234.sendKeys("Laptops");
		System.out.println("*************************************************************");
		System.out.println("after sendkeys domAltribute:"+aa1234.getDomAttribute("value"));
		System.out.println("after sendkeys domProperty :"+aa1234.getDomProperty("value"));
		System.out.println("getText="+aa1234.getText());
		System.out.println("getAltribute="+aa1234.getAttribute("class"));
		System.out.println("getCssValue="+aa1234.getCssValue("background"));
}
}

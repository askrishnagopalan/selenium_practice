package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_autosuggestion {
//textarea[@class='gLFyf']
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		List<WebElement> element1=driver.findElements(By.xpath("//div[@id='Alh6id']"));
		for(WebElement element2:element1) {
			System.out.println(element2.getText());
		}
}
}

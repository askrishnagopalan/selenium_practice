package selenium_Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoapp_Qspider_Select_Dselect {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement sel1=driver.findElement(By.id("select-multiple-native"));
		Select SEL1=new Select(sel1);
		SEL1.selectByIndex(0);
		SEL1.selectByIndex(1);
		SEL1.selectByIndex(2);
		SEL1.selectByIndex(3);
		SEL1.deselectByIndex(0);
		SEL1.deselectByIndex(1);
		SEL1.deselectByIndex(2);
		SEL1.deselectByIndex(3);
		SEL1.selectByIndex(0);
		SEL1.selectByIndex(1);
		SEL1.selectByIndex(2);
		SEL1.selectByIndex(3);
		driver.findElement(By.xpath("//button[.='Add']")).click();
	}
}

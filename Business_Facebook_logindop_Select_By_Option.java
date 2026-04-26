package selenium_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Business_Facebook_logindop_Select_By_Option {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://business.facebook.com/signup");
		Thread.sleep(2000);
		System.out.println("Day Option");
		WebElement day =driver.findElement(By.id("day"));
		Select DAY= new Select(day);
		List<WebElement> Option1=DAY.getOptions();
		for (WebElement option : Option1) {
            System.out.println(option.getText());}
		System.out.println("Month Option");
		WebElement Month =driver.findElement(By.id("month"));
		Select MONTH= new Select(Month);
		List<WebElement> Option2=MONTH.getOptions();
		for (WebElement option2 : Option2) {
            System.out.println(option2.getText());}
		System.out.println("Year Option");
		WebElement Year =driver.findElement(By.id("year"));
		Select YEAR= new Select(Year);
		List<WebElement> Option3=YEAR.getOptions();
		for (WebElement option3 : Option3) {
            System.out.println(option3.getText());}
	}
		}


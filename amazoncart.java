package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class amazoncart {
	public static void main(String[] args) throws Throwable {

        // Launch browser
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // Open Amazon
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        // Search for laptop
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000);

        // Click first product
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']//h2/a)[1]"));
        firstProduct.click();

        // Handle new tab
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String win : allWindows) {
            if (!win.equals(parent)) {
                driver.switchTo().window(win);
            }
        }

        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.id("add-to-cart-button")).click();

        Thread.sleep(3000);

        // Go to Cart
        driver.findElement(By.id("nav-cart")).click();

        Thread.sleep(3000);

        // Verify product in cart
        String cartText = driver.findElement(By.xpath("//span[contains(@class,'a-truncate-cut')]")).getText();

        if (cartText.toLowerCase().contains("laptop")) {
            System.out.println("✅ Product successfully added to cart");
        } else {
            System.out.println("❌ Product NOT found in cart");
        }

        // Close browser
        driver.quit();
    }
}
package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountryLogo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);		
		Actions a=new Actions(driver);
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		a.moveToElement(dropdown).perform();
		driver.findElement(By.xpath("//div[@id=\"nav-flyout-icp\"]//span[text()='मराठी']/preceding-sibling::i[@class=\"icp-radio\"]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}

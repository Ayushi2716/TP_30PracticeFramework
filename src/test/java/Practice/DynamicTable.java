package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		String bName="Chrome";
		String percentage = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[.='"+bName+"']/following-sibling::td[contains(.,'%')]")).getText();
		System.out.println(percentage);
		driver.quit();
		System.out.println("Hii1234gh");
	
	


	}

}



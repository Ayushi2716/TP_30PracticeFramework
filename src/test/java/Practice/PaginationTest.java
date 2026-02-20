package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		String input="Portable Charger";
		//List<WebElement> nameList = driver.findElements(By.xpath("//table[@id=\"productTable\"]/tbody/tr/td[2]"));
		List<WebElement> pagenext =driver.findElements(By.xpath("//a[@href='#']"));
		int count=pagenext.size();
		for(int i=1; i<=count; i++) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
			for(WebElement row:rows)
			{
				if(input.equals(row)) {
				String price = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[3]")).getText();
				System.out.println(price);
				System.out.println("hiii");
				

				}
	
	}
	}
	}
}

	



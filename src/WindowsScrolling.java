import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);
		int sum =0;
		List<WebElement> values=driver.findElements(By.xpath("//div/div/fieldset/table/tbody/tr/td[3]"));
		for(int i =0;i<values.size();i++)
			{
			sum =sum +Integer.parseInt(values.get(i).getText());
			}
		System.out.println(sum);
		int rows =driver.findElements(By.xpath("//div/div/fieldset/table/tbody/tr")).size();
		System.out.println(rows);
		int column = driver.findElements(By.xpath("//div/div/fieldset/table/tbody/tr/th")).size();
		System.out.println(column);
		String rowText=driver.findElement(By.xpath("//div/div/fieldset/table/tbody/tr[3]")).getText();
		System.out.println(rowText);
	}
	}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEditBoxesAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Lipakshi");
		driver.findElement(By.name("email")).sendKeys("lipakshidhall24@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Lish123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(gender);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("24-02-1996");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}

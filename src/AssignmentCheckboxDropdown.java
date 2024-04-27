import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckboxDropdown {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Click on anycheckbox and grab the text
		//The checkbox or the text which you have grabbed same you have to select from the dropdown
		//And same text you have to enter in edit box and click on alert and from the alert window 
		//grab the text and see if that text is present or not.
		
		String checkbox = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(checkbox);
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select a = new Select(dropdown);
		a.selectByVisibleText(checkbox);
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		Alert ab = driver.switchTo().alert();
		String alertText = ab.getText();
		System.out.println(alertText);
		if(alertText.contains(checkbox))
		{
			System.out.println("Alert message success");
		}
		else
		{
			System.out.println("Something went wrong");
		}

	}

}

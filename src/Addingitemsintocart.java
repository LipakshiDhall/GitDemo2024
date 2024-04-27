import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addingitemsintocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Users\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Now our goal is to add items(acc to req) in the cart.
		//Firstly get number of elements on that site
		Thread.sleep(2000);
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		String[] itemNeeded= {"Beetroot","Cucumber","Tomato"};
		for(int i=0;i<=products.size();i++) 
		{
			List items = Arrays.asList(itemNeeded);
			String name =products.get(i).getText();
			String[] formattedName = name.split("-");
			String formattedNames = formattedName[0].trim();
			int j=0;
			if(items.contains(formattedNames))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemNeeded.length)
				{
					break;
				}
			}
		}

	}

}

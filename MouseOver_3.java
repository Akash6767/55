package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_3 {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
				
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(loginBtn).build().perform();
		Thread.sleep(3000);
		
		WebElement giftCards = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
        giftCards.click();
		
		driver.close();
		
	}

}

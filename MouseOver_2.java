package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement PrimeLink = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions a =  new Actions(driver);
		a.moveToElement(PrimeLink).build().perform();
		
		Thread.sleep(3000);
		
		WebElement JoinPrimeLink = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		JoinPrimeLink.click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}

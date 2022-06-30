package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

;

public class demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		
	 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
		
	
	WebElement image1 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	
	
	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
	Thread.sleep(2000);

		Actions a = new Actions(driver);
		//a.moveToElement(image1).clickAndHold().moveToElement(trash).release().build().perform();
		
		a.dragAndDrop(image1, trash).build().perform();
		
		
		
		
		Thread.sleep(2000);
		driver.close();

	}

}

package Action_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOfListbox{    //  Handling of Listbox

	public static void main(String[] args) throws InterruptedException {
	
		//  Handling of Listbox
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement dropdown = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dropdown).click().build().perform();
		
		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
		act.sendKeys(Keys.DOWN).build().perform();
		
		}
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
        driver.close();
	
	}

}

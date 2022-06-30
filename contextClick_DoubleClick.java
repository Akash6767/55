package Action_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Right Click
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    
		Actions a = new Actions(driver);
		Thread.sleep(3000);
        a.moveToElement(rightClickMe).contextClick().build().perform();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy context-menu-hover context-menu-visible']")).click();
		Thread.sleep(3000);

	    Alert alt1 = driver.switchTo().alert();
		String text = alt1.getText();
		System.out.println(text);
		alt1.accept();
		Thread.sleep(3000);
		
		//Double click
		
		WebElement doubleClickMe = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        a.moveToElement(doubleClickMe).doubleClick().build().perform();
  
		Alert alt = driver.switchTo().alert();
		String text1 = alt.getText();
		System.out.println(text1);
		Thread.sleep(3000);
        alt.accept();
		Thread.sleep(3000);

		driver.close();

	}

}

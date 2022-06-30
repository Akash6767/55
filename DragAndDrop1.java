package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Drag and Drop
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
	 WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		// images
	 WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	 WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	 WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	 WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
	 // Trash
	 WebElement Trash = driver.findElement(By.xpath("//div[@id='trash']"));

	 // create actions class object 
	 
	 Actions act = new Actions(driver);
	 
	 // call the actions class methods 
	   //* old method's

//	 act.moveToElement(image1).clickAndHold().moveToElement(Trash).release().build().perform();
//	 act.moveToElement(image2).clickAndHold().moveToElement(Trash).release().build().perform();	
//	 act.moveToElement(image3).clickAndHold().moveToElement(Trash).release().build().perform();	
//	 act.moveToElement(image4).clickAndHold().moveToElement(Trash).release().build().perform();

	 //* New Method's
	 
	 Thread.sleep(2000);
	 act.dragAndDrop(image1, Trash).build().perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(image2, Trash).build().perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(image3, Trash).build().perform();
	 Thread.sleep(2000);
	 act.dragAndDrop(image4, Trash).build().perform();
	 
		
	driver.close();	

	}

}

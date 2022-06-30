package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.connect.Connector.Argument;

public class ScrollPage_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		
		WebElement BabyAndKid = driver.findElement(By.xpath("//h2[text()='Baby and Kids']"));

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		// js.executeScript("window.scrollBy(0,1000)");      ======>  way1 to scroll page
		
		Thread.sleep(4000);
		//js.executeScript("arguments[0].scrollIntoView();",BabyAndKid );   // ======>  way2 to scroll page
	     
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // ======>  way3 to scroll page
		
  		
		
		
		
		
		//driver.quit();
	}}

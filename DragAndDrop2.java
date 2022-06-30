package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement ele5000 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']//a[@class='button button-orange']"));
		
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
		
		WebElement accDebitSide = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']//li[@class='placeholder']"));
		
		WebElement amtDebitSide = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt7']"));
		
		WebElement accCreditSide = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));

		WebElement amtCreditSide = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt8']"));

		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(ele5000, amtDebitSide).build().perform();
		Thread.sleep(2000);
        a.dragAndDrop(ele5000, amtCreditSide).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(bank, accDebitSide).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(sales, accCreditSide).build().perform();
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//div[@class='table4_result']//a[@class='button button-green']"));
		
		String expectedResult ="Perfect!";
		String actuaalResult =result.getText();
		
		if(expectedResult.equals(actuaalResult))
		{
			System.out.println("Drop and Down test caase pass");
		}
		else
		{
			System.out.println("Drop and Down test case failed");
		}
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}

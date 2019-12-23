package flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseMobiles 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Window7\\First\\flipkart\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Robot r = new Robot();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		List<WebElement> icici_element = driver.findElements(By.xpath("//div[@class='p67Usp']"));
		for (WebElement webElement : icici_element) 
		{
			System.out.println(webElement.getText());
			//System.out.println(webElement.getAttribute("value"));
		}
		
		WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		search.getLocation();
		System.out.println(search.isDisplayed());
		search.click();
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		List<WebElement> alltitle = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
//		for (WebElement allelement : alltitle) 
//		{
//		System.out.println(allelement.getText());	
//		}
//		
		
//		List<WebElement> redmi = driver.findElements(By.xpath("//div[contains(text(),'Redmi')]"));
//		
//		for (WebElement redmielement : redmi) 
//		{
//			System.out.println(redmielement.getText());
//			System.out.println(redmielement.getAttribute("value"));
//			System.out.println(redmielement.getCssValue("font-family"));
//		}
		
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		for (WebElement webElement : elements) 
		{
			System.out.println(webElement.getText());
			//System.out.println(webElement.getCssValue("font-family"));
		}
		
		List<WebElement> redmi = driver.findElements(By.xpath("//div[@class='_3wU53n' and contains(text(),'Redmi')]"));
		
		System.out.println("only redmi");
		
		for (WebElement onlyredmi : redmi) 
		{
			System.out.println(onlyredmi.getText());
		}
		
	}

}

package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipKartHome 
{


	WebDriver driver;
	Robot r;
	WebElement search;
	
	@Given("Open flipkart page and disable the popup")
	public void open_flipkart_page_and_disable_the_popup() throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Window7\\First\\flipkart\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		r = new Robot();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	}
	
	@When("Search mobiles in the search bar")
	public void search_mobiles_in_the_search_bar() 
	{
		search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		System.out.println(search.getLocation());
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
	}
	
	@Then("print all the Web Element")
	public void print_all_the_Web_Element() throws InterruptedException 
	{
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

package thedemositetest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("http://thedemosite.co.uk/");
		WebElement checkElement = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		checkElement.click();
		checkElement = driver.findElement(By.name("username"));
		checkElement.sendKeys("user123");
		checkElement = driver.findElement(By.name("password"));
		checkElement.sendKeys("password");
		checkElement.submit();
		Thread.sleep(1000);
		
		checkElement = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		checkElement.click();
		checkElement = driver.findElement(By.name("username"));
		checkElement.sendKeys("user123");
		checkElement = driver.findElement(By.name("password"));
		checkElement.sendKeys("password");
		checkElement.submit();
		
		checkElement = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		
		Thread.sleep(1000);
		
		assertEquals("**Successful Login**", checkElement.getText());
	}
	

}

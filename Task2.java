package Task2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class buying {

	public static void main(String[] args) throws InterruptedException {
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2080446\\eclipse-workspace\\adding\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize chrome window
		driver.manage().window().maximize();
		
		driver.get("http://localhost/wpakbar/wordpress/");

		
		driver.findElement(By.xpath("//*[@id=\"menu-item-45\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/form[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-45\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[1]/a/img")).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/form[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/span")).click();
		jss.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-39\"]/div/div/div/section[2]/div/div/div/div/div/div/div/div[2]/div/div/a")).click();
		jss.executeScript("window.scrollBy(0,750)", "");
		driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Akbar");	
		driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Ali");	
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("Masjid Street");	

		driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("Vijayapathi");	
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Tirunelveli");	
		driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("627104");	
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("8883859000");	
		driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("Admin@123.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
		Thread.sleep(5000);
		driver.findElement(By.id("place_order")).click();
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}



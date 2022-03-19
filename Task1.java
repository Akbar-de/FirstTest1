package adding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample {

	public static void main(String[] args) throws InterruptedException {
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2080446\\eclipse-workspace\\adding\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize chrome window
	    driver.manage().window().maximize();
		
		//open wordpress login page
		driver.get("http://localhost/wpakbar/wordpress/wp-login.php");
		
		//find userid box and enter username 
		WebElement txtbx_username = driver.findElement(By.id("user_login"));
		txtbx_username.sendKeys("akbarofcl4@gmail.com");
		
		//find password box and enter password 
		driver.findElement(By.id("user_pass")).sendKeys("Admin@123.com");
		
		//click on sumbit button
		driver.findElement(By.id("wp-submit")).click();
		
		//--------1 ST-----------------------//
		driver.findElement(By.xpath("//*[@id=\"toplevel_page_woocommerce\"]/a/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);         

		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div/div/div[1]/div/ul/li[2]/a/div[2]")).click();
		WebElement camera = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		camera.click();
		camera.sendKeys("Canon Camera");
		driver.findElement(By.xpath("//*[@id=\"_regular_price\"]")).sendKeys("15");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_sale_price\"]")).sendKeys("9.97");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-data\"]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_sku")).sendKeys("0001");
		Thread.sleep(5000);
		
		driver.findElement(By.id("set-post-thumbnail")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Set product image')]")).click();
		Thread.sleep(5000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,-1000)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		
		
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();

		//---------------2 nd-------------//
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div/div/div[1]/div/ul/li[2]/a/div[2]")).click();
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		mobile.click();
		mobile.sendKeys("Mobile");
		driver.findElement(By.xpath("//*[@id=\"_regular_price\"]")).sendKeys("16");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_sale_price\"]")).sendKeys("10.96");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-data\"]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_sku")).sendKeys("0002");
		Thread.sleep(5000);
		
		driver.findElement(By.id("set-post-thumbnail")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Set product image')]")).click();
		Thread.sleep(5000);
		jss.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(5000);

		jss.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();


		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();
		
		//--------------3 rd--------------//
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div/div/div[1]/div/ul/li[2]/a/div[2]")).click();
		WebElement tv = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		tv.click();
		tv.sendKeys("LED TV");
		driver.findElement(By.xpath("//*[@id=\"_regular_price\"]")).sendKeys("17");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_sale_price\"]")).sendKeys("12.06");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-data\"]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_sku")).sendKeys("0003");
		Thread.sleep(5000);
		
		driver.findElement(By.id("set-post-thumbnail")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Set product image')]")).click();
		Thread.sleep(5000);

		jss.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();

		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();
		
		
		
		
		//------------------4 th------------------------------//
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div/div/div[1]/div/ul/li[2]/a/div[2]")).click();
		WebElement lap = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		lap.click();
		lap.sendKeys("Lenovo Thinkpad T14 Laptop");
		driver.findElement(By.xpath("//*[@id=\"_regular_price\"]")).sendKeys("15");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_sale_price\"]")).sendKeys("9.97");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-data\"]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_sku")).sendKeys("0004");
		Thread.sleep(5000);
		
		driver.findElement(By.id("set-post-thumbnail")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[4]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Set product image')]")).click();
		Thread.sleep(5000);

		jss.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();

		driver.findElement(By.xpath("//button[@id='activity-panel-tab-setup']")).click();
		
		
		//--------------------5 th-----------------------------------///
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div[1]/div[2]/div/div[1]/ul/li[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"woocommerce-layout__primary\"]/div[2]/div/div/div/div[1]/div/ul/li[2]/a/div[2]")).click();
		WebElement hphone = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		hphone.click();
		hphone.sendKeys("Jabra Boom Headphone");
		driver.findElement(By.xpath("//*[@id=\"_regular_price\"]")).sendKeys("18");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"_sale_price\"]")).sendKeys("13.36");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"woocommerce-product-data\"]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("_sku")).sendKeys("0005");
		Thread.sleep(5000);
		
		driver.findElement(By.id("set-post-thumbnail")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='__wp-uploader-id-2']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/ul[1]/li[5]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Set product image')]")).click();
		Thread.sleep(5000);

		jss.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"publish\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-posts-product\"]/a/div[3]")).click();

		
			
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}

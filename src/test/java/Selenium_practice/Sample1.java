package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./target/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        
        driver.switchTo().frame("f1");
        driver.findElement(By.xpath("hhhjjjj"));
        driver.switchTo().frame("f2");
        driver.findElement(By.xpath("hshhssh")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        
        
        
        
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys();
        
        
        Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		
		
		
		driver.close();
			

		
		
	}

}

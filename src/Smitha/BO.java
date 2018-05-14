package Smitha;

import java.util.concurrent.TimeUnit;


public class BO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://ipphaptest02/BOE/BI");
		
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[name='servletBridgeIframe']"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(iframe);
		
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:CMS']")).sendKeys("IPPHAPTEST02:6400");
		
		
		//*[@id="_id0:logon:CMS"]
		//*[@id="_id0:logon:CMS"]
		
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:USERNAME']")).sendKeys("ss043599");
		
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).clear();
		driver.findElement(By.xpath("//div[@class='logonInput']/input[@id='_id0:logon:PASSWORD']")).sendKeys("Cerner");
		driver.findElement(By.xpath("//div[@class='logonButton']/input[@id='_id0:logon:logonButton']")).click(); 
		
	}
	}

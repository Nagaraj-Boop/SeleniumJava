package lsssspp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advancedLinks20 {

	public static void main(String[] args) {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver(co); 
		// TODO Auto-generated method stub
		//Links advanced	
				System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
				driver.get("https://www.leafground.com/link.xhtml#");
			//1.To click the button	
				WebElement homePage = driver.findElement(By.linkText("Go to Dashboard"));
				homePage.click();
				
				//to go back to the same page
				driver.navigate().back();
				
		  //2. To find the link destination
				WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
				//in inspect href field you get the page link where it will go
				String where = whereToGo.getAttribute("href");
				System.out.println("The link is going to"+ where);
				
		  //3.Verify the link is broken?
				WebElement brokenLink = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[3]/div/div/a"));
				brokenLink.click();
				
				//get the page title after clicking the broken link
				String title = driver.getTitle();
				
				//if title contains 404 that means it is a broken link - error page, if equal to 404 then we get syso output
				if(title.contains("404")) {
					System.out.println("link is broken");
				}
				
				//to go back to the links page
				driver.navigate().back();
		   //4.duplicate link, same to first link so without finding again use the same first element
				WebElement homePage1 = driver.findElement(By.linkText("Go to Dashboard"));
				homePage1.click();
				
				driver.navigate().back();
				
		   //5.find no of links - we use webElements to find the no of links avail
				//using findElements to find the no of
				List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
				int linkCount = totalLinks.size();
				System.out.println("Total links:"+ linkCount);
	}

}

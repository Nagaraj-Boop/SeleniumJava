package lsssspp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ALERTEXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//NEW----ALERT TYPES
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/alert.xhtml");
		
	 //1.click the alert button and click ok
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		alertBox.click();
		
		//code to switch the power to driver to click ok button after clicking the alert button
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(3000);
		alert.accept();
		
	 //2.click cancel for confirmation alert button with ok and cancel option - click cancel now
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/span[2]"));
		
		confirmButton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		//method dismiss is used to cancel
		confirmAlert.dismiss();
			
	  //3.Prompt alert - click prompt alert and enter a name in that alert given field
		WebElement promptBox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']/span[2]"));
		promptBox.click();
		
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("mine");
		promptAlert.accept();
			
			
	}

}

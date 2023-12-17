package lsssspp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragDrop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DRAG AND DROP
				System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
				driver.get("https://www.leafground.com/drag.xhtml");
				
			//1.Drag and drop
				
				WebElement From = driver.findElement(By.id("form:drag_content"));
				WebElement To = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']/p"));
				
				//for drag and drop we use actions class
				Actions actions = new Actions(driver);
				
				//Way1 - in bracket we mention which element should should be moved and released, build perform used to perform activity
				//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
				// (or)
				//way2 
				actions.dragAndDrop(From, To).build().perform();
	}

}

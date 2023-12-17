package lsssspp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class sortablesExample23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------------------------------------------------------------------------------------------------------------------				
		
		
		
				System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
				driver.get("https://www.leafground.com/drag.xhtml");
				
			
				List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'form:j_idt111_head\']/li"));
				
				WebElement fromElement = elements.get(9);
				WebElement toElement = elements.get(0);
				
				Actions actions = new Actions (driver);
				
				actions.clickAndHold(fromElement);
				actions.moveToElement(toElement);
				actions.release(toElement);
				actions.build().perform();
				
			//xpath is not working property - some errors
				
		//--------------------------------------------------------------------------------------------------------------------		
	}

}

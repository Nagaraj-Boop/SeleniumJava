package lsssspp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class windowExampl11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------------------------------------------------------------------------------------------------------------------
		
		
		//VIDEO 11 - WINDOWS
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/window.xhtml");
		
		//to keep control in old window
		String oldWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//to click the button
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		firstButton.click();
		
		//to move control to new window
		driver.getWindowHandles();
		
		//storing current window and get all handles
		Set<String> handles = driver.getWindowHandles();
		
		//setup the window handles in new window
		for (String newwindow : handles) {
			//switching the control to new window
			driver.switchTo().window(newwindow);
		}
		
		//after clicking the window button, clicking settings (edit but not avail) button in newly opened window
		Thread.sleep(3000);
		
		WebElement settingsButton = driver.findElement(By.xpath("//*[@id=\'layout-config-button\']/i"));
		settingsButton.click();
		
		//close the new window
		driver.close();
		
		//switch control to old window which is opened first time
		driver.switchTo().window(oldWindow);
		
	//2. find the number of opened tabs
	    WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
	    openMultiple.click();
	    
	    //to find the number of windows opened
	    //getWindowHandles used to get no of windows and size method to find the number
	    int numberOfWindows = driver.getWindowHandles().size();
	    System.out.println("No of windows opened:" +numberOfWindows);
	    
	//3. third button - close opened two new windows except parent (old) window
	    //to click the button
	    WebElement dontCloseMe = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
	    dontCloseMe.click();
		
		
		// to get the window handles
		Set<String> newWindowHandles = driver.getWindowHandles();
		 //set all windows and check with condition to close opened windows
		for (String allWindows : newWindowHandles) {
			
			//checking with old windows, if its not equals to old window then it will be closed
			// old window is the primary window, !(exclamatory with equals means not equal condition) 
			//if the window not equals to old window it will be closed
			if (!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
	}

}

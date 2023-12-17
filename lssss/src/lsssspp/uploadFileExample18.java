package lsssspp;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class uploadFileExample18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upload a file
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe");
		driver.get("http://www.leafground.com/file.xhtml");
		
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]"));
		uploadButton.click();
	    
		String file = "C:\\Users\\ADMIN\\Downloads\\image-20230913-100749.png";
		
		//this string will change our location format as a plain text to java to understand
		StringSelection selection = new StringSelection(file);
		
		//using default toolkit - clipboard data - to put the file location in clip board then we can take and paste it
		//using clipboard to paste the path in clipboard, when do cotrl v the paste will happen
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//after clicked the button, control will be choose file field, so using ctrl+v to paste the location
		//we are using robot class to paste the location
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}

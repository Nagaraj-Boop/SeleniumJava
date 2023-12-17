package lsssspp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class framesExample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FRAMES
				System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
				driver.get("https://www.leafground.com/frame.xhtml");
				
		  //1.To click and get the frame button text
				//to switch the control inside the frame to click the element
				driver.switchTo().frame(0);
				
				WebElement clickMe = driver.findElement(By.xpath("//*[@id=\'Click\']"));
				clickMe.click();
				
				//to get the button text
				String text = driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
				System.out.println(text);
			
		  //2.To click the button inside the nested frame
				// To comback to native html from frame 0 used for 1st activity
				driver.switchTo().defaultContent();
				
				//give frame id 2 as this is the third one to switch to that frame
				driver.switchTo().frame(2);
				//inside the frame2 we are switching into iframe frame2
				driver.switchTo().frame("frame2");
				
				WebElement button2 = driver.findElement(By.id("Click"));
				button2.click();
				
		  //3.Finding the no of frames available in this page - 3 should come
				
				//switch back the control default window from frame
				   driver.switchTo().defaultContent();
				//use list elements to takes the no of frames
				   //iframe are inside the page frames name, in inspect you can check the frames under iframes
				   List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
			
			       int size = totalFrames.size();
			       System.out.println(size);
			
			
			
	}

}

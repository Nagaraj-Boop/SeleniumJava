package lsssspp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFirefox {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\AUTO\\firefoxdriver\\geckodriver.exe");
 
	WebDriver driver =  (WebDriver) new FirefoxDriver();
	
	}

}

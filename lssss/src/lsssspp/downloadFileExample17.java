package lsssspp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class downloadFileExample17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		download.click();
		
		Thread.sleep(3000);
		
		//To check whether the file downloaded in local system, you have to use java
		//through selenium you cannot check in local system
		//using file class from java
		File fileLocation = new File("C:\\Users\\ADMIN\\Downloads");
	    File[] totalFiles = fileLocation.listFiles();
		
		
		//to check our file in total files using for each loop
	    for (File file: totalFiles) {
	    	
	    	//if equals to "Download" then we found the match
	    	if(file.getName().equals("TestLeaf Logo.png")) {
	    		
	    		//if it matches with given name in equals then it will print this
	    		System.out.println("The file is downloaded");
	    	
	    	   //if we found the match then this break will stop the execution
	    	    break;
	    	}
	
	}	
	}

}

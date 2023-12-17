package lsssspp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//------------------------------------------------------------------------------------------
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/select.xhtml");
			
		WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropDown1);
		
		//choose using index (order) in dropdown 0,1,2,3,4
		select.selectByIndex(4);
			
		//choose using visible text - selenium, playwright, cypress
		select.selectByVisibleText("Cypress");
		
		//choose using value - 1,2,3,4 - won't work because value not given ther
		//select.selectByValue("2");
		
		//get the number of dropdown options available for that dropdown
		List<WebElement> listOfOptions = select.getOptions();
		int size= listOfOptions.size();
		System.out.println("Number of elements: +size");
		
		
		dropDown1.sendKeys("Selenium");
		
		//choose multiple values in a dropdown
		WebElement multiSelect= driver.findElement(By.xpath("//*[@id=\\\"j_idt87\\\"]/div/div[1]/div[1]/div/div/select"));
		
		Select multiSelectBox = new Select (multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		
		//-----------------
		
		
		
		
		
		
		
		
		
		
		
	}

}

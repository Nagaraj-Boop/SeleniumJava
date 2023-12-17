package lsssspp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get button position
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement getPosition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xypoint = getPosition.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is:  "+ xValue +  " Y value is:  "+yValue);
		
		//find the color
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = colorButton.getCssValue("background");
		System.out.println("Button color is: "+color);
		
		//find the size of the button
		WebElement sizeButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getHeight();
		System.out.println("Height is :"+height + "Width is :"+width);
		
		
		//click button to confirm
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		confirmButton.click();
		
		//check the disabled box status		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));
		boolean enabled = disabledBox.isEnabled();
	    System.out.println(enabled);
	}

}

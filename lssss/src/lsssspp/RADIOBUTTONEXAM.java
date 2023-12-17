package lsssspp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RADIOBUTTONEXAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/radio.xhtml");
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//find the unchecked radio button - from last age limit question - with 1-20 not default selected
		WebElement Unchecked = driver.findElement(By.xpath("//*[@id='j_idt87:age']/div/div[1]/div/div[2]"));
		//it is used to check whether the radio button is selected or not
		boolean status1 = Unchecked.isSelected();
		
		//find the checked radio button - from second last default select question - with safari default selected
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]/span"));
		//it is used to check whether the radio button is selected or not
		boolean status2 = checked.isSelected();	
		
		//Print the status 1 and 2 to check whether it is selected or not
		//if selected - then true if not selected then false - 1st should false and 2nd should be true
		System.out.println(status1);
		System.out.println(status2);
		
		//click age 1-20 radio button
		WebElement below20 = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]/span"));
		below20.click();
		
	}

}

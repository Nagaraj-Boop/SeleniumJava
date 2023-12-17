package lsssspp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class calendarExample22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*[@id="j_idt87:schedule"]/div[1]/div[1]/div/button[2]
		
				System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe" );
				driver.get("https://www.leafground.com/calendar.xhtml#");
				

				//to click current date button
				WebElement currentDate = driver.findElement(By.xpath("//*[@id=\'j_idt87:schedule\']/div[1]/div[1]/button"));
				currentDate.click();
				
				Thread.sleep(3000);
				
				//click next button
				WebElement nextButton = driver.findElement(By.xpath("//*[@id=\'j_idt87:schedule\']/div[1]/div[1]/div/button[2]"));
				nextButton.click();
				
				//to click oct13
				WebElement selectDate = driver.findElement(By.xpath("//*[@id=\'j_idt87:schedule\']/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[2]/td[6]/div"));
				selectDate.click();
				
	}

}

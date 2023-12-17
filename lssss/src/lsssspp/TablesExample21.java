package lsssspp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TablesExample21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TABLES
		
		//1.Total number of columns
			//find the no of columns TH(to find the column, TH = table header)
			
			System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe");
			driver.get("https://www.leafground.com/table.xhtml");
			
			List<WebElement> columns = driver.findElements(By.tagName("th"));
			int columnCount = columns.size();
			System.out.println("No of Columns"+ columnCount);
			// find the no of rows 
			
			List<WebElement> rows = driver.findElements(By.tagName("tr"));
			int rowCount = rows.size();
			System.out.println("no of Rows"+ rowCount);
			
			
		//2.Get the next field country values of Maria Silvio row
			
			WebElement country = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[4]/td[2]/span[3]"));
			String countryValue = country.getText();
			System.out.println("country value is" + countryValue);
			
			List<WebElement> allPrices = driver.findElements(By.xpath("//*[@id=\"form:dt-products:j_idt105\"]/span[1]/li"));
			
			 for (WebElement webElement : allPrices) {
				String individualValue = webElemebt.getText();
			}
			
			
	}

}

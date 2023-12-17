package lsssspp;

public class AutocompleteExample16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AUTOCOMPLETE	
		
		
			 //TRYING WITH TEXTBOX
			/*System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe");
			driver.get("https://www.leafground.com/input.xhtml");
			
			WebElement input = driver.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete\']/button"));
			input.click();
			input.sendKeys("s");
			
			List <WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'j_idt106:auto-complete\']/ul/li"));*/
			
			
			// TRYING WITH DROPDOWN
			System.setProperty("Webdriver.chrome.driver", "C:\\\\AUTO\\\\chromedriver\\\\chromedriver.exe");
			driver.get("https://www.leafground.com/select.xhtml");
			
			WebElement input = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
			input.click();
			
			Thread.sleep(3000);
			input.sendKeys("s");
			
			
			List <WebElement> optionsList = driver.findElements(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button/span[1]/li"));
				
			
			System.out.println(optionsList.size());
			
			 for (WebElement webElement : optionsList) {
				 if (webElement.getText().equals("s3")) {
					webElement.click();
					System.out.println("if part");
					break;
				}else {
					System.out.println("else part");
				}
			 }

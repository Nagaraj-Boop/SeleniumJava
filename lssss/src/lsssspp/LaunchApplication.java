package lsssspp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\AUTO\\chromedriver\\chromedriver.exe");
WebDriverManager.chromedriver().setup();

WebDriver driver = (WebDriver) new ChromeDriver();

driver.get("https://www.google.com/");

	}

}

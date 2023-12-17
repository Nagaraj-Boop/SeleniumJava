package lsssspp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
		//web driver manager setup to avoid wed cannnot be resolved driver issue
		WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver(co);
		
		//get query to open and close the site
		driver.get("https://www.google.com/");
	}

}

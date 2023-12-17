package lsssspp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
  @Test
  public void f() {
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		
		System.setProperty ("webdriver.chrome.driver","C:\\AUTO\\chromedriver\\chromedriver.exe");
		//web driver manager setup to avoid wed cannnot be resolved driver issue
		WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver(co);
		driver.get("www.google.com");
  }
}

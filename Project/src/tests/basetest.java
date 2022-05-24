package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class basetest  {
	WebDriver driver;
	SoftAssert sa ;
	
	public basetest() {
		System.setProperty("webdriver.chrome.driver", "D:\\ronjg\\Desktop\\DEV - LANG\\Projects\\Python\\100daysofcode-Part2\\DAY48\\chromedriver.exe");
		driver = new ChromeDriver();
		 sa = new SoftAssert();
	}
}

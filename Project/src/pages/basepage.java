package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	WebDriver driver;
	WebDriverWait wait;
	String url;
	
	
	basepage(WebDriver d , String url){
		driver = d ;
		this.url = url ;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
;

	}
	
	public void open() {
		driver.get(url);
	}
	public void close() {
		driver.quit();
	}
}

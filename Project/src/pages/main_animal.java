package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class main_animal extends basepage {
	final static String myUrl="https://petstore.octoperf.com/actions/Catalog.action";

	public main_animal(WebDriver d) {
		super(d, myUrl);

		// TODO Auto-generated constructor stub
	}
	
	
		
	// Method  that opening Sidebar Links
	public String get_sidebar_result( String Animalname) {
		if (Animalname.equalsIgnoreCase("Fish")) {

		
			WebElement act = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")));
			act.click();

		
		String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
		return res;
				
			} else if (Animalname.equalsIgnoreCase("Dogs")) {
				WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SidebarContent\"]/a[2]/img")));
				act.click();
				String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
				return res;
		
			} else if (Animalname.equalsIgnoreCase( "Cats")) {
				WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img")));
				act.click();
				String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
				return res;
			} else if (Animalname.equalsIgnoreCase("Reptiles")) {
				WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img")));
				act.click();
				String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
				return res;
			} else if (Animalname.equalsIgnoreCase("Birds")) {
				WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")));
				act.click();
				String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
				return res;
			}

			else {
				 return "Such Animal does not exist in the Method ";} 
			
		}
		
	
	// Method  that opening QuickLinks 
public String get_quicklinks_result( String Animalname) {if (Animalname.equalsIgnoreCase("Fish")) {
	
	WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")));
	act.click();
	String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
	return res;
			
		} else if (Animalname.equalsIgnoreCase("Dogs")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
	
		} else if (Animalname.equalsIgnoreCase( "Cats")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		} else if (Animalname.equalsIgnoreCase("Reptiles")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"QuickLinks\"]/a[3]/img")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		} else if (Animalname.equalsIgnoreCase("Birds")) {
			WebElement act =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"QuickLinks\"]/a[5]/img")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		}

		else {
			 return "Such Animal does not exist in the Method ";} 
		
	}
	
		
	
public String get_mainlinks_result( String Animalname) {if (Animalname.equalsIgnoreCase("Fish")) {
	
	WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]")));
	act.click();
	String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
	return res;
			
		} else if (Animalname.equalsIgnoreCase("Dogs")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainImageContent\"]/map/area[3]")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
	
		} else if (Animalname.equalsIgnoreCase( "Cats")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainImageContent\"]/map/area[5]")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		} else if (Animalname.equalsIgnoreCase("Reptiles")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainImageContent\"]/map/area[4]")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		} else if (Animalname.equalsIgnoreCase("Birds")) {
			WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MainImageContent\"]/map/area[6]")));
			act.click();
			String res = driver.findElement(By.xpath("/html/body/div[2]/div[2]/h2")).getText();
			return res;
		}

		else {
			 return "Such Animal does not exist in the Method ";} 
		
	}
	
		


	

// 	This  Method  is only to print the type of links in the logger
public String catogry_lnk(int catogorycode) {
	/* Types of links 
	 * 1. Main Links
	 * 2 . Sidebar Links
	 * 3 . Quick Links
	 */
	String type = "" ;
	if (catogorycode == 1 ) {
		type = "Main";
	} else if (catogorycode == 2) {
		type = "Sidebar";
	}
	
	else  if (catogorycode == 3) {
		type = "Quicklinks";
	}
	else {
		type = "Pleae eneter only this numbers\n 1. for links in the main section \n 2. for Links in the Sidebar section \n 3. For Quicklinks"
				 ;
	}
	return type;
}

public void return_main() {
	////*[@id="BackLink"]/a
	WebElement act = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"BackLink\"]/a")));
	act.click();
}



}

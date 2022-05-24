package tests;

import org.testng.annotations.Test;

import pages.main_animal;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class lnk_test extends basetest {
// Local variables 
	main_animal lnk ;
	sdk.logger logger ;
	
	
		

	
@Test(dataProvider = "SIDEBAR_links")
 public void sidebar_link( String animal , String exp_result  ) {
		
		  try {
			  logger.info("animal_link", "The specific type of link  is : Sidebar " );
			  String result = lnk.get_sidebar_result(animal) ;
			 sa.assertEquals(result, exp_result);

			  logger.info("animal_link", "The Actual Animal page we have reached  : " + result + " , " + "The desired Animal Page  is : " + exp_result);
			  lnk.return_main();
			
			  
		  }
		  catch (Exception e) {
			  String errmsg ;
			  errmsg = e.getMessage() ;
			  logger.exception("missing_data", errmsg);
			  
		  }


  }

@Test(dataProvider = "Quicklinks")
public void quick_link( String animal , String exp_result  ) {
		
		  try {
			  logger.info("animal_link", "The specific type of link  is : Sidebar " );
			  String result = lnk.get_quicklinks_result(animal) ;
			 sa.assertEquals(result, exp_result);

			  logger.info("animal_link", "The Actual Animal page we have reached  : " + result + " , " + "The desired Animal Page  is : " + exp_result);
			  lnk.return_main();
			
			  
		  }
		  catch (Exception e) {
			  String errmsg ;
			  errmsg = e.getMessage() ;
			  logger.exception("missing_data", errmsg);
			  
		  }


 }

@Test(dataProvider = "Mainlinks")
public void main_link( String animal , String exp_result  ) {
		
		  try {
			  logger.info("animal_link", "The specific type of link  is : Sidebar " );
			  String result = lnk.get_mainlinks_result(animal) ;
			 sa.assertEquals(result, exp_result);

			  logger.info("animal_link", "The Actual Animal page we have reached  : " + result + " , " + "The desired Animal Page  is : " + exp_result);
			  lnk.return_main();
			
			  
		  }
		  catch (Exception e) {
			  String errmsg ;
			  errmsg = e.getMessage() ;
			  logger.exception("missing_data", errmsg);
			  
		  }


 }
  @BeforeMethod
  public void beforeMethod() {
	  lnk.open();
	  logger.event("animal_link", " Let's Check if the specific link is  working: " );
  }

  @AfterMethod
  public void afterMethod() {
  }

  
  
	  @DataProvider(name = "SIDEBAR_links") 
	  public Object[][] s_links() {
		  Object[][] data = new Object[][] {
			  {"Fish" ,"Fish"} ,
			  {"Dogs" ,"Dogs"} ,
			  {"Cats","Cats"} ,
			  {"Reptiles" ,"Reptiles"} ,
			  {"Birds" ,"Birds"},
			  {"Horses" , "Horses" }

		  };
		  return data;}
		  
		  @DataProvider(name = "Quicklinks") 
		  public Object[][] q_links() {
			  Object[][] data = new Object[][] {
				  {"Fish" ,"Fish"} ,
				  {"Dogs" ,"Dogs"} ,
				  {"Cats","Cats"} ,
				  {"Reptiles" ,"Reptiles"} ,
				  {"Birds" ,"Birds"},
				  {"Horses" , "Horses" }

			  };
			  return data;}
		  @DataProvider(name = "Mainlinks") 
		  public Object[][] m_links() {
			  Object[][] data = new Object[][] {
				  {"Fish" ,"Fish"} ,
				  {"Dogs" ,"Dogs"} ,
				  {"Cats","Cats"} ,
				  {"Reptiles" ,"Reptiles"} ,
				  {"Birds" ,"Birds"},
				  {"Horses" , "Horses" }

			  };
			  return data;}
  @BeforeClass
  public void beforeClass() {
	  lnk = new main_animal(driver);
	  logger = new sdk.logger();

	  
  }

  @AfterClass
  public void afterClass() {
	  lnk.close();
	  logger.event("animal_link", "Close Browser" );
	  logger.print();


  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

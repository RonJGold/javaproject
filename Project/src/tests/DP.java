package tests;

import org.testng.annotations.DataProvider;

public class DP
{
    @DataProvider (name = "data-provider")
     public Object[][] dpMethod(){
        return new Object[][] { {"Fish" } ,
  		  {"Dogs" } ,
  		  {"Cats"} ,
  		  {"Reptiles" } ,
  		  {"Birds" },
  		  {"Horses" }

  	  };
     } 
}
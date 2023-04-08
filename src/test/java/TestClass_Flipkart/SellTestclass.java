package TestClass_Flipkart;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Package_Flipkart.Base_Class;
import Flipkart_Automation_POM.Flipkart_Login;
import Flipkart_Automation_POM.Search_Shoes;
import Flipkart_Automation_POM.Sell;
import Util_Package.Utility_class;

public class SellTestclass  extends Base_Class{
	Flipkart_Login flipLogin;  // Variable of POM Class initialized
	Search_Shoes  Search;
	Sell sell;
	 @BeforeClass
	    public void launchingBrowser() 
	    {
	    	launchMethod();
	    	flipLogin = new Flipkart_Login(driver);   // Declaration of variable
	    	Search = new Search_Shoes(driver);
	    	sell = new Sell(driver);
	    }
	 @BeforeMethod
	    public void loginToFlipkart() throws IOException, InterruptedException 
	    {
	    	flipLogin.clickonlogin();   // Calling Method in POM Class
	    	//Search.enterSearch(Utility_class.fetchData(0, 1));
	    	//Search.clickonsearch();
	    	Thread.sleep(3000);
	    	//Utility_class.captureScreenshot(driver);
	    	sell.click_sellbtn();
	    	sell.click_StartSellingbtn();
	    }
	 @Test 
	    public void TC_01() 
	    {
	    	Reporter.log("Pass TC_01");
	    }
	    @Test
	    public void TC_02() {
	    	Reporter.log("pass TC_02");
	    	
	    }
	   
	    
	    @AfterMethod
	    public void LogoutFlipkart(ITestResult result) throws IOException 
	    {
	    	if (result.getStatus() == ITestResult.SUCCESS) 
	    	{
	    		Utility_class.captureScreenshot(driver);
	    	}
	    }
}

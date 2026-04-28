package testscriptpackage2;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

import utilities.ExcelUtilityClass1;

public class LogoutTest extends BaseClass2

{
	@Test

    public void verifyUserIsAbleToLogout() throws IOException
      {
        //String usernamevalue="admin";
        //String passwordvalue="admin";
        
        String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
        String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
        LogoutPage logoutpage=new LogoutPage(driver);
      
        logoutpage.enterUserName(usernamevalue);
        logoutpage.enterPassword(passwordvalue);
        logoutpage.clickOnSignIn();
        logoutpage.clickProfile();
        logoutpage.clickLogout();
        
      }
	
}

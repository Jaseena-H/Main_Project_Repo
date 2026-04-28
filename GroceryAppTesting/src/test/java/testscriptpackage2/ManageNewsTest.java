package testscriptpackage2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilityClass1;

public class ManageNewsTest extends BaseClass2

{
	@Test
public void verifyTheAdminIsAbleToAddNews() throws IOException


{
	 String usernamevalue= ExcelUtilityClass1.getStringData(1, 0, "loginpage");
     String passwordvalue=ExcelUtilityClass1.getStringData(1, 1, "loginpage");
     LoginPage loginpage=new LoginPage(driver);
     loginpage.enterUserName(usernamevalue);
     loginpage.enterPassword(passwordvalue);
     loginpage.clickOnSignIn();
     
     
     String newsvalue= ExcelUtilityClass1.getStringData(0, 1, "managenewspage");
     
     ManageNewsPage newspage=new ManageNewsPage(driver);
     newspage.verifyUserIsAbleToClickOnManageNewsBtn();
     newspage.verifyUserIsAbleToClickOnNewBtn();
     newspage.verifyUserIsAbleToEnterNewNews(newsvalue);
     newspage.verifyUserIsAbleToClickSaveBtn();
     boolean alertmsg=newspage.verifyAlertMessageIsDisplayed();
     Assert.assertTrue(alertmsg);
     
     
     /*LogoutPage logoutpage=new LogoutPage(driver);
     
     //logoutpage.enterUserName(usernamevalue);
     //logoutpage.enterPassword(passwordvalue);
    // logoutpage.clickOnSignIn();
     logoutpage.clickProfile();
     logoutpage.clickLogout();*/
     
    
     
}
}
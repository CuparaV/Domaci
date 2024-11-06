package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest{

    private LoginPage loginPage;
    @BeforeMethod
    public void setUp(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginUserTest(){
        loginPage.loginUser();
        loginPage.assertLogoutButtonIsDisplayed();

    }
}

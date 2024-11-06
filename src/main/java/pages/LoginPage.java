package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private By loginLink = By.cssSelector(".header-links>ul>li>a[class='ico-login']");
    private By emailField = By.xpath("//input[@id='Email']");
    private By passwordField = By.id("Password");
    private By loginButton = By.xpath("//INPUT[@class='button-1 login-button']");
    private By logoutButton = By.cssSelector(".ico-logout");


    public void loginUser(String username, String password) {
        driver.findElement(loginLink).click();
        driver.findElement(emailField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void assertLogoutButtonIsDisplayed() {
        Assert.assertTrue(driver.findElement(logoutButton).isDisplayed(), "Logout button is not displayed.");
    }


}

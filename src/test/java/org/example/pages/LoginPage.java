package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(xpath = "//*[text()='Welcome, Please Sign In!']")
    WebElement welcomeTextOnLoginPage;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy(id = "Password")
    WebElement passwordInputField;

    @FindBy(css = ".login-button")
    WebElement loginButtonOnLoginPage;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement logoutButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement myAccountButton;


    public String getWelcomeTextFromLoginPage() {
        return welcomeTextOnLoginPage.getText();
    }

    public void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButtonOnLoginPage() {
        loginButtonOnLoginPage.click();
    }

    public boolean checkLogoutButtonIsDisplayed() {
        return logoutButton.isDisplayed();
    }

    public boolean checkMyAccountButtonIsDisplayed() {
        return myAccountButton.isDisplayed();
    }
}

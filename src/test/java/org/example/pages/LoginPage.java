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

    @FindBy(css = ".ico-logout")
    WebElement logoutButton;

    @FindBy(css = ".ico-account")
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

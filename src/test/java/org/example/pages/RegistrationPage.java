package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {

    @FindBy(className = "ico-register")
    WebElement registerButtonOnHomePage;

    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    WebElement firstNameInputField;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    WebElement lastNameInputField;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInputField;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInputField;

    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    WebElement confirmPasswordInputField;

    @FindBy(id = "register-button")
    WebElement clickOnRegisterButton;

    @FindBy(xpath = "//*[@class=\"page-body\"]/div")
    WebElement registrationConfirmText;

    @FindBy(css = ".ico-logout")
    WebElement logoutButton;

    public void clickOnRegisterButtonOnHomePage() {
        registerButtonOnHomePage.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInputField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInputField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        confirmPasswordInputField.sendKeys(password);
    }

    public void clickOnRegister() {
        registerButtonOnHomePage.click();
    }

    public String getRegistrationConfirmText() {
        return registrationConfirmText.getText();
    }

    public boolean checkLogoutButtonIsDisplayed() {
        return logoutButton.isDisplayed();
    }
}

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

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div")
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

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInputField.sendKeys(confirmPassword);
    }

    public void enterRegistrationDetails(String firstName,String lastName,String email,String password,String confirmPassword){  //instead of 5 methods,one method only
        firstNameInputField.clear();            //to clear previously entered data before entering new data
        firstNameInputField.sendKeys(firstName);
        lastNameInputField.clear();
        lastNameInputField.sendKeys(lastName);
        emailInputField.clear();
        int myRandomNumber = generateRandomNumber();  //to generate random number
        String myEmail = myRandomNumber+email;        //to use same random email for login feature
        emailInputField.sendKeys(myRandomNumber+email);
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
        confirmPasswordInputField.clear();
        confirmPasswordInputField.sendKeys(confirmPassword);
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

package org.example.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(xpath = "//*[text()=\'Welcome to our store\']")
    WebElement textOnHomePage;

    @FindBy(className = "ico-login")
    WebElement loginButtonOnHomePage;


    public String getTextFromHomePage(){
       return textOnHomePage .getText();
    }

    public void clickOnLoginButtonOnHomePage(){
        loginButtonOnHomePage.click();
    }




}

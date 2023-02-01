package org.example.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(xpath = "//*[text()=\'Welcome to our store\']")  // locators should be defined as a variables
    WebElement textOnHomePage;                              // locators type is WebElement(from website), and we store in variable & gave it a descriptive name, like int a

    @FindBy(className = "ico-login")
    WebElement loginButtonOnHomePage;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a")
    WebElement contactUsButtonOnHomePage;


    public String getTextFromHomePage(){                  //method to get the text from above locator, get the text is an action
       return textOnHomePage .getText();
    }

    public void clickOnLoginButtonOnHomePage(){  // Actions should be defined as a method
        loginButtonOnHomePage.click();
    }

    public void clickOnContactUsButtonOnHomePage() {
        scrollTo(contactUsButtonOnHomePage);    // to scroll to the element on home page
        contactUsButtonOnHomePage.click();
    }


}

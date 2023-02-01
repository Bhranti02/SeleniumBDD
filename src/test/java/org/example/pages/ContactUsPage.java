package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends DriverManager {



    @FindBy(xpath = "//*[text()=\"Contact Us\"]")
    WebElement contactUsConfirmText;


    public String getContactUsTextOnContactUsPage(){
        return contactUsConfirmText.getText() ;

    }



}


package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {

    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() throws IllegalAccessException {
        // driverManager.runOnLocalBrowser();
         driverManager.runInHeadlessMode();
        driverManager.goToURL();
        driverManager.maxBrowser();
        driverManager.applyImplicitWait();
    }

    @After
    public void tearDown(Scenario scenario) {                                   //scenario is a parameter from cucumber
        // if scenario fail then take a screenshot
        if (scenario.isFailed()) {
            driverManager.takeScreenshot(scenario);
        }
        driverManager.closeBrowser();
    }
}

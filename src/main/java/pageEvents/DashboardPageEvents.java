package main.java.pageEvents;

import main.java.pageObjects.Dashboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

public class DashboardPageEvents {

    public boolean loginSuccessful(String welcomeMsg) {
        WebElement welcome = BaseTest.driver.findElement(By.id(Dashboard.welcome));
        return welcome.getText().equalsIgnoreCase(welcomeMsg);
    }
}

package main.java.pageEvents;

        import main.java.pageObjects.HomePage;
        import org.openqa.selenium.By;
        import test.java.BaseTest;

public class HomePageEvents {

    public void loginApp(String user, String pwd) {
        BaseTest.driver.findElement(By.id(HomePage.userName)).sendKeys(user);
        BaseTest.driver.findElement(By.id(HomePage.password)).sendKeys(pwd);
        BaseTest.driver.findElement(By.id(HomePage.login)).click();
    }
}

package test.java;

import main.java.pageEvents.DashboardPageEvents;
import main.java.pageEvents.HomePageEvents;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    private HomePageEvents homePageEvents = new HomePageEvents();
    private DashboardPageEvents dashboardPageEvents = new DashboardPageEvents();

    @Test(dataProvider = "LoginAppCredentials", dataProviderClass = BaseTest.class)
    void verify_if_valid_user_can_login_to_the_application(String user, String pwd) {
        homePageEvents.loginApp(user, pwd);
        dashboardPageEvents.loginSuccessful("Welcome Paul");
    }
}

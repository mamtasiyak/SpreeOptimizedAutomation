package Login;

import contants.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;

import java.io.IOException;

public class LoginTest extends BaseTest {
    @DataProvider(name = "data")
    public Object[][] userCredentials() {
        return new Object[][]{
                new Object[]{"mamta.siyak@thoughtworks.com", "mamtasiyak1@"},
                new Object[]{"mamta.siyak@thoughtworks.com", "abc"}
        };
    }

    @Test(dataProvider = "data")
    public void testValidUserCredentials(String uName, String passwd) throws IOException {
        Login login = new Login(driver);
        login.clickLoginButton();
        login.as(uName, passwd);
    }
}
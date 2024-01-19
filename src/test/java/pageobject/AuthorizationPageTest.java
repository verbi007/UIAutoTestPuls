package pageobject;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;



@Story("Checking user login")
public class AuthorizationPageTest extends BaseTest {

    @Test
    @DisplayName("Login to your account with the correct username and password")
    @Description("Checking:\n" + " - the user has successfully logged in")
    public void setAuthorization() throws InterruptedException {
        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickMenuToggle()
                .clickUserMenuButton()
                .isVisibleUserName()
                .isCorrectedUsername(user)
                .clickExitButton();
    }

    @Test
    @DisplayName("Logging into your account with an incorrect login and correct password")
    @Description("Checking:\n" + " - the user is not logged in")
    public void setAuthorizationIncorrectLogin() throws InterruptedException {
        open(MainPage.URL, AuthorizationPage.class)
                .loginUserIncorrect(user)
                    .operationError();

    }

    @Test
    @DisplayName("Logging into your account with an correct login and incorrect password")
    @Description("Checking:\n" + " - the user is not logged in")
    public void setAuthorizationIncorrectPassword() throws InterruptedException {
        open(MainPage.URL, AuthorizationPage.class)
                .passwordUserIncorrect(user)
                .operationError();

    }

    @Test
    @DisplayName("Logging into an account with empty login and password fields")
    @Description("Checking:\n" + " - the user is not logged in")
    public void setAuthorizationEmptyLoginAndPassword() throws InterruptedException {
        open(MainPage.URL, AuthorizationPage.class)
                .clickLoginButtonEmptyLoginAndPassword()
                .operationError();

    }
}

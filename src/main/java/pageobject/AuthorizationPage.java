package pageobject;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;

//page_url = https://dev-ais3.puls.ru/login
public class AuthorizationPage extends MenuPage {


    // Локатор поля ввода логина
    private SelenideElement loginField = $x("//input[@type='text']") ;

    // метод заполнения поля ввода логина
    @Step("Заполнить поле ввода логина")
    public AuthorizationPage setLogin(String login) {
        loginField
                .shouldBe(Condition.visible)
                .setValue(login);
        return this;
    }

    // Локатор поля ввода пароля
    private SelenideElement passwordField = $x("//input[@type='password']");

    // метод заполнения поля ввода пароля
    @Step("Заполнить поле ввода пароля")
    public AuthorizationPage setPassword(String password) {
        passwordField
                .shouldBe(Condition.visible)
                .setValue(password);
        return this;
    }

    // Локатор кнопки войти
    private SelenideElement loginButton = $("button.alt");

    //Метод клика на кнопку войти при корректном логине и пароле
    @Step("Нажать на кнопку войти при корректном логине и пароле")
    public MainPage clickLoginButton() {
        loginButton
                .shouldBe(Condition.visible)
                .click();
        return page(MainPage.class);
    }

    @Step("Нажать на кнопку войти при пустых полях Логин и Пароль")
    public AuthorizationPage clickLoginButtonEmptyLoginAndPassword() {
        loginButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    //Метод клика на кнопку войти при не корректном логине и пароле
    @Step("Нажать на кнопку войти при корректном логине и пароле")
    public AuthorizationPage clickLoginButtonInCorrect() {
        loginButton.shouldBe(Condition.visible);
        loginButton.click();
        return page(AuthorizationPage.class);
    }

    //Локатор уведомления об успехе операции
    @FindBy(how = How.XPATH, using = "//div[@class='Vue-Toastification__toast Vue-Toastification__toast--success top-right']")
    private SelenideElement successNotification;

    //Локатор уведомления об ошибке
    private SelenideElement errorNotification = $(".toast-card");

    //Метод проверки вывода  уведомления об успешной операции
    @Step("Вывод уведомления об успешной операции")
    public AuthorizationPage operationSuccess() throws InterruptedException {
        successNotification.shouldBe(Condition.exist);
        return this;
    }

    //Метод проверки вывода   уведомления об ошибке
    @Step("Вывод уведомления об ошибке")
    public AuthorizationPage operationError() throws InterruptedException {
        errorNotification.shouldBe(Condition.exist);
        return this;
    }

    // Метод авторизации пользователя
    public AuthorizationPage loginUser(User user) throws InterruptedException {
        setLogin(user.getLogin())
                .setPassword(user.getPassword())
                .clickLoginButton();
        return this;
    }

    // Метод авторизации пользователя с некорректныи логином
    public AuthorizationPage loginUserIncorrect(User user) throws InterruptedException {
        setLogin(user.getLogin()+1)
                .setPassword(user.getPassword())
                .clickLoginButton();
        return this;
    }

    // Метод авторизации пользователя с некорректныи пароллем
    public AuthorizationPage passwordUserIncorrect(User user) throws InterruptedException {
        setLogin(user.getLogin())
                .setPassword(user.getPassword()+1)
                .clickLoginButton();
        return this;
    }
}
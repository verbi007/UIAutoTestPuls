package pageobject;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.DetailsRegionPricing;
import data.User;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.Selenide.open;
import static data.UserKt.getUser;


public class BaseTest {
    protected static User user;


    @BeforeEach
    public void setUp() throws InterruptedException {
        user = getUser();

        //Url удалённого веб драйвера
//        Configuration.remote = ConfigProvider.URL_SELENOID;

//        //Определяем какой браузер будем использовать
        Configuration.browser = "chrome";

        //Размер окна браузера
        Configuration.browserSize = "1920x1080";

        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        //Создаём объект класса DesiredCapabilities, используется как настройка вашей конфигурации с помощью пары ключ-значение
//        DesiredCapabilities capabilities = new DesiredCapabilities();

        //Определяем какой браузер будем использовать
//        capabilities.setBrowserName("chrome");

        //Версия браузера
//        capabilities.setVersion("113.0");

        //Включить поддержку отображения экрана браузера во время выполнения теста
//        capabilities.setCapability( "enableVNC", true);

        //Включение записи видео в процессе выполнения тестов
//        capabilities.setCapability("enableVideo", false);

        //Переопределяем Browser capabilities
//        Configuration.browserCapabilities = capabilities;

//        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");


    }
    @AfterEach
    public void tearDown(){
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }
}
package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.*;

//page_url = https://dev-ais3.puls.ru/
public class MenuPage extends MainPage {
    @Step("Нажать на иконку Избранное")
    public <T> T clickStarFavorite(T page, String href) {
        $x(String.format("//a[@href='%s']//div[@class='i-mdi-star-outline route-star']", href)).shouldHave(Condition.visible).click();
        return page;
    }
    // Локатор Логотипа и ссылки на главную страницу
    private SelenideElement menuLogo = $(".router-link-active");

    //Метод клика на логотип
    @Step("Нажать на логотип ")
    public MainPage clickMenuLogo() {
        menuLogo
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    // Локатор title
    private SelenideElement mainTitle = $x("//span[text()='AIS']");

    // Метод вывода тайтла сайта
    public MainPage isCorrectedTitleText() {
        mainTitle
                .shouldBe(Condition.visible);
        return this;
    }

    // Локатор тогла меню
    private SelenideElement menuToggle = $(".nav-collapse");

    //Метод клика на тогл меню
    @Step("Нажать на тогл меню")
    public MenuPage clickMenuToggle() {
        menuToggle
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    // Локатор кнопки выйти
    private SelenideElement exitButton = $(".i-mdi-exit-to-app");

    //Метод клика на кнопку выйти
    @Step("Нажать на кнопку выйти")
    public MainPage clickExitButton() {
        exitButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    // Локатор кнопки Меню пользователя
    private SelenideElement userMenuButton = $("button.menu-button");

    // Метод клика на кнопку Меню пользователя
    @Step("Нажать на иконку Меню пользователя")
    public MenuPage clickUserMenuButton() {
        userMenuButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }


    // Локатор вывода имени пользователя
    private SelenideElement userName = $(".name");

    //Метод проверки вывода имени пользователя
    @Step("Вывод имени пользователя")
    public MenuPage isVisibleUserName() {
        userName.shouldBe(Condition.visible);
        return this;
    }

    // Метод проверки имени пользователя
    @Step("Проверяем имя пользователя в Меню пользователя")
    public MenuPage isCorrectedUsername(User user) {
        userName
                .shouldHave(Condition.text(user.getUsername()));
        return this;
    }

    // Локатор вывода email пользователя
    private SelenideElement userEmail = $(".email");

    // Метод проверки вывода email пользователя
    @Step("Вывод email пользователя")
    public MenuPage isVisibleUserEmail() {
        userEmail.shouldBe(Condition.visible);
        return this;
    }


    // Локатор обращения в тех.поддержку
    private SelenideElement helpDeskButton = $(".i-mdi-comment-question-outline");

    //Метод клика на кнопку обращения в техподдержку
    @Step("Нажать на кнопку уведомления")
    public MainPage clickHelpDeskButton() {
        helpDeskButton
                .shouldBe(Condition.visible)
                .click();
        return page(MainPage.class);
    }

    //Локатор группы Ценообразование
    private SelenideElement groupPricing = $x("//summary[@title='Ценообразование']");

    @Step("Нажать на группу Ценообразование в меню")
    public MenuPage clickGroupPricing() {
        groupPricing
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    //Локатор подгруппы Базовые настройки ЦО
    private SelenideElement groupBasicPricingSettings = $x("//summary[@title='Базовые настройки ЦО']");

    @Step("Нажать на подгруппу Базовые настройки ЦО в меню")
    public MenuPage clickGroupBasicPricingSettings() {
        groupBasicPricingSettings
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    // Локатор выбора раздела Регионы ценообразования
    private SelenideElement menuPricingRegion = $x("//a[@href='/pricing-regions']");

    //Метод клика на раздел Регионы ценообразования
    @Step("Нажать на раздел Регионы ценообразования")
    public RegionPricingPage clickMenuPricingRegion() {
        menuPricingRegion
                .shouldBe(Condition.visible)
                .click();
        return page(RegionPricingPage.class);
    }

    // Локатор выбора раздела Географические регионы
    private SelenideElement menuPricingRegionCode = $x("//a[@href='/pricing-regions-code']");

    //Метод клика на раздел Географические регионы
    @Step("Нажать на раздел Географические регионы")
    public GeoRegionsPage clickMenuGeoRegion() {
        menuPricingRegionCode
                .shouldBe(Condition.visible)
                .click();
        return page(GeoRegionsPage.class);
    }

    // Локатор выбора раздела Используемые алгоритмы
    private SelenideElement menuDefineAlgorithm = $x("//a[contains(@href, '/define-algorithm-price-code')]");

    //Метод клика на раздел Используемые алгоритмы
    @Step("Нажать на раздел Используемые алгоритмы")
    public DefineAlgorithmPage clickMenuDefineAlgorithm() {
        menuDefineAlgorithm
                .shouldBe(Condition.visible)
                .click();
        return page(DefineAlgorithmPage.class);
    }

    // Локатор выбора раздела Описание складов
    private SelenideElement menuWarehouse= $x("//a[@href='/warehouse-link']");

    //Метод клика на раздел Описание складов
    @Step("Нажать на раздел Описание складов")
    public WarehouseLinkPage clickMenuWarehouse() {
        menuWarehouse
                .shouldBe(Condition.visible)
                .click();
        return page(WarehouseLinkPage.class);
    }


    //Локатор подгруппы Пары
    private SelenideElement groupPairs = $x("//summary[@title='Пары']");

    @Step("Нажать на подгруппу Пары в меню")
    public MenuPage clickGroupPairs() {
        groupPairs
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

    // Локатор выбора раздела Эталонные пары
    private SelenideElement menuPairsStandard = $x("//a[@href='/pairs-standard']");

    //Метод клика на раздел Эталонные пары"
    @Step("Нажать на раздел Эталонные пары")
    public PairsStandardPage clickMenuPairsStandard() {
        menuPairsStandard
                .shouldBe(Condition.visible)
                .click();
        return page(PairsStandardPage.class);
    }


}

package pageobject;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DetailsRegionPricing;
import data.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import readProperties.ConfigProvider;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

//page_url = https://dev-ais3.puls.ru/
public class MainPage {
    //public static String URL = ConfigProvider.URL;
    public static String URL = ConfigProvider.URL;

    protected SelenideElement BODY = $("body");

    @Step("Нажать на пустое место на странице")
    protected void clickBody() {
        BODY.click();
    }


    /**
     * BUTTONS
     **/

    // Локатор для кнопки Добавить
    protected SelenideElement newRowButton = $x("//button[@data-test-id='showNewRowButton']");

    // Локатор для кнопки Копировать
    protected SelenideElement copySelectedRow = $x("//button[@data-test-id='copySelectedRowButton']");

    // Локатор для кнопки Сохранить
    protected SelenideElement saveNewRowButton = $x("//button[@data-test-id='saveNewRowButton']");

    // Локатор для кнопки Обновить
    protected SelenideElement updateButton = $x("//div[@data-test-id='updateTableIcon']");

    @Step("Нажать на кнопку 'Добавить'")
    protected <T> T clickNewRowButton(T page) {
        newRowButton.shouldBe(Condition.visible).click();
        return page;
    }

    @Step("Нажать на кнопку 'Копировать'")
    public <T> T clickCopySelectedRow(T page) {
        copySelectedRow.shouldBe(Condition.visible).click();
        return page;
    }

    @Step("Нажать на кнопку 'Обновить'")
    public <T> T clickUpdateButton(T page) {
        updateButton.shouldBe(Condition.visible).click();
        return page;
    }

    @Step("Нажать на кнопку 'Сохранить'")
    public <T> T clickSaveNewRowButton(T page) {
        saveNewRowButton.shouldBe(Condition.visible).click();
        return page;
    }

    /**
     * TOAST-CARD
     **/
    // Локатор уведомление об успешном создании записи
    protected SelenideElement toastCard = $(".toast-card");

    // Локатор уведомление об успешном создании записи
    protected SelenideElement toastCardSuccessIcon = $(".i-mdi-check-circle-outline");

    // Локатор текста уведомления
    protected SelenideElement toastCardTitle = $(".toast-card p");

    // Локатор уведомление об успешном создании записи
    protected SelenideElement toastCardFailIcon = $(".i-mdi-alert-outline");

    // Локатор закрытия уведомления
    protected ElementsCollection toastCloseButton = $$x("//*[@class='i-mdi-close close-icon']");

    @Step("Проверить появление успешного уведомления о создании записи")
    public <T> T checkToastCardSuccess(T page) {
        toastCard.shouldBe(Condition.visible);
        return page;
    }


    @Step("Проверить появление уведомления о невозможности создания записи")
    public <T> T checkToastCardFail(T page) {
        toastCard.shouldBe(Condition.visible);
        toastCardFailIcon.shouldBe(Condition.visible);
        return page;
    }

    @Step("Проверить появление уведомления с текстом равным: '{text}'")
    public <T> T checkToastCardText(T page, String text) {
        toastCardTitle.shouldHave(Condition.text(text));
        return page;
    }

    @Step("Проверить появление уведомления с текстом содержащим: '{text}'")
    public <T> T checkToastCardPartialText(T page, String text) {
        toastCardTitle.shouldHave(Condition.partialText(text));
        return page;
    }

    @Step("Закрыть уведомление")
    public <T> T clickCloseButtonToastCard(T page) {
        toastCloseButton.first().shouldBe(Condition.exist).click();
        toastCloseButton.first().shouldNot(Condition.visible);
        return page;
    }
    @Step("Закрыть все уведомления")
    public <T> T clickCloseButtonsToastCards(T page) {
        toastCloseButton.forEach(x -> x.shouldBe(Condition.visible).click());
        return page;
    }


    /**
     * DELETE ROW
     */

    // Локатор удаления записи
    protected ElementsCollection deleteRowButtonsList = $$x("//*[@data-test-id='deleteRow']");

    // Локатор кнопки Подтвердить
    protected SelenideElement confirmationDialogConfirmButton = $x("//button[@data-test-id='confirmationDialogConfirm']");

    // Локатор кнопки Отменить
    protected SelenideElement confirmationDialogCancelButton = $x("//button[@data-test-id='confirmationDialogCancel']");

    @Step("Нажать на кнопку удаление первой строки")
    public <T> T deleteRow(T page) {
        clickByIndexDeleteButtonsList(page, 0);
        clickConfirmationDialogConfirmButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_DELETE);
        return page;
    }

    @Step("Нажать на '{index}' элемент в списке кнопок Удаления")
    public <T> T clickByIndexDeleteButtonsList(T page, Integer index) {
        deleteRowButtonsList.get(index).click();
        return page;
    }

    @Step("Нажать на кнопку 'Подтвердить' в диалоговом окне")
    public <T> T clickConfirmationDialogConfirmButton(T page) {
        confirmationDialogConfirmButton.click();
        return page;
    }

    /**
     * ROW
     **/

    //Локатор подсчитывающий кол-во строк
    protected ElementsCollection numberOfRow = $$x("//*[@class='ag-center-cols-clipper']//div[@row-index]");

    /**
     * FILTERS
     **/

    //Локатор проверки очистки фильтра
    protected ElementsCollection filterCloseList = $$(".i-mdi-close");
}
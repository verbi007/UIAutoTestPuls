package pageobject;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DetailsPairStandard;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

//page_url = https://dev-ais3.puls.ru/pairs-standard
public class PairsStandardPage extends MenuPage {
    /**
     * ADD NEW ROW
     **/

    // Локатор выбора поля Филиал
    private ElementsCollection newRowFilialName = $$x("//*[@col-id='FilialName']");

    // Локатор input поля Филиал
    private SelenideElement inputNewRowFilialName = $x("//*[@data-test-id='FilialNameEditorSet']//input");


    // Локатор добавление в новую строку Филиал
    private ElementsCollection newRowFilialNameList = $$x("//*[@data-test-id='FilialNameEditorSetItemsList']//li");

    @Step("Нажать на поле Филиал в новой строке")
    public PairsStandardPage clickNewRowFilialName() {
        newRowFilialName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Филиал")
    public PairsStandardPage inputValueNewRowFilial(String value, Integer sizeValue) {
        inputNewRowFilialName.val(value);
        newRowFilialNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке филиалов в новой строке")
    public PairsStandardPage clickNewRowFirstElementFilialList() {
        newRowFilialNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке филиалов в новой строке")
    public PairsStandardPage clickNewRowByIndexFilialList(Integer index) {
        newRowFilialNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Клиент
    private ElementsCollection newRowClientName = $$x("//*[@col-id='ClientName']");

    // Локатор input поля Клиент
    private SelenideElement inputNewRowClientName = $x("//*[@data-test-id='ClientNameEditorSet']//input");


    // Локатор добавление в новую строку Клиент
    private ElementsCollection newRowClientNameList = $$x("//*[@data-test-id='ClientNameEditorSetItemsList']//li");

    @Step("Нажать на поле Клиент в новой строке")
    public PairsStandardPage clickNewRowClientName() {
        newRowClientName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Клиент")
    public PairsStandardPage inputValueNewRowClient(String value, Integer sizeValue) {
        inputNewRowClientName.val(value);
        newRowClientNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Клиентов в новой строке")
    public PairsStandardPage clickNewRowFirstElementClientList() {
        newRowClientNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Клиентов в новой строке")
    public PairsStandardPage clickNewRowByIndexClientList(Integer index) {
        newRowClientNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Дистрибьютор
    private ElementsCollection newRowDistribName = $$x("//*[@col-id='DistribName']");

    // Локатор input поля Дистрибьютор
    private SelenideElement inputNewRowDistribName = $x("//*[@data-test-id='DistribNameEditorSet']//input");


    // Локатор добавление в новую строку Дистрибьютор
    private ElementsCollection newRowDistribNameList = $$x("//*[@data-test-id='DistribNameEditorSetItemsList']//li");

    @Step("Нажать на поле Дистрибьютор в новой строке")
    public PairsStandardPage clickNewRowDistribName() {
        newRowDistribName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Дистрибьютор")
    public PairsStandardPage inputValueNewRowDistrib(String value, Integer sizeValue) {
        inputNewRowDistribName.val(value);
        newRowDistribNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Дистрибьюторов в новой строке")
    public PairsStandardPage clickNewRowFirstElementDistribList() {
        newRowDistribNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Дистрибьюторов в новой строке")
    public PairsStandardPage clickNewRowByIndexDistribList(Integer index) {
        newRowDistribNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Регион
    private ElementsCollection newRowRegionName = $$x("//*[@col-id='RegionName']");

    // Локатор input поля Регион
    private SelenideElement inputNewRowRegionName = $x("//*[@data-test-id='RegionNameEditorSet']//input");


    // Локатор добавление в новую строку Регион
    private ElementsCollection newRowRegionNameList = $$x("//*[@data-test-id='RegionNameEditorSetItemsList']//li");

    @Step("Нажать на поле Регион в новой строке")
    public PairsStandardPage clickNewRowRegionName() {
        newRowRegionName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Регион")
    public PairsStandardPage inputValueNewRowRegion(String value, Integer sizeValue) {
        inputNewRowRegionName.val(value);
        newRowRegionNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Регионов в новой строке")
    public PairsStandardPage clickNewRowFirstElementRegionList() {
        newRowRegionNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Регионов в новой строке")
    public PairsStandardPage clickNewRowByIndexRegionList(Integer index) {
        newRowRegionNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Источник
    private ElementsCollection newRowSourceName = $$x("//*[@col-id='SourceName']");

    // Локатор input поля Источник
    private SelenideElement inputNewRowSourceName = $x("//*[@data-test-id='SourceNameEditorSet']//input");


    // Локатор добавление в новую строку Источник
    private ElementsCollection newRowSourceNameList = $$x("//*[@data-test-id='SourceNameEditorSetItemsList']//li");

    @Step("Нажать на поле Источник в новой строке")
    public PairsStandardPage clickNewRowSourceName() {
        newRowSourceName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Источник")
    public PairsStandardPage inputValueNewRowSource(String value, Integer sizeValue) {
        inputNewRowSourceName.val(value);
        newRowSourceNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Источников в новой строке")
    public PairsStandardPage clickNewRowFirstElementSourceList() {
        newRowSourceNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Источников в новой строке")
    public PairsStandardPage clickNewRowByIndexSourceList(Integer index) {
        newRowSourceNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Дата начала
    private ElementsCollection newRowBegDate = $$x("//*[@col-id='BegDate']");

    // Локатор input поля Дата начала
    private SelenideElement inputNewRowBegDate = $x("//*[@data-test-id='BegDateEditorDate']//input");



    @Step("Нажать на поле Дата начала в новой строке")
    public PairsStandardPage clickNewRowBegDate() {
        newRowBegDate.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Дата начала")
    public PairsStandardPage inputValueNewRowBegDate(String value) {
        inputNewRowBegDate
                .val(value)
                .sendKeys(Keys.ENTER);
        return this;
    }

    // Локатор выбора поля Дата начала
    private ElementsCollection newRowEndDate = $$x("//*[@col-id='EndDate']");

    // Локатор input поля Дата начала
    private SelenideElement inputNewRowEndDate = $x("//*[@data-test-id='EndDateEditorDate']//input");


    @Step("Нажать на поле Дата начала в новой строке")
    public PairsStandardPage clickNewRowEndDate() {
        newRowEndDate.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Дата начала")
    public PairsStandardPage inputValueNewRowEndDate(String value) {
        inputNewRowEndDate
                .val(value)
                .sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Добавление данных в новой строке")
    public PairsStandardPage inputValuesNewLine(DetailsPairStandard details, Integer sizeValue) {
        inputValueNewRowFilial(details.getFilial(), sizeValue);

        clickNewRowClientName();
        inputValueNewRowClient(details.getClient(), 6);

        clickNewRowDistribName();
        inputValueNewRowDistrib(details.getDistrib(), 0);

        clickNewRowRegionName();
        inputValueNewRowRegion(details.getRegion(), 0);

        clickNewRowSourceName();
        inputValueNewRowSource(details.getSource(), 0);

        clickNewRowBegDate();
        inputValueNewRowBegDate(details.getBegDate());

        return this;
    }

    /**
     * BUTTONS
     **/

    // Метод добавление новой строки
    @Step("Добавление новой строки")
    public PairsStandardPage addNewRow(PairsStandardPage page, DetailsPairStandard details, Integer sizeValue) {
        clickNewRowButton(page);
        inputValuesNewLine(details, sizeValue);
        clickSaveNewRowButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }
}
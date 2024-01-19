package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DetailsWarehouseLink;
import io.qameta.allure.Step;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

//page_url=https://dev-ais3.puls.ru/warehouse-link
public class WarehouseLinkPage extends MenuPage{
    /**
     * BUTTONS
     **/

    // Метод добавление новой строки
    @Step("Добавление новой строки")
    public WarehouseLinkPage addNewRow(WarehouseLinkPage page, DetailsWarehouseLink details) {
        clickNewRowButton(page);
        inputValuesNewLine(details);
        clickSaveNewRowButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    @Step("Добавление дублирующей строки")
    public WarehouseLinkPage addDuplicateNewRow(WarehouseLinkPage page, DetailsWarehouseLink details) {
        clickNewRowButton(page);
        inputValuesNewLine(details);
        clickSaveNewRowButton(page);

        checkToastCardFail(page);
        checkToastCardPartialText(page, ConfigProvider.FAIL_DUPLICATE_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    /**
     * DELETE ROW
     **/

    @Step("Нажать на {index} элемент в столбце кнопок удаления записей")
    public WarehouseLinkPage clickByIndexDeleteButtonsList(Integer index) {
        deleteRowButtonsList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку Подтвердить в диалоговом окне")
    public WarehouseLinkPage clickConfirmationDialogConfirmButton() {
        confirmationDialogConfirmButton.click();
        return this;
    }
    @Step("Удаление строки")
    public WarehouseLinkPage deleteRow(WarehouseLinkPage page) {
        clickByIndexDeleteButtonsList(0);
        clickConfirmationDialogConfirmButton();
        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_DELETE);
        return this;
    }

    /**
     * ADD NEW ROW
     **/

    // Локатор выбора поля Филиал
    private ElementsCollection newRowFilial = $$x("//*[@col-id='FilialName']");

    // Локатор выбора поля Филиал
    private SelenideElement inputNewRowFilial = $x("//*[@data-test-id='FilialNameEditorSet']//input");


    // Локатор добавление в новую строку Филиал
    private ElementsCollection newRowFilialList = $$x("//*[@data-test-id='FilialNameEditorSetItemsList']//li");

    @Step("Нажать на поле Филиал в новой строке")
    public WarehouseLinkPage clickNewRowFilialName() {
        newRowFilial.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Филиал")
    public WarehouseLinkPage inputValueNewRowFilial(String value, Integer sizeValue) {
        inputNewRowFilial.val(value);
        newRowFilialList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    // Локатор выбора поля Склад
    private ElementsCollection newRowWarehouseLink = $$x("//*[@col-id='WarehouseName']");

    // Локатор выбора поля Склад
    private SelenideElement inputNewRowWarehouseLink = $x("//*[@data-test-id='WarehouseNameEditorSet']//input");


    // Локатор добавление в новую строку Склад
    private ElementsCollection newRowWarehouseLinkList = $$x("//*[@data-test-id='WarehouseNameEditorSetItemsList']//li");

    @Step("Нажать на поле Склад в новой строке")
    public WarehouseLinkPage clickNewRowWarehouseName() {
        newRowWarehouseLink.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Склад")
    public WarehouseLinkPage inputValueNewRowWarehouse(String value, Integer sizeValue) {
        inputNewRowWarehouseLink.val(value);
        newRowWarehouseLinkList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Ввести данные в поля для новой строки в раздлеле Описание складов")
    public WarehouseLinkPage inputValuesNewLine(DetailsWarehouseLink details) {
        inputValueNewRowFilial(details.getFilial(), 1);

        clickNewRowWarehouseName();
        inputValueNewRowWarehouse(details.getWarehouse(), 1);

        return this;
    }

    @Step("Заполнить изменненные данные")
    public WarehouseLinkPage changeDataWarehouseLink(DetailsWarehouseLink details) throws InterruptedException {
        WarehouseLinkPage page = new WarehouseLinkPage();
        if (details.getFilial() != null) {
            clickNewRowFilialName();
            inputValueNewRowFilial(details.getFilial(), 1);
            clickCloseButtonToastCard(page);
        }

        if (details.getWarehouse() != null) {
            clickNewRowWarehouseName();
            inputValueNewRowWarehouse(details.getWarehouse(), 1);
            clickCloseButtonToastCard(page);
        }

        return this;
    }

    /**
     * FILTERS
     **/

    // Локатор фильтра Филиал
    private SelenideElement filialNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']");

    //Локатор input для фильтра Филиал
    private SelenideElement inputFilialNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Филиал
    private ElementsCollection filialNameFiltersList = $$x("//ul[@data-test-id='FilialNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Филиал
    private SelenideElement clearPriceNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']//div[@class='i-mdi-close']");

    @Step("Нажать на фильтр Филиал")
    public WarehouseLinkPage clickFilialNameFilter() {
        filialNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Филиал")
    public WarehouseLinkPage inputValueFilialNameFilter(String value, Integer sizeValue, Integer index) {
        inputFilialNameFilter.val(value);
        filialNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Филиал")
    public WarehouseLinkPage clickFirstElementFilialNameList() {
        filialNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Филиал")
    public WarehouseLinkPage clickByIndexFilialNameList(Integer index) {
        filialNameFiltersList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Филиал")
    public WarehouseLinkPage clickClearFilterFilialNameButton() {
        filialNameFilter.shouldBe(Condition.visible).hover();
        clearPriceNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    // Локатор фильтра Склад
    private SelenideElement warehouseNameFilter = $x("//*[@data-test-id='WarehouseNameFilterSet']");

    //Локатор input для фильтра Склад
    private SelenideElement inputWarehouseNameFilter = $x("//*[@data-test-id='WarehouseNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Склад
    private ElementsCollection warehouseNameFiltersList = $$x("//ul[@data-test-id='WarehouseNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Склад
    private SelenideElement clearWarehouseNameFilter = $x("//*[@data-test-id='WarehouseNameFilterSet']//div[@class='i-mdi-close']");

    @Step("Нажать на фильтр Склад")
    public WarehouseLinkPage clickWarehouseNameFilter() {
        warehouseNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Склад")
    public WarehouseLinkPage inputValueWarehouseNameFilter(String value, Integer sizeValue, Integer index) {
        inputWarehouseNameFilter.val(value);
        warehouseNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Склад")
    public WarehouseLinkPage clickFirstElementWarehouseNameList() {
        warehouseNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Склад")
    public WarehouseLinkPage clickByIndexWarehouseNameList(Integer index) {
        warehouseNameFiltersList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Склад")
    public WarehouseLinkPage clickClearFilterWarehouseNameButton() {
        warehouseNameFilter.shouldBe(Condition.visible).hover();
        clearWarehouseNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    //Метод ограничения данных с помощью фильтров
    @Step("Ограничить данные с помощью фильтров")
    public WarehouseLinkPage inputFiltersWarehouseLink(DetailsWarehouseLink details) {
        if (details.getFilial() != null) {
            clickFilialNameFilter();
            inputValueFilialNameFilter(details.getFilial(), 1,0);
        }

        if (details.getWarehouse() != null) {
            clickWarehouseNameFilter();
            inputValueWarehouseNameFilter(details.getWarehouse(), 1, 0);
        }

        return this;
    }

    @Step("Проверяем количество выведенных строк")
    public WarehouseLinkPage checkNumberOfRow(Integer number) {
        numberOfRow.shouldHave(size(number));
        return this;
    }

}

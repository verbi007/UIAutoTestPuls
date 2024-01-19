package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DetailsGeoRegions;
import io.qameta.allure.Step;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

//page_url = https://dev-ais3.puls.ru/pricing-regions-code
public class GeoRegionsPage extends MenuPage {
    /**
     * ADD NEW ROW
     **/

    // Локатор выбора поля Имя прайс-листа
    private ElementsCollection newRowPriceName = $$x("//*[@col-id='PriceName']");

    // Локатор выбора поля Имя прайс-листа
    private SelenideElement inputNewRowPriceName = $x("//*[@data-test-id='PriceNameEditorSet']//input");


    // Локатор добавление в новую строку Имя прайс-листа
    private ElementsCollection newRowPriceNameList = $$x("//*[@data-test-id='PriceNameEditorSetItemsList']//li");

    @Step("Нажать на поле Имя прайс-листа в новой строке")
    public GeoRegionsPage clickNewRowPriceName() {
        newRowPriceName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Имя прайс-листа")
    public GeoRegionsPage inputValueNewRowPriceName(String value, Integer sizeValue, Integer index) {
        inputNewRowPriceName.shouldBe(Condition.visible).val(value);
        newRowPriceNameList.shouldHave(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя прайс-листа в новой строке")
    public GeoRegionsPage clickNewRowFirstElementPriceNameList() {
        newRowPriceNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя прайс-листа в новой строке")
    public GeoRegionsPage clickNewRowByIndexPriceNameList(Integer index) {
        newRowPriceNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Регион
    private ElementsCollection newRowRegion = $$x("//*[@col-id='RegionName']");

    // Локатор ввода в поле Регион
    private SelenideElement inputNewRowRegion = $x("//*[@data-test-id='RegionNameEditorSet']//input");


    // Локатор добавление в новую строку Регион
    private ElementsCollection newRowRegionList = $$x("//*[@data-test-id='RegionNameEditorSetItemsList']//li");

    @Step("Нажать на поле Регион в новой строке")
    public GeoRegionsPage clickNewRowRegionName() {
        newRowRegion.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Регион в новой строке")
    public GeoRegionsPage inputValueNewRowRegionName(String value, Integer sizeValue, Integer index) {
        inputNewRowRegion.val(value);
        newRowRegionList.shouldHave(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Регион в новой строке")
    public GeoRegionsPage clickNewRowFirstElementRegionNameList() {
        newRowRegionList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Регион в новой строке")
    public GeoRegionsPage clickNewRowByIndexPricingRegionNameList(Integer index) {
        newRowRegionList.get(index).click();
        return this;
    }

    @Step("Ввести данные в поля для новой строки в разделе Географические регионы")
    public GeoRegionsPage inputValuesNewLine(DetailsGeoRegions details, Integer sizeValue) {
          inputValueNewRowPriceName(details.getPriceList(), sizeValue, 0);

          clickNewRowRegionName();
          inputValueNewRowRegionName(details.getRegion(), 1, 0);

          return this;
    }

    // Удаление строк
    @Step("Нажать на первую кнопку удаления записи в столбце")
    public GeoRegionsPage clickFirstElementDeleteButtonsList() {
        deleteRowButtonsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в столбце кнопок удаления записей")
    public GeoRegionsPage clickByIndexDeleteButtonsList(Integer index) {
        deleteRowButtonsList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку Подтвердить в диалоговом окне")
    public GeoRegionsPage clickConfirmationDialogConfirmButton() {
        confirmationDialogConfirmButton.click();
        return this;
    }

    @Step("Нажать на кнопку Отмена в диалоговом окне")
    public GeoRegionsPage clickConfirmationDialogCancelButton() {
        confirmationDialogCancelButton.click();
        return this;
    }

    @Step("Заполнить изменненные данные")
    public GeoRegionsPage changeDataLineGeoRegion(DetailsGeoRegions details) {
        GeoRegionsPage page = new GeoRegionsPage();
        if (details.getPriceList() != null) {
            clickNewRowPriceName();
            inputValueNewRowPriceName(details.getPriceList(), 1, 0);
            checkToastCardPartialText(page, ConfigProvider.SUCCESS_CHANGES);
            clickCloseButtonToastCard(page);
        }

        if (details.getRegion() != null) {
            clickNewRowRegionName();
            inputValueNewRowRegionName(details.getRegion(), 1,0);
            checkToastCardPartialText(page, ConfigProvider.SUCCESS_CHANGES);
            clickCloseButtonToastCard(page);
        }

        return this;

    }

    // Метод добавления новой строки
    @Step("Добавление новой строки")
    public GeoRegionsPage addNewRow(GeoRegionsPage page, DetailsGeoRegions details, Integer sizeValue) {
        clickNewRowButton(page);
        inputValuesNewLine(details,sizeValue);
        clickSaveNewRowButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page,ConfigProvider.SUCCESS_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    // Метод добавления дублирующей строки
    @Step("Добавление дублирующей строки")
    public GeoRegionsPage addDuplicateNewRow(GeoRegionsPage page, DetailsGeoRegions details, Integer sizeValue) {
        clickNewRowButton(page);
        inputValuesNewLine(details, sizeValue);
        clickSaveNewRowButton(page);

        checkToastCardFail(page);
        checkToastCardPartialText(page, ConfigProvider.FAIL_DUPLICATE_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    // Метод удаления новой строки
    @Step("Удаление строки")
    public GeoRegionsPage deleteRow(GeoRegionsPage page) {
        clickUpdateButton(page);
        clickByIndexDeleteButtonsList(0);
        clickConfirmationDialogConfirmButton();

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_DELETE);

        return this;
    }

    /**
     * FILTERS
     **/

    //Локатор выбора фильтра Имя прайс-листа
    private SelenideElement priceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']");

    //Локатор input для фильтра Имя прайс-листа
    private SelenideElement inputPriceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Имя прайс-листа
    private ElementsCollection inputPriceNameFilterList = $$x("//ul[@data-test-id='PriceNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Имя прайс-листа
    private SelenideElement clearPriceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']//div[@class='i-mdi-close']");


    @Step("Нажать на фильтр Имя прайс-листа")
    public GeoRegionsPage clickPriceNameFilter() {
        priceNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Имя прайс-листа")
    public GeoRegionsPage inputValuePriceNameFilter(String value, Integer sizeValue, Integer index) {
        inputPriceNameFilter.val(value);
        inputPriceNameFilterList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя прайс-листа")
    public GeoRegionsPage clickFirstElementPriceNameList() {
        inputPriceNameFilterList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя прайс-листа")
    public GeoRegionsPage clickByIndexPriceNameList(Integer index) {
        inputPriceNameFilterList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Имя прайс-листа")
    public GeoRegionsPage clickClearFilterPriceNameButton() {
        priceNameFilter.shouldBe(Condition.visible).hover();
        clearPriceNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    //Локатор выбора фильтра Регион
    private SelenideElement regionNameFilter = $x("//*[@data-test-id='RegionNameFilterSet']");

    //Локатор input для фильтра Регион
    private SelenideElement inputRegionNameFilter = $x("//*[@data-test-id='RegionNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Регион
    private ElementsCollection regionNameFiltersList = $$x("//ul[@data-test-id='RegionNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Регион
    private SelenideElement clearRegionNameFilter = $x("//*[@data-test-id='RegionNameFilterSet']//div[@class='i-mdi-close']");
    
    @Step("Нажать на фильтр Регион")
    public GeoRegionsPage clickRegionNameFilter() {
        regionNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Регион")
    public GeoRegionsPage inputValueRegionNameFilter(String value, Integer sizeValue, Integer index) {
        inputRegionNameFilter.val(value);
        regionNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Регион")
    public GeoRegionsPage clickFirstElementRegionNameList() {
        regionNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Регион")
    public GeoRegionsPage clickByIndexRegionNameList(Integer index) {
        regionNameFiltersList.get(index).click();
        return this;
    }
    
    @Step("Нажать на кнопку очистки фильтра Регион")
    public GeoRegionsPage clickClearFilterRegionButton() {
        regionNameFilter.shouldBe(Condition.visible).hover();
        clearRegionNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    //Метод ограничения данных с помощью фильтров
    @Step("Ограничить данные с помощью фильтров")
    public GeoRegionsPage inputFiltersGeoRegion(DetailsGeoRegions details) {
        if (details.getPriceList() != null) {
            clickPriceNameFilter();
            inputValuePriceNameFilter(details.getPriceList(), 1,0);
        }

        if (details.getRegion() != null) {
            clickRegionNameFilter();
            inputValueRegionNameFilter(details.getRegion(), 1, 0);
        }

        BODY.click();

        return this;
    }

    @Step("Проверяем количество выведенных строк")
    public GeoRegionsPage checkNumberOfRow(Integer number) {
        numberOfRow.shouldHave(size(number));
        return this;
    }

    @Step("Проверяем очистку полей фильтра")
    public GeoRegionsPage checkingFilterAreCleared() {
        filterCloseList.shouldHave(size(0));
        return this;
    }

    /**
     * ROW
     **/

    // Локатор количества строк
    private SelenideElement countRow = $(".rows-count");

    @Step("Проверяем количество записей в счетчике")
    public GeoRegionsPage checkCountRow(Integer countRow) {
        newRowRegion.shouldBe(size(countRow + 1));
        return this;
    }
}

package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DetailsDefineAlgorithm;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;

//page_url=https://dev-ais3.puls.ru/define-algorithm-price-code
public class DefineAlgorithmPage extends MenuPage {
    /**
     * BUTTONS
     **/

    // Метод добавление новой строки
    @Step("Добавление новой строки")
    public DefineAlgorithmPage addNewRow(DefineAlgorithmPage page, DetailsDefineAlgorithm details, Integer sizeValue) {
        clickNewRowButton(page);
        inputValuesNewLine(details, sizeValue);
        clickSaveNewRowButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    @Step("Добавление дублирующей строки")
    public DefineAlgorithmPage addDuplicateNewRow(DefineAlgorithmPage page, DetailsDefineAlgorithm details, Integer sizeValue) {
        clickNewRowButton(page);
        inputValuesNewLine(details, sizeValue);
        clickSaveNewRowButton(page);

        checkToastCardFail(page);
        checkToastCardPartialText(page, ConfigProvider.FAIL_DUPLICATE_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    @Step("Заполнить изменненные данные")
    public DefineAlgorithmPage changeDataLineDefineAlgorithm(DetailsDefineAlgorithm details) {
        DefineAlgorithmPage page = new DefineAlgorithmPage();
        if (details.getPriceList() != null) {
            clickNewRowPriceName();
            inputValueNewRowPriceName(details.getPriceList(), 1, 0);
            checkToastCardPartialText(page, ConfigProvider.SUCCESS_CHANGES);
        }

        if (details.getAlgType() != null) {
            clickNewRowAlgName();
            inputValueNewRowAlgName(details.getAlgType().getName(), 1, 0);
            checkToastCardPartialText(page, ConfigProvider.SUCCESS_CHANGES);
        }

        if (details.getWeight() != null) {
            clickNewRowWeight();
            inputValueNewRowWeight(details.getWeight());
            checkToastCardPartialText(page, ConfigProvider.SUCCESS_CHANGES);
        }

        return this;
    }



    /**
     * ADD NEW ROW
     **/

    // Локатор выбора поля Имя прайс-листа
    private ElementsCollection newRowPriceName = $$x("//*[@col-id='PriceName']");

    // Локатор добавления в поле Имя прайс-листа
    private SelenideElement inputNewRowPriceName = $x("//*[@data-test-id='PriceNameEditorSet']//input");


    // Локатор списка поля Имя прайс-листа
    private ElementsCollection newRowPriceNameList = $$x("//*[@data-test-id='PriceNameEditorSetItemsList']//li");

    @Step("Нажать на поле 'Имя прайс-листа'")
    public DefineAlgorithmPage clickNewRowPriceName() {
        newRowPriceName.get(1).doubleClick();
        return this;
    }
    @Step("Ввести значение '{value}' в поле 'Имя прайс-листа'")
    public DefineAlgorithmPage inputValueNewRowPriceName(String value, Integer sizeValue, Integer index) {
        inputNewRowPriceName.shouldBe(Condition.visible).val(value);
        newRowPriceNameList.shouldHave(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке 'Имя прайс-лист' в новой строке")
    public DefineAlgorithmPage clickNewRowFirstElementPriceNameList() {
        newRowPriceNameList.first().click();
        return this;
    }

    @Step("Нажать на '{index}' элемент в выпадающем списке 'Имя прайс-листа' в новой строке")
    public DefineAlgorithmPage clickNewRowByIndexPriceNameList(Integer index) {
        newRowPriceNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Имя алгоритма
    private ElementsCollection newRowAlgName = $$x("//*[@col-id='AlgName']");

    // Локатор ввода в поле Имя алгоритма
    private SelenideElement inputNewRowAlgName = $x("//*[@data-test-id='AlgNameEditorSet']//input");


    // Локатор списка поля Имя алгоритма
    private ElementsCollection newRowAlgNameList = $$x("//*[@data-test-id='AlgNameEditorSetItemsList']//li");

    @Step("Нажать на поле Имя алгоритмав новой строке")
    public DefineAlgorithmPage clickNewRowAlgName() {
        newRowAlgName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение '{value}' в поле 'Имя алгоритма' в новой строке")
    public DefineAlgorithmPage inputValueNewRowAlgName(String value, Integer sizeValue, Integer index) {
        inputNewRowAlgName.val(value);
        newRowAlgNameList.shouldHave(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке 'Имя алгоритма' в новой строке")
    public DefineAlgorithmPage clickNewRowFirstElementAlgNameList() {
        newRowAlgNameList.first().click();
        return this;
    }

    @Step("Нажать на '{index}' элемент в выпадающем списке 'Имя алгоритма' в новой строке")
    public DefineAlgorithmPage clickNewRowByIndexAlgNameList(Integer index) {
        newRowAlgNameList.get(index).click();
        return this;
    }

    // Локатор списка элементов поля Вес
    private ElementsCollection rowWeightList = $$x("//*[@col-id='Weight']");

    // Локатор выбора поля Вес
    private SelenideElement newRowWeight= $x("//*[@data-test-id='WeightEditorNumber']");

    // Локатор ввода в поле Вес
    private SelenideElement inputNewRowWeight = $x("//*[@data-test-id='WeightEditorNumber']//input");



    @Step("Нажать на поле 'Вес' в новой строке")
    public DefineAlgorithmPage clickNewRowWeight() {
        rowWeightList.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение '{value}' в поле 'Вес'")
    public DefineAlgorithmPage inputValueNewRowWeight(String value) {
        inputNewRowWeight.val(value).sendKeys(Keys.ENTER);
        return this;
    }

    /**
     * FILTERS
     **/

    // Локатор фильтра Имя прайс-листа
    private SelenideElement priceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']");

    //Локатор input для фильтра Имя прайс-листа
    private SelenideElement inputPriceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Имя прайс-листа
    private ElementsCollection priceNameFiltersList = $$x("//ul[@data-test-id='PriceNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Имя прайс-листа
    private SelenideElement clearPriceNameFilter = $x("//*[@data-test-id='PriceNameFilterSet']//div[@class='i-mdi-close']");

    @Step("Нажать на фильтр Имя прайс-листа")
    public DefineAlgorithmPage clickPriceNameFilter() {
        priceNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Имя прайс-листа")
    public DefineAlgorithmPage inputValuePriceNameFilter(String value, Integer sizeValue, Integer index) {
        inputPriceNameFilter.val(value);
        priceNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя прайс-листа")
    public DefineAlgorithmPage clickFirstElementPriceNameList() {
        priceNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя прайс-листа")
    public DefineAlgorithmPage clickByIndexPriceNameList(Integer index) {
        priceNameFiltersList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Имя прайс-листа")
    public DefineAlgorithmPage clickClearFilterPriceNameButton() {
        priceNameFilter.shouldBe(Condition.visible).hover();
        clearPriceNameFilter.shouldBe(Condition.visible).click();
        return this;
    }


    // Локатор фильтра Имя алгоритма
    private SelenideElement algNameFilter = $x("//*[@data-test-id='AlgNameFilterSet']");

    //Локатор input для фильтра Имя алгоритма
    private SelenideElement inputAlgNameFilter = $x("//*[@data-test-id='AlgNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Имя алгоритма
    private ElementsCollection algNameFiltersList = $$x("//ul[@data-test-id='AlgNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Имя алгоритма
    private SelenideElement clearAlgNameFilter = $x("//*[@data-test-id='AlgNameFilterSet']//div[@class='i-mdi-close']");

    @Step("Нажать на фильтр Имя алгоритма")
    public DefineAlgorithmPage clickAlgNameFilter() {
        algNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Имя алгоритма")
    public DefineAlgorithmPage inputValueAlgNameFilter(String value, Integer sizeValue, Integer index) {
        inputAlgNameFilter.val(value);
        algNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя алгоритма")
    public DefineAlgorithmPage clickFirstElementAlgNameList() {
        algNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя алгоритма")
    public DefineAlgorithmPage clickByIndexAlgNameList(Integer index) {
        algNameFiltersList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Имя алгоритма")
    public DefineAlgorithmPage clickClearFilterAlgNameButton() {
        algNameFilter.shouldBe(Condition.visible).hover();
        clearAlgNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    // Локатор фильтра Филиал
    private SelenideElement filialNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']");

    //Локатор input для фильтра Филиал
    private SelenideElement inputFilialNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Филиал
    private ElementsCollection filialNameFiltersList = $$x("//ul[@data-test-id='FilialNameFilterSetItemsList']//li");

    //Локатор очистки фильтра Филиал
    private SelenideElement clearFilialNameFilter = $x("//*[@data-test-id='FilialNameFilterSet']//div[@class='i-mdi-close']");

    @Step("Нажать на фильтр Филиал")
    public DefineAlgorithmPage clickFilialNameFilter() {
        filialNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Филиал")
    public DefineAlgorithmPage inputValueFilialNameFilter(String value, Integer sizeValue, Integer index) {
        inputFilialNameFilter.val(value);
        filialNameFiltersList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Филиал")
    public DefineAlgorithmPage clickFirstElementFilialNameList() {
        filialNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Филиал")
    public DefineAlgorithmPage clickByIndexFilialNameList(Integer index) {
        filialNameFiltersList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Филиал")
    public DefineAlgorithmPage clickClearFilterFilialButton() {
        filialNameFilter.shouldBe(Condition.visible).hover();
        clearFilialNameFilter.shouldBe(Condition.visible).click();
        return this;
    }

    // Локатор фильтра Вес
    private SelenideElement weightFilter = $x("//*[@data-test-id='WeightFilterNumber']");

    //Локатор input для фильтра Вес
    private SelenideElement inputWeightFilter = $x("//*[@data-test-id='WeightFilterNumber']//input");

    @Step("Нажать на фильтр Вес")
    public DefineAlgorithmPage clickWeightFilter() {
        weightFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" '{value}' \" в выпадающем списке Вес")
    public DefineAlgorithmPage inputValueWeightFilter(String value) {
        inputWeightFilter
                .val(value)
                .sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Нажать на кнопку очистки фильтра Вес")
    public DefineAlgorithmPage clickClearFilterWeight() {
        weightFilter
                .shouldBe(Condition.visible)
                .click();
        inputWeightFilter.sendKeys(Keys.BACK_SPACE);
        return this;
    }

    /**
     * ROW
     **/

    @Step("Добавление новой строки")
    public DefineAlgorithmPage inputValuesNewLine(DetailsDefineAlgorithm details, Integer sizeValue) {
        inputValueNewRowPriceName(details.getPriceList(), sizeValue, 0);

        clickNewRowAlgName();
        inputValueNewRowAlgName(details.getAlgType().getName(), 6, details.getAlgType().getIndex());

        clickNewRowWeight();
        inputValueNewRowWeight(details.getWeight());

        return this;
    }

    //Метод ограничения данных с помощью фильтров
    @Step("Ограничить данные с помощью фильтров")
    public DefineAlgorithmPage inputFiltersDefineAlgorithm(DetailsDefineAlgorithm details) {
        if (details.getPriceList() != null) {
            clickPriceNameFilter();
            inputValuePriceNameFilter(details.getPriceList(), 1,0);
        }

        if (details.getAlgType() != null) {
            clickAlgNameFilter();
            inputValueAlgNameFilter(details.getAlgType().getName(), 1, 0);
        }

        if (details.getFilial() != null) {
            clickFilialNameFilter();
            inputValueFilialNameFilter(details.getFilial(), 1, 0);
        }

        if (details.getWeight() != null) {
            clickWeightFilter();
            inputValueWeightFilter(details.getWeight());
        }

        return this;
    }

    @Step("Проверяем очистку полей фильтра")
    public DefineAlgorithmPage checkingFilterAreCleared() {
        filterCloseList.shouldHave(size(0));
        return this;
    }


    // Локатор удаления первого элемента в списке
    @Step("Нажать на кнопку удаления первого элемента в списке")
    public DefineAlgorithmPage clickFirstElementDeleteButtonsList() {
        deleteRowButtonsList.first().click();
        return this;
    }

    @Step("Нажать на '{index}' элемент в списке кнопок Удаления")
    public DefineAlgorithmPage clickByIndexDeleteButtonsList(Integer index) {
        deleteRowButtonsList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку 'Подтвердить' в диалоговом окне")
    public DefineAlgorithmPage clickConfirmationDialogConfirmButton() {
        confirmationDialogConfirmButton.click();
        return this;
    }

    @Step("Нажать на кнопку 'Отменить' в диалоговом окне")
    public DefineAlgorithmPage clickConfirmationDialogCancelButton() {
        confirmationDialogCancelButton.click();
        return this;
    }

    @Step("Проверяем количество выведенных строк")
    public DefineAlgorithmPage checkNumberOfRow(Integer number) {
        numberOfRow.shouldHave(size(number));
        return this;
    }
}

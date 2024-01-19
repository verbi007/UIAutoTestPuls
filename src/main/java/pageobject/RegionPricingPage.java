package pageobject;

import com.codeborne.selenide.*;
import data.DetailsRegionPricing;
import io.qameta.allure.Step;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

//page_url = https://dev-ais3.puls.ru/pricing-regions
public class RegionPricingPage extends MenuPage {

    /**
    * ADD NEW ROW
    **/

    // Локатор выбора поля Филиал
    private SelenideElement inputNewRowFilialPricingRegion = $x("//*[@data-test-id='FilialNameEditorSet']//input");


    // Локатор добавление в новую строку Филиал
    private ElementsCollection newRowFilialPricingRegionsList = $$x("//*[@data-test-id='FilialNameEditorSetItemsList']//li");

    @Step("Нажать на поле Филиал в новой строке")
    public RegionPricingPage clickNewRowFilialName() {
        inputNewRowFilialPricingRegion.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение {value} в поле Филиал")
    public RegionPricingPage inputValueNewRowFilial(String value, Integer sizeValue) {
        inputNewRowFilialPricingRegion.val(value);
        newRowFilialPricingRegionsList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке филиалов в новой строке")
    public RegionPricingPage clickNewRowFirstElementFilialList() {
        newRowFilialPricingRegionsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке филиалов в новой строке")
    public RegionPricingPage clickNewRowByIndexFilialList(Integer index) {
        ddlFilialPricingRegionsList.get(index).click();
        return this;
    }

    // Локатор выбора поля Имя прайс-листа
    private ElementsCollection newRowPriceCodeNamePricingRegion = $$x("//*[@col-id='PriceCodeName']");

    // Локатор ввода в поле Имя прайс-листа
    private SelenideElement inputNewRowPriceCodeName = $x("//*[@data-test-id='PriceCodeNameEditorSet']//input");

    // Локатор добавление в новую строку Имя прайс-листа
    private ElementsCollection newRowPriceCodeNamePricingRegionsList = $$x("//*[@data-test-id='PriceCodeNameEditorSetItemsList']//li");

    @Step("Нажать на поле Имя прайс-листа в новой строке")
    public RegionPricingPage clickNewRowPriceCodeName() {
        newRowPriceCodeNamePricingRegion.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Имя прайс-листа в новой строке")
    public RegionPricingPage inputValueNewRowPriceCodeName(String value, Integer sizeValue, Integer index) {
        inputNewRowPriceCodeName.val(value);
        newRowPriceCodeNamePricingRegionsList.shouldHave(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя прайс-листа в новой строке")
    public RegionPricingPage clickNewRowFirstElementPriceCodeNameList() {
        newRowPriceCodeNamePricingRegionsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя прайс-листа в новой строке")
    public RegionPricingPage clickNewRowByIndexPriceCodeNameList(Integer index) {
        ddlFilialPricingRegionsList.get(index).click();
        return this;
    }

    // Локатор выбора поля Регион ценообразования
    private ElementsCollection newRowPricingRegionName = $$x("//*[@col-id='PricingRegionName']");

    // Локатор ввода в поле Регион ценообразования
    private SelenideElement inputNewRowPricingRegionName = $x("//*[@data-test-id='PricingRegionNameEditorSet']//input");


    // Локатор добавление в новую строку Регион ценообразования
    private ElementsCollection newRowPricingRegionNameList = $$x("//*[@data-test-id='PricingRegionNameEditorSetItemsList']//li");

    @Step("Нажать на поле Регион ценообразования в новой строке")
    public RegionPricingPage clickNewRowPricingRegionName() {
        newRowPricingRegionName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Регион ценообразования в новой строке")
    public RegionPricingPage inputValueNewRowPricingRegionName(String value, Integer sizeValue) {
        inputNewRowPricingRegionName.val(value);
        newRowPricingRegionNameList.shouldHave(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Регион ценообразования в новой строке")
    public RegionPricingPage clickNewRowFirstElementPricingRegionNameList() {
        newRowPriceCodeNamePricingRegionsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Регион ценообразования в новой строке")
    public RegionPricingPage clickNewRowByIndexPricingRegionNameList(Integer index) {
        ddlFilialPricingRegionsList.get(index).click();
        return this;
    }

    // Локатор выбора поля Подразделение
    private ElementsCollection newRowSubdivisionName = $$x("//*[@col-id='SubdivisionName']");

    // Локатор ввода в поле Подразделение
    private SelenideElement inputNewRowSubdivisionName = $x("//*[@data-test-id='SubdivisionNameEditorSet']//input");


    // Локатор добавление в новую строку Подразделение
    private ElementsCollection newRowSubdivisionNameList = $$x("//*[@data-test-id='SubdivisionNameEditorSetItemsList']//li");

    @Step("Нажать на поле Подразделение в новой строке")
    public RegionPricingPage clickNewRowSubdivisionName() {
        newRowSubdivisionName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Подразделение в новой строке")
    public RegionPricingPage inputValueNewRowSubdivisionName(String value, Integer sizeValue ) {
        inputNewRowSubdivisionName.val(value);
        newRowSubdivisionNameList.shouldBe(size(sizeValue)).get(0).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Подразделение в новой строке")
    public RegionPricingPage clickNewRowFirstElementSubdivisionNameList() {
        newRowSubdivisionNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Подразделение в новой строке")
    public RegionPricingPage clickNewRowByIndexSubdivisionNameList(Integer index) {
        newRowSubdivisionNameList.get(index).click();
        return this;
    }

    // Локатор чекбокса Контроль наценки
    private SelenideElement checkboxIsMarkUpControl = $x("//*[@data-test-id='IsMarkUpControlCheckboxRenderer']");

    @Step("Нажать на чекбокс Контроль наценки")
    public RegionPricingPage clickCheckboxIsMarkUpControl() {
        checkboxIsMarkUpControl.click();
        return this;
    }

    // Локатор чекбокса ФЗ-223
    private SelenideElement checkboxIsFederalLaw223 = $x("//*[@data-test-id='FederalLaw223CheckboxRenderer']");

    @Step("Нажать на чекбокс ФЗ-223")
    public RegionPricingPage clickCheckboxIsFederalLaw223() {
        checkboxIsFederalLaw223.click();
        return this;
    }

    // Локатор чекбокса ППР
    private SelenideElement checkboxIsLastHandRule = $x("//*[@data-test-id='LastHandRuleCheckboxRenderer']");

    @Step("Нажать на чекбокс ППР (Правило последней руки)")
    public RegionPricingPage clickCheckboxIsLastHandRule() {
        checkboxIsLastHandRule.click();
        return this;
    }

    // Локатор выбора поля Группа прайс-листов
    private ElementsCollection newRowPriceGroupName = $$x("//*[@col-id='PriceGroupName']");

    // Локатор ввода в поле Группа прайс-листов
    private SelenideElement inputNewRowPriceGroupName = $x("//*[@data-test-id='PriceGroupNameEditorSet']//input");


    // Локатор добавление в новую строку Группа прайс-листов
    private ElementsCollection newRowPriceGroupNameList = $$x("//*[@data-test-id='PriceGroupNameEditorSetItemsList']//li");

    @Step("Нажать на поле Группа прайс-листов в новой строке")
    public RegionPricingPage clickNewRowPriceGroupName() {
        newRowPriceGroupName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Группа прайс-листов в новой строке")
    public RegionPricingPage inputValueNewRowPriceGroupName(String value, Integer sizeValue, Integer index) {
        inputNewRowPriceGroupName.val(value);
        newRowPriceGroupNameList.shouldBe(size(sizeValue)).get(index).click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Группа прайс-листов в новой строке")
    public RegionPricingPage clickNewRowFirstElementPriceGroupNameList() {
        newRowPriceGroupNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Группа прайс-листов в новой строке")
    public RegionPricingPage clickNewRowByIndexPriceGroupNameList(Integer index) {
        newRowPriceGroupNameList.get(index).click();
        return this;
    }

    // Локатор выбора поля Специалист
    private ElementsCollection newRowUserName = $$x("//*[@col-id='UserName']");

    // Локатор ввода в поле Специалист
    private SelenideElement inputNewRowUserName = $x("//*[@data-test-id='UserNameEditorSet']//input");


    // Локатор добавление в новую строку Специалист
    private ElementsCollection newRowUserNameList = $$x("//*[@data-test-id='UserNameEditorSetItemsList']//li");

    @Step("Нажать на поле Специалист в новой строке")
    public RegionPricingPage clickNewRowUserName() {
        newRowUserName.get(1).doubleClick();
        return this;
    }

    @Step("Ввести значение {value} в поле Специалист в новой строке")
    public RegionPricingPage inputValueNewRowUserName(String value, Integer sizeValue, Integer index) {
        inputNewRowUserName.val(value);
        newRowUserNameList
                .shouldBe(size(sizeValue))
                .get(index)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Специалист в новой строке")
    public RegionPricingPage clickNewRowFirstElementUserNameList() {
        newRowUserNameList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Специалист в новой строке")
    public RegionPricingPage clickNewRowByIndexUserNameList(Integer index) {
        newRowUserNameList.get(index).click();
        return this;
    }

    // Удаление строк
    @Step("Нажать на первую кнопку удаления записи в столбце")
    public RegionPricingPage clickFirstElementDeleteButtonsList() {
        deleteRowButtonsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в столбце кнопок удаления записей")
    public RegionPricingPage clickByIndexDeleteButtonsList(Integer index) {
        deleteRowButtonsList.get(index).click();
        return this;
    }

    @Step("Нажать на кнопку Подтвердить в диалоговом окне")
    public RegionPricingPage clickConfirmationDialogConfirmButton() {
        confirmationDialogConfirmButton.click();
        return this;
    }

    @Step("Нажать на кнопку Отмена в диалоговом окне")
    public RegionPricingPage clickConfirmationDialogCancelButton() {
        confirmationDialogCancelButton.click();
        return this;
    }



    /**
    * FILTERS
    **/

    //Локатор выбора фильтра Филиала
    private SelenideElement ddlFilialPricingRegion = $x("//*[@data-test-id='FilialNameFilterSet']");

    //Локатор input для поля Филиал
    private SelenideElement inputFilialPricingRegion = $x("//*[@data-test-id='FilialNameFilterSet']//input");


    //Локатор фильтра выпадающего списка Филиалов
    private ElementsCollection ddlFilialPricingRegionsList = $$x("//ul[@data-test-id='FilialNameFilterSetItemsList']//li");

    @Step("Нажать на фильтр Филиал")
    public RegionPricingPage clickFilialNameFilter() {
        ddlFilialPricingRegion.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке филиалов")
    public RegionPricingPage inputValueFilialFilter(String value) {
        inputFilialPricingRegion.val(value);
        ddlFilialPricingRegionsList
                .shouldBe(size(1))
                .get(0)
                .click();

        return this;
    }
    
    @Step("Нажать на первый элемент в выпадающем списке филиалов")
    public RegionPricingPage clickFirstElementFilialList() {
        ddlFilialPricingRegionsList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке филиалов")
    public RegionPricingPage clickByIndexFilialList(Integer index) {
        ddlFilialPricingRegionsList.get(index).click();
        return this;
    }


    //Локатор выбора фильтра Имя прайс-листа
    private SelenideElement ddlPriceNameFilter = $x("//*[@data-test-id='PriceCodeNameFilterSet']");

    //Локатор input для поля Имя прайс-листа
    private SelenideElement inputPriceNameFilter = $x("//*[@data-test-id='PriceCodeNameFilterSet']//input");

    //Локатор фильтра выпадающего списка Имя прайс-листа
    private ElementsCollection ddlPriceNameFilterList = $$x("//ul[@data-test-id='PriceCodeNameFilterSetItemsList']//li");


    @Step("Нажать на фильтр Имя прайс-листа")
    public RegionPricingPage clickPriceNameFilter() {
        ddlPriceNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Имя прайс-листа")
    public RegionPricingPage inputValuePriceNameFilter(String value) {
        inputPriceNameFilter.val(value);
        ddlPriceNameFilterList
                .shouldBe(size(1))
                .get(0)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Имя прайс-листа")
    public RegionPricingPage clickFirstElementPriceNameList() {
        ddlPriceNameFilterList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Имя прайс-листа")
    public RegionPricingPage clickByIndexPriceNameList(Integer index) {
        ddlPriceNameFilterList.get(index).click();
        return this;
    }

    //Локатор выбора фильтра Регион ценообразования
    private SelenideElement ddlPricingRegionNameFilter = $x("//*[@data-test-id='PricingRegionNameFilterSet']");

    //Локатор input для поля Регион ценообразования
    private SelenideElement inputPricingRegionNameFilter = $x("//*[@data-test-id='PricingRegionNameFilterSet']//input");
   
    //Локатор фильтра выпадающего списка Имя прайс-листа
    private ElementsCollection ddlPricingRegionNameFiltersList = $$x("//ul[@data-test-id='PricingRegionNameFilterSetItemsList']//li");


    @Step("Нажать на фильтр Регион ценообразования")
    public RegionPricingPage clickPricingRegionNameFilter() {
        ddlPricingRegionNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Регион ценообразования")
    public RegionPricingPage inputValuePricingRegionNameFilter(String value) {
        inputPricingRegionNameFilter.val(value);
        ddlPricingRegionNameFiltersList
                .shouldBe(size(1))
                .get(0)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Регион ценообразования")
    public RegionPricingPage clickFirstElementPricingRegionNameList() {
        ddlPricingRegionNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Регион ценообразования")
    public RegionPricingPage clickByIndexPricingRegionNameList(Integer index) {
        ddlPricingRegionNameFiltersList.get(index).click();
        return this;
    }

    //Локатор выбора фильтра Подразделение
    private SelenideElement ddlSubdivisionNameFilter = $x("//*[@data-test-id='SubdivisionNameFilterSet']");

    //Локатор input для поля Подразделение
    private SelenideElement inputSubdivisionNameFilter = $x("//*[@data-test-id='SubdivisionNameFilterSet']//input");
    
    //Локатор фильтра выпадающего списка Подразделение
    private ElementsCollection ddlSubdivisionNameFiltersList = $$x("//ul[@data-test-id='SubdivisionNameFilterSetItemsList']//li");


    @Step("Нажать на фильтр Подразделение")
    public RegionPricingPage clickSubdivisionNameFilter() {
        ddlSubdivisionNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Подразделение")
    public RegionPricingPage inputValueSubdivisionNameFilter(String value) {
        inputSubdivisionNameFilter.val(value);
        ddlSubdivisionNameFiltersList
                .shouldBe(size(1))
                .get(0)
                .click();
        return this;
    }
    
    @Step("Нажать на первый элемент в выпадающем списке Подразделение")
    public RegionPricingPage clickFirstElementSubdivisionNameList() {
        ddlSubdivisionNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Подразделение")
    public RegionPricingPage clickByIndexSubdivisionNameList(Integer index) {
        ddlSubdivisionNameFiltersList.get(index).click();
        return this;
    }

    //Локатор выбора фильтра Группа прайс-листа
    private SelenideElement ddlPriceGroupNameFilter = $x("//*[@data-test-id='PriceGroupNameFilterSet']");

    //Локатор input для поля Группа прайс-листа
    private SelenideElement inputPriceGroupNameFilter = $x("//*[@data-test-id='PriceGroupNameFilterSet']//input");
    
    //Локатор фильтра выпадающего списка Группа прайс-листа
    private ElementsCollection ddlPriceGroupNameFiltersList = $$x("//ul[@data-test-id='PriceGroupNameFilterSetItemsList']//li");


    @Step("Нажать на фильтр Группа прайс-листа")
    public RegionPricingPage clickPriceGroupNameFilter() {
        ddlPriceGroupNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Группа прайс-листа")
    public RegionPricingPage inputValuePriceGroupNameFilter(String value) {
        inputPriceGroupNameFilter.val(value);
        ddlPriceGroupNameFiltersList
                .shouldBe(size(1))
                .get(0)
                .click();
        return this;
    }
    
    @Step("Нажать на первый элемент в выпадающем списке Группа прайс-листа")
    public RegionPricingPage clickFirstElementPriceGroupNameList() {
        ddlPriceGroupNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Группа прайс-листа")
    public RegionPricingPage clickByIndexPriceGroupNameList(Integer index) {
        ddlPriceGroupNameFiltersList.get(index).click();
        return this;
    }

    //Локатор выбора фильтра Специалист
    private SelenideElement ddlUserNameFilter = $x("//*[@data-test-id='UserNameFilterSet']");

    //Локатор input для поля Специалист
    private SelenideElement inputUserNameFilter = $x("//*[@data-test-id='UserNameFilterSet']//input");
    
    //Локатор фильтра выпадающего списка Специалист
    private ElementsCollection ddlUserNameFiltersList = $$x("//ul[@data-test-id='UserNameFilterSetItemsList']//li");


    @Step("Нажать на фильтр Специалист")
    public RegionPricingPage clickUserNameFilter() {
        ddlUserNameFilter.shouldBe(Condition.exist).click();
        return this;
    }

    @Step("Ввести значение \" {value} \" в выпадающем списке Специалист")
    public RegionPricingPage inputValueUserNameFilter(String value) {
        inputUserNameFilter.val(value);
        ddlUserNameFiltersList
                .shouldBe(size(1))
                .get(0)
                .click();
        return this;
    }

    @Step("Нажать на первый элемент в выпадающем списке Специалист")
    public RegionPricingPage clickFirstElementUserNameList() {
        ddlUserNameFiltersList.first().click();
        return this;
    }

    @Step("Нажать на {index} элемент в выпадающем списке Специалист")
    public RegionPricingPage clickByIndexUserNameList(Integer index) {
        ddlUserNameFiltersList.get(index).click();
        return this;
    }

    // Метод добавления новой строки
    @Step("Добавление новой строки")
    public RegionPricingPage addNewRow(RegionPricingPage page, DetailsRegionPricing details) {
        clickNewRowButton(page);
        inputValuesNewLine(details);
        clickBody();
        clickSaveNewRowButton(page);

        checkToastCardSuccess(page);
        checkToastCardText(page, ConfigProvider.SUCCESS_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    // Метод добавления дублирующей строки
    @Step("Добавление дублирующей строки")
    public RegionPricingPage addDuplicateNewRow(RegionPricingPage page, DetailsRegionPricing details) {
        clickNewRowButton(page);
        inputValuesNewLine(details);
        clickSaveNewRowButton(page);

        checkToastCardFail(page);
        checkToastCardPartialText(page, ConfigProvider.FAIL_DUPLICATE_ADD);

        clickCloseButtonToastCard(page);
        return this;
    }

    //Метод ограничения данных с помощью фильтров
    @Step("Ограничить данные с помощью фильтров")
    public RegionPricingPage inputFiltersPricingRegion(DetailsRegionPricing details) throws InterruptedException {
        if (details.getFilial() != null) {
            clickFilialNameFilter();
            inputValueFilialFilter(details.getFilial());
        }

        if (details.getPriceList() != null) {
            clickPriceNameFilter();
            inputValuePriceNameFilter(details.getPriceList());
        }

        if (details.getRegion() != null) {
            clickPricingRegionNameFilter();
            inputValuePricingRegionNameFilter(details.getRegion());
        }

        if (details.getSubdivision() != null) {
            clickSubdivisionNameFilter();
            inputValueSubdivisionNameFilter(details.getSubdivision());
        }

        if (details.getPriceGroup() != null) {
            clickPriceGroupNameFilter();
            inputValuePriceGroupNameFilter(details.getPriceGroup());
        }

        if (details.getUserName() != null) {
            clickUserNameFilter();
            inputValueUserNameFilter(details.getUserName());
        }

        Selenide.switchTo().defaultContent();
        return this;
    }

    @Step("Проверяем количество выведенных строк")
    public RegionPricingPage checkNumberOfRow() {
        numberOfRow.shouldHave(size(1));
        return this;
    }


    //Метод добавление новой строки
    @Step("Ввести данные в поля для новой строки в раздлеле Регионы ценообразования")
    public RegionPricingPage inputValuesNewLine(DetailsRegionPricing details) {
        inputValueNewRowFilial(details.getFilial(), 1);

        clickNewRowPriceCodeName();
        inputValueNewRowPriceCodeName(details.getPriceList(), 1, 0);

        clickNewRowPricingRegionName();
        inputValueNewRowPricingRegionName(details.getRegion(), 1);

        clickNewRowSubdivisionName();
        inputValueNewRowSubdivisionName(details.getSubdivision(), 1);

        if (details.isMarkUpControl() != null && Boolean.TRUE.equals(details.isMarkUpControl())) clickCheckboxIsMarkUpControl();
        if (details.isFederalLaw223() != null && Boolean.TRUE.equals(details.isFederalLaw223())) clickCheckboxIsFederalLaw223();
        if (details.isLastHandRule() != null && Boolean.TRUE.equals(details.isLastHandRule())) clickCheckboxIsLastHandRule();

        if (details.getPriceGroup() != null) {
            clickNewRowPriceGroupName();
            inputValueNewRowPriceGroupName(details.getPriceGroup(), 2, 1);
        }

        clickNewRowUserName();
        inputValueNewRowUserName(details.getUserName(), 1, 0);
        return this;
    }

    //Метод заполнения измененных данных
    @Step("Заполнить изменненные данные")
    public RegionPricingPage changeDataPricingRegion(DetailsRegionPricing details) throws InterruptedException {
        RegionPricingPage page = new RegionPricingPage();
        if (details.getPriceList() != null) {
            clickNewRowPriceCodeName();
            inputValueNewRowPriceCodeName(details.getPriceList(), 1, 0);
            clickCloseButtonToastCard(page);
        }

        if (details.getRegion() != null) {
            clickNewRowPricingRegionName();
            inputValueNewRowPricingRegionName(details.getRegion(), 1);
            clickCloseButtonToastCard(page);
        }

        if (details.getSubdivision() != null) {
            clickNewRowSubdivisionName();
            inputValueNewRowSubdivisionName(details.getSubdivision(), 1);
            clickCloseButtonToastCard(page);
        }

        if (details.isMarkUpControl() != null && Boolean.TRUE.equals(details.isMarkUpControl())) {
            clickCheckboxIsMarkUpControl();
            clickCloseButtonToastCard(page);
        }
        if (details.isFederalLaw223() != null && Boolean.TRUE.equals(details.isFederalLaw223() )) {
            clickCheckboxIsFederalLaw223();
            clickCloseButtonToastCard(page);
        }
        if (details.isLastHandRule() != null && Boolean.TRUE.equals(details.isLastHandRule())) {
            clickCheckboxIsLastHandRule();
            clickCloseButtonToastCard(page);
        }

        if (details.getPriceGroup() != null) {
            clickNewRowPriceGroupName();
            inputValueNewRowPriceGroupName(details.getPriceGroup(), 2, 1);
            clickCloseButtonToastCard(page);
        }

        if (details.getUserName() != null) {
            clickNewRowUserName();
            inputValueNewRowUserName(details.getUserName(), 1, 0);
            clickCloseButtonToastCard(page);
        }
        return this;
    }

}
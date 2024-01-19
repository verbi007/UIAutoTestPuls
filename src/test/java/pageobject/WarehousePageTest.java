package pageobject;

import data.DetailsWarehouseLink;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static data.DetailsWarehouseLinkKt.*;

@Story("Checking the operation of the Warehouse Link section")
public class WarehousePageTest extends BaseTest{
    private DetailsWarehouseLink details;
    private WarehouseLinkPage page;
    @Test
    @DisplayName("Checking the addition of a new line in the Warehouse Link section")
    @Description("Checking:\n" + " - new line is added, data is added, there is a notification about a successful operation")
    public void addNewLineWarehouseLink() throws InterruptedException {
        details = getWarehouseLinkFirstDetails();
        page = new WarehouseLinkPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuWarehouse()
                .addNewRow(page, details)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the addition of duplicate line in the Warehouse Link section")
    @Description("Checking:\n" + " - the duplicate line is not added, the data is not saved, there is a notification about an incorrect operation")
    public void addDuplicateLineWarehouseLink() throws InterruptedException {
        details = getWarehouseLinkSecondDetails();
        page = new WarehouseLinkPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuWarehouse()
                .addNewRow(page, details)

                .addDuplicateNewRow(page, details)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking data changes in the Warehouse Link section")
    @Description("Checking:\n" + " - the changed data is added, the data is saved, there is a notification about the successful operation")
    public void changeLineWarehouseLink() throws InterruptedException {
        details = getWarehouseLinkSecondDetails();
        page = new WarehouseLinkPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuWarehouse()
                .addNewRow(page, details)

                .changeDataWarehouseLink(getWarehouseLinkFiveDetails())

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the filter operation of the Filial name field in the Warehouse Link section")
    @Description("Checking:\n" + " - filter the Filial name field in the Warehouse Link section works")
    public void setFilterFilialNameWarehouseLink() throws InterruptedException {
        details = getWarehouseLinkThirdDetails();
        page = new WarehouseLinkPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuWarehouse()

                .inputFiltersWarehouseLink(details)
                .checkNumberOfRow(1);
    }

    @Test
    @DisplayName("Checking the filter operation in the Warehouse Link section")
    @Description("Checking:\n" + " - filter in the Warehouse Link section works")
    public void setFilterWarehouseLink() throws InterruptedException {
        details = getWarehouseLinkFourDetails();
        page = new WarehouseLinkPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuWarehouse()

                .inputFiltersWarehouseLink(details)
                .checkNumberOfRow(1);
    }

}

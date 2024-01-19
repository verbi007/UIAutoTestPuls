package pageobject;


import data.DetailsRegionPricing;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

import static com.codeborne.selenide.Selenide.open;
import static data.DetailsRegionPricingKt.*;

@Isolated
@Story("Checking the operation of the Pricing Regions section")
class RegionPricingPageTest extends BaseTest {
    private DetailsRegionPricing details;
    private RegionPricingPage page = new RegionPricingPage();

    @Test
    @DisplayName("Checking the addition of a new line in the Pricing Regions section")
    @Description("Checking:\n" + " - new line is added, data is added, there is a notification about a successful operation")
    public void addNewLinePricingRegion() throws InterruptedException {
        details = getPricingRegionFirstDetails();
        page = new RegionPricingPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .addNewRow(page, details)

                .clickUpdateButton(page)
                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the deletion of a line in the Pricing Regions section")
    @Description("Checking:\n" + " - line is deleted, there is a notification about a successful operation")
    public void checkDeleteRowPricingRegion() throws InterruptedException {
        details = getPricingRegionSecondDetails();
        page = new RegionPricingPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .addNewRow(page, details)

                .clickUpdateButton(page)
                .deleteRow(page);
    }


    @Test
    @DisplayName("Checking the filter operation of the Price List name field in the Pricing regions section")
    @Description("Checking:\n" + " - filter the Price list name field in the Pricing regions section works")
    public void setFilterPriceCodeNamePricingRegion() throws InterruptedException {
        details = getPricingRegionFilterPriceList();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .inputFiltersPricingRegion(details)
                .checkNumberOfRow();
    }

    @Test
    @DisplayName("Checking the filter operation of the Pricing Region name field in the Pricing regions section")
    @Description("Checking:\n" + " - filter the Pricing region name field in the Pricing regions section works")
    public void setFilterRegionPricingRegion() throws InterruptedException {
        details = getPricingRegionFilterRegion();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .inputFiltersPricingRegion(details)
                .checkNumberOfRow();
    }

    @Test
    @DisplayName("Checking the filter operation of the Price Group name field in the Pricing regions section")
    @Description("Checking:\n" + " - filter the Price Group name field in the Pricing regions section works")
    public void setFilterPriceGroupPricingRegion() throws InterruptedException {
        details = getPricingRegionFilterPriceGroup();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .inputFiltersPricingRegion(details)
                .checkNumberOfRow();
    }

    @Test
    @DisplayName("Checking the filter operation of the Username name field in the Pricing regions section")
    @Description("Checking:\n" + " - filter the Username name field in the Pricing regions section works")
    public void setFilterUserNamePricingRegion() throws InterruptedException {
        details = getPricingRegionFilterUserName();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .inputFiltersPricingRegion(details)
                .checkNumberOfRow();
    }

    @Test
    @DisplayName("Checking the addition of duplicate line in the Pricing Regions section")
    @Description("Checking:\n" + " - the duplicate line is not added, the data is not saved, there is a notification about an incorrect operation")
    public void addDuplicateLinePricingRegion() throws InterruptedException {
        details = getPricingRegionDuplicate();
        page = new RegionPricingPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .addNewRow(page, details)

                .addDuplicateNewRow(page, details)

                .clickUpdateButton(page)
                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking data changes in the Pricing Regions section")
    @Description("Checking:\n" + " - the changed data is added, the data is saved, there is a notification about the successful operation")
    public void changeDatePricingRegion() throws InterruptedException {
        details = getPricingRegionFirstChange();
        page = new RegionPricingPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuPricingRegion()
                .addNewRow(page, details)

                .changeDataPricingRegion(getPricingRegionSecondChange())

                .deleteRow(page);
    }

}
package pageobject;

import data.DetailsGeoRegions;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;
import readProperties.ConfigProvider;

import static com.codeborne.selenide.Selenide.open;
import static data.DetailsGeoRegionsKt.*;

@Isolated
@Story("Checking the operation of the Geo Regions section")
public class GeoRegionsPageTest extends BaseTest{
    private DetailsGeoRegions details;
    private GeoRegionsPage page;
    @Test
    @DisplayName("Checking the addition of a new line in the Geo Regions section")
    @Description("Checking:\n" + " - new line is added, data is added, there is a notification about a successful operation")
    public void addNewLineGeoRegions() throws InterruptedException {
        details = getGeoRegionCodeFirstDetails();
        page = new GeoRegionsPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()
                .addNewRow(page, details, 3)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the addition of duplicate line in the Geo Regions section")
    @Description("Checking:\n" + " - the duplicate line is not added, the data is not saved, there is a notification about an incorrect operation")
    public void checkDeleteRowGeoRegions() throws InterruptedException {
        details = getGeoRegionCodeSixDetails();
        page = new GeoRegionsPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()
                .addNewRow(page, details, 1)

                .addDuplicateNewRow(page, details, 1)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the filter operation of the Price List name field in the Geo Regions section")
    @Description("Checking:\n" + " - filter the Price list name field in the Geo Regions section works")
    public void setFilterPriceListNameGeoRegion() throws InterruptedException {
        details = getGeoRegionCodeSecondDetails();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()

                .inputFiltersGeoRegion(details)
                .checkNumberOfRow(1);
    }

    @Test
    @DisplayName("Checking the filter operation of the Region name field in the Geo Regions section")
    @Description("Checking:\n" + " - filter the Region name field in the Geo Regions section works")
    public void setFilterRegionNameGeoRegion() throws InterruptedException {
        details = getGeoRegionCodeThirdDetails();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()

                .inputFiltersGeoRegion(details)
                .checkNumberOfRow(2);
    }

    @Test
    @DisplayName("Checking the operation of the button to clear the filter of the Region name field in the Geo Regions section")
    @Description("Checking:\n" + " - the button clear the filter Region name field in the Geo Regions section works")
    public void checkClearButtonFilterRegionNameGeoRegion() throws InterruptedException {
        details = getGeoRegionCodeFourDetails();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()

                .inputFiltersGeoRegion(details)
                .clickClearFilterPriceNameButton()
                .clickClearFilterRegionButton()
                .checkingFilterAreCleared();
    }

    @Test
    @DisplayName("Check the operation of the line counter in the Geo Regions section")
    @Description("Checking:\n" + " - the record counter in the Geo Regions section works")
    public void checkCountRowGeoRegion() throws InterruptedException {
        details = getGeoRegionCodeFiveDetails();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()

                .inputFiltersGeoRegion(details)
                .checkCountRow(12);
    }

    @Test
    @DisplayName("Checking data changes in the Geo Regions section")
    @Description("Checking:\n" + " - the changed data is added, the data is saved, there is a notification about the successful operation")
    public void changeDateGeoRegion() throws InterruptedException {
        details = getGeoRegionCodeSevenDetails();
        page = new GeoRegionsPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuGeoRegion()
                .addNewRow(page, details, 1)

                .changeDataLineGeoRegion(getGeoRegionCodeFourDetails())

                .deleteRow(page);
    }

}

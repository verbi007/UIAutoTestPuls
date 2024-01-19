package pageobject;

import data.DetailsDefineAlgorithm;
import data.DetailsRegionPricing;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

import static com.codeborne.selenide.Selenide.open;
import static data.DetailsDefineAlgorithmKt.*;


@Isolated
@Story("Checking the operation of the Define Algorithm section")
public class DefineAlgorithmPageTest extends BaseTest{
    private DetailsDefineAlgorithm details;
    private DefineAlgorithmPage page;
    @Test
    @DisplayName("Checking the addition of a new line in the Define Algorithm section")
    @Description("Checking:\n" + " - new line is added, data is added, there is a notification about a successful operation")
    public void addNewLineDefineAlgorithm() throws InterruptedException {
        details = getDefineAlgorithmFirstDetails();
        page = new DefineAlgorithmPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuDefineAlgorithm()
                .addNewRow(page, details, 3)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the addition of duplicate line in the Define Algorithm section")
    @Description("Checking:\n" + " - the duplicate line is not added, the data is not saved, there is a notification about an incorrect operation")
    public void addDuplicateLineDefineAlgorithm() throws InterruptedException {
        details = getDefineAlgorithmThirdDetails();
        page = new DefineAlgorithmPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuDefineAlgorithm()
                .addNewRow(page, details, 1)

                .addDuplicateNewRow(page, details, 1)

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking data changes in the Define Algorithm section")
    @Description("Checking:\n" + " - the changed data is added, the data is saved, there is a notification about the successful operation")
    public void changeDataDefineAlgorithm() throws InterruptedException {
        details = getDefineAlgorithmFourDetails();
        page = new DefineAlgorithmPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuDefineAlgorithm()
                .addNewRow(page, details, 1)

                .changeDataLineDefineAlgorithm(getDefineAlgorithmFiveDetails())

                .deleteRow(page);
    }

    @Test
    @DisplayName("Checking the filter operation in the Define Algorithm section")
    @Description("Checking:\n" + " - filter in the Define Algorithm section works")
    public void setFilterPriceListNameGeoRegion() throws InterruptedException {
        details = getDefineAlgorithmSixDetails();
        page = new DefineAlgorithmPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuDefineAlgorithm()

                .inputFiltersDefineAlgorithm(details)
                .checkNumberOfRow(1);
    }

    @Test
    @DisplayName("Checking the operation of the button to clear the filter of the Region name field in the Define Algorithm section")
    @Description("Checking:\n" + " - the button clear the filter Region name field in the Define Algorithm section works")
    public void checkClearButtonFilterRegionNameGeoRegion() throws InterruptedException {
        details = getDefineAlgorithmSixDetails();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickMenuDefineAlgorithm()

                .inputFiltersDefineAlgorithm(details)
                .clickClearFilterPriceNameButton()
                .clickClearFilterAlgNameButton()
                .clickClearFilterFilialButton()
                .clickClearFilterWeight()

                .checkingFilterAreCleared();
    }
}

package pageobject;

import data.DetailsPairStandard;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static data.DetailsPairStandardKt.getPairStandardFirstDetails;

@Story("Checking the operation of the Pairs Standard section")
public class PairsStandardPageTest extends BaseTest{
    private DetailsPairStandard details;
    private PairsStandardPage page;
    @Test
    @DisplayName("Checking the addition of a new line in the Define Algorithm section")
    @Description("Checking:\n" + " - new line is added, data is added, there is a notification about a successful operation")
    public void addNewLinePairsStandard() throws InterruptedException {
        details = getPairStandardFirstDetails();
        page = new PairsStandardPage();

        open(MainPage.URL, AuthorizationPage.class)
                .loginUser(user)
                .clickGroupPricing()
                .clickGroupBasicPricingSettings()
                .clickGroupPairs()
                .clickMenuPairsStandard()
                .addNewRow(page, details, 3)

                .deleteRow(page);
    }
}

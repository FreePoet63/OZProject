package pagetest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import service.ResultTest;
import settings.StartSettings;

import static methoddefault.MethodsToDefault.moveToElement;
import static methoddefault.MethodsToDefault.withAssertCollection;
import static page.OzAllMethods.clickButton;
import static page.OzAllMethods.searchElementPage;

public class OZPageKidsAndMomTest extends StartSettings {
    @Step
    @Test
    @Description("Ordering diapers in the online store OZ.BY")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Diapers search")
    public void searchDiapersTest() {
        moveToElement( "Детям и мамам");
        searchElementPage("Подгузники");
        searchElementPage("Huggies");
        searchElementPage("Дышащие");
        searchElementPage("Для девочек");
        clickButton("Применить");
        withAssertCollection(ResultTest.resultKidsProduct());
    }
}

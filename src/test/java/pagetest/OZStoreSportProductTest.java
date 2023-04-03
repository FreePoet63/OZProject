package pagetest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import settings.StartSettings;

import static methoddefault.MethodsToDefault.moveToElement;
import static methoddefault.MethodsToDefault.withAssertCollection;
import static page.OzAllMethods.clickButton;
import static page.OzAllMethods.searchElementPage;

public class OZStoreSportProductTest extends StartSettings {
    @Step
    @Test
    @Description("Choosing balls in the OZ.BY store")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Finding dallies")
    public void itemsSport() {
        moveToElement( "Туризм, отдых, спорт");
        searchElementPage("Мячи");
        searchElementPage("Футбольный");
        searchElementPage("Машинная сшивка");
        clickButton("Применить");
        withAssertCollection("Мяч футбольный");
    }
}

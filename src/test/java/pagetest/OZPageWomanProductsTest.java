package pagetest;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import service.ResultTest;
import settings.StartSettings;

import static methoddefault.MethodsToDefault.moveToElement;
import static methoddefault.MethodsToDefault.withAssertCollection;
import static page.OzAllMethods.clickButton;
import static page.OzAllMethods.searchElementPage;

public class OZPageWomanProductsTest extends StartSettings {
    @Step
    @Test
    @Description("Selecting shampoo from the list of products")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Search for shampoo")
    public void searchShampooProductTest()  {
        moveToElement( "Косметика, парфюмерия");
        searchElementPage("Шампуни");
        searchElementPage("Kapous");
        searchElementPage("Жидкий");
        searchElementPage("Для всех типов");
        searchElementPage("Восстановление");
        clickButton("Применить");
        withAssertCollection(ResultTest.resultShampooProduct());
    }
}

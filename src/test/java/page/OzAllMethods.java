package page;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import selectors.AtlasWEbPage;
import selectors.CollectionPage;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static settings.StartSettings.driver;
import static settings.StartSettings.onPage;

public class OzAllMethods {
    @Step
    public static void searchElementPage(String strg) {
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        WebElement element = onPage(AtlasWEbPage.class).linkText(strg);
        ex.executeScript("arguments[0].click();", element);
    }

    @Step
    public static void clickButton(String text) {
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        WebElement element = onPage(AtlasWEbPage.class).button(text);
        ex.executeScript("arguments[0].click();", element);
    }

    @Step
    public static void elementCollection(int i) {
        onPage(CollectionPage.class).itemTypeFilter().get(i).click();
    }

    @Step
    public static void elementFilterCollection(int i) {
        onPage(CollectionPage.class).viewItems().get(i).click();
    }

    @Step
    public static void searchCities() {
        WebElement ele = onPage(AtlasWEbPage.class).citiesText();
        $(ele).shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        $$(onPage(CollectionPage.class).sitiesList()).shouldHave(exactTexts("Минск", "Барановичи", "Бобруйск", "Борисов", "Брест",
                "Витебск", "Гомель", "Гродно", "Жлобин", "Жодино", "Лида", "Могилев", "Мозырь", "Молодечно", "Новополоцк",
                "Орша", "Пинск", "Полоцк", "Солигорск", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
    }
}


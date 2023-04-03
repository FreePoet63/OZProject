package methoddefault;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selectors.AtlasWEbPage;
import selectors.CollectionPage;
import settings.StartSettings;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static settings.StartSettings.driver;
import static settings.StartSettings.onPage;

public class MethodsToDefault {
    @Step
    public static void moveToElement(String value) {
        WebElement e = onPage(AtlasWEbPage.class).linkText(value);
        Actions newItemsActions = new Actions(driver);
        newItemsActions.moveToElement(e)
                .build()
                .perform();
    }

    @Step
    public static void withAssertCollection(String string) {
        List<WebElement> itemsCollectionCoffee = onPage(CollectionPage.class).collection();
        List<String> itemsChildrenText = itemsCollectionCoffee.stream().map(p -> p.getText())
                .collect(Collectors.toList());
        assertThat(itemsChildrenText, hasItem(containsString(string)));
    }

    public static void cleanFile() {
        try {
            PrintWriter writer = new PrintWriter("target/application.log");
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



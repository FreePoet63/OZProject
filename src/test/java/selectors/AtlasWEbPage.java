package selectors;

import io.qameta.atlas.webdriver.*;
import io.qameta.atlas.webdriver.extension.*;

public interface AtlasWEbPage extends WebPage, SearchPage {

    @FindBy("//a[contains(text(), '{{ text }}')]")
    AtlasWebElement linkText (@Param("text") String text);

    @FindBy("//div[starts-with(@class, \"i-icon-2\")]")
    AtlasWebElement citiesText ();
}


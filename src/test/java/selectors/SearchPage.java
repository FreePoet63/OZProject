package selectors;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.*;

public interface SearchPage {

    @FindBy("//button[contains(text(), '{{ text }}')]")
    AtlasWebElement button (@Param("text") String text);
}

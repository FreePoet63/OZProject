package settings;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import io.qameta.atlas.webdriver.WebPage;
import listener.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selectors.AtlasWEbPage;

import java.io.IOException;

import static listener.ListenerOZ.saveLogOZ;
import static listener.ListenerOZ.saveScreenshotPNG;
import static methoddefault.MethodsToDefault.cleanFile;
import static settings.DriverList.closeDriver;
import static settings.DriverList.getDriver;

public class StartSettings {
    public static WebDriver driver;
    public static Atlas atlas;

    @BeforeClass
    public void startDriver() {
        AllureLogger.info("Opening OZ.by Website.");
        driver = getDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver));
        onPage(AtlasWEbPage.class).open("https://oz.by/");
    }

    @AfterClass
    public void closeOz() {
        AllureLogger.info("Closed Website.");
        saveScreenshotPNG();
        try {
            saveLogOZ();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cleanFile();
        closeDriver();
    }

    public static <T extends WebPage> T onPage(Class<T> page) {
        return atlas.create(driver, page);
    }
}



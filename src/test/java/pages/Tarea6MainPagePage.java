package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class Tarea6MainPagePage extends BasePage {
    private final By homeScreen = AppiumBy.accessibilityId("Home-screen");
    private final By homeButton = AppiumBy.accessibilityId("Home");
    private final By webViewButton = AppiumBy.accessibilityId("Webview");
    private final By loginButton = AppiumBy.accessibilityId("Login");
    private final By formsButton = AppiumBy.accessibilityId("Forms");
    private final By swipeButton = AppiumBy.accessibilityId("Swipe");
    private final By dragButton = AppiumBy.accessibilityId("Drag");

    private final By robotImage = AppiumBy.androidUIAutomator("description(\"Home-screen\")." +
            "childSelector(className(\"android.widget.ImageView\"))");
    private final By webdriverioLabel = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"WEBDRIVER\"]");
    private final By demoLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"Demo app for the appium-boilerplate\"]");
    private final By supportLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"Support\"]");

    @Override
    public void waitPageToLoad() {
        waitPage(homeScreen, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando home/main page");

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(homeButton).isDisplayed()),
                () -> Assertions.assertTrue(find(webViewButton).isDisplayed()),
                () -> Assertions.assertTrue(find(loginButton).isDisplayed()),
                () -> Assertions.assertTrue(find(formsButton).isDisplayed()),
                () -> Assertions.assertTrue(find(swipeButton).isDisplayed()),
                () -> Assertions.assertTrue(find(dragButton).isDisplayed())
        );

    }

    public void verifyAdditionals() {
        Logs.info("Validando dibujos adicionales del home/main screen");

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(robotImage).isDisplayed()),
                () -> Assertions.assertTrue(find(webdriverioLabel).isDisplayed()),
                () -> Assertions.assertTrue(find(demoLabel).isDisplayed()),
                () -> Assertions.assertTrue(find(supportLabel).isDisplayed())
        );

    }

    public void clickLoginButton() {
        Logs.info("Haciendo click en boton login");
        find(loginButton).click();
    }

    public void clickFormsButton() {
        Logs.info("Haciendo click en boton forms");
        find(formsButton).click();
    }

    public void clickSwipeButton() {
        Logs.info("Haciendo click en boton swipe");
        find(swipeButton).click();
    }

    public void clickDragDropButton() {
        Logs.info("Haciendo click en boton swipe");
        find(dragButton).click();
    }

    public void clickWebViewButton() {
        Logs.info("Haciendo click en boton web view");
        find(webViewButton).click();
        sleep(2000);
    }
}

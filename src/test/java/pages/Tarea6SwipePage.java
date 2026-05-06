package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Gestures;
import utilities.Logs;

public class Tarea6SwipePage extends BasePage {
    private final By titleField = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Swipe horizontal\"]");
    private final By subTitleField = AppiumBy.xpath("//android.widget.TextView" +
            "[@text=\"Or swipe vertical to find what I'm hiding.\"]");
    private final By canvaVertical = AppiumBy.accessibilityId("Swipe-screen");
    private final By carouselHorizontal = AppiumBy.accessibilityId("Carousel");
    private final By item3Carousel = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"__CAROUSEL_ITEM_3_READY__\"]");
    private final By item1Vertical = AppiumBy.accessibilityId("WebdriverIO logo");
    private final By item2Vertical = AppiumBy.xpath("//android.widget.TextView[@text=\"You found me!!!\"]");

    @Override
    public void waitPageToLoad() {
        waitPage(titleField, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando forms page");

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titleField).isDisplayed()),
                () -> Assertions.assertTrue(find(subTitleField).isDisplayed()),
                () -> Assertions.assertTrue(find(canvaVertical).isDisplayed()),
                () -> Assertions.assertTrue(find(carouselHorizontal).isDisplayed())
        );
    }

    public void swipeHorizontalDeraIzq() {
        Logs.info("Swipe horizontal to dera izq");
        Gestures.swipeHorizontal(50, 80, 40, find(carouselHorizontal));
        Gestures.swipeHorizontal(50, 80, 40, find(carouselHorizontal));
        Gestures.swipeHorizontal(50, 80, 40, find(carouselHorizontal));
        Assertions.assertTrue(find(item3Carousel).isDisplayed());

    }

    public void swipeVerticalAbajoArr() {
        Logs.info("Swipe vertical de abajo a arriba");
        Gestures.swipeVertical(50, 25, 10, find(canvaVertical));
        Gestures.swipeVertical(50, 25, 10, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));
        Gestures.swipeVertical(50, 70, 55, find(canvaVertical));

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(item1Vertical).isDisplayed()),
                () -> Assertions.assertTrue(find(item2Vertical).isDisplayed())
        );
    }


}

package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Gestures;
import utilities.Logs;

public class Tarea6DragDropPage extends BasePage {
    private final By titleField = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Drag and Drop\"]");

    private final By piecesAreal2 = AppiumBy.accessibilityId("drag-l2");
    private final By piecesArear3 = AppiumBy.accessibilityId("drag-r3");
    private final By piecesArear1 = AppiumBy.accessibilityId("drag-r1");
    private final By piecesAreac1 = AppiumBy.accessibilityId("drag-c1");
    private final By piecesAreac3 = AppiumBy.accessibilityId("drag-c3");
    private final By piecesArear2 = AppiumBy.accessibilityId("drag-r2");
    private final By piecesAreac2 = AppiumBy.accessibilityId("drag-c2");
    private final By piecesAreal1 = AppiumBy.accessibilityId("drag-l1");
    private final By piecesAreal3 = AppiumBy.accessibilityId("drag-l3");

    private final By huecosAreal1 = AppiumBy.accessibilityId("drop-l1");
    private final By huecosAreac1 = AppiumBy.accessibilityId("drop-c1");
    private final By huecosArear1 = AppiumBy.accessibilityId("drop-r1");
    private final By huecosAreal2 = AppiumBy.accessibilityId("drop-l2");
    private final By huecosAreac2 = AppiumBy.accessibilityId("drop-c2");
    private final By huecosArear2 = AppiumBy.accessibilityId("drop-r2");
    private final By huecosAreal3 = AppiumBy.accessibilityId("drop-l3");
    private final By huecosAreac3 = AppiumBy.accessibilityId("drop-c3");
    private final By huecosArear3 = AppiumBy.accessibilityId("drop-r3");

    private final By renewButton = AppiumBy.accessibilityId("renew");

    private final By congratsLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"Congratulations\"]");
    private final By youmadeitLabel = AppiumBy.xpath("//android.widget.TextView[@text=\"You made it, click retry if you want to try it again.\"]");
    private final By retryButton = AppiumBy.accessibilityId("button-Retry");

    @Override
    public void waitPageToLoad() {
        waitPage(titleField, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando Drag page");

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(titleField).isDisplayed()),
                () -> Assertions.assertTrue(find(piecesAreal2).isDisplayed()),
                () -> Assertions.assertTrue(find(huecosAreal1).isDisplayed()),
                () -> Assertions.assertTrue(find(renewButton).isDisplayed())
        );

    }

    public void verifyCongratsMessage() {

        Gestures.dragTo(find(piecesAreal2), find(huecosAreal2));
        Gestures.dragTo(find(piecesAreac1), find(huecosAreac1));
        Gestures.dragTo(find(piecesAreac3), find(huecosAreac3));
        Gestures.dragTo(find(piecesAreal3), find(huecosAreal3));
        Gestures.dragTo(find(piecesAreac2), find(huecosAreac2));
        Gestures.dragTo(find(piecesAreal1), find(huecosAreal1));
        Gestures.dragTo(find(piecesArear1), find(huecosArear1));
        Gestures.dragTo(find(piecesArear2), find(huecosArear2));
        Gestures.dragTo(find(piecesArear3), find(huecosArear3));

        final var elementCongratsLabel = waitForDisplayed(congratsLabel, 3);
        final var elementYoumadeitLabel = waitForDisplayed(youmadeitLabel, 3);
        final var retryButtonLabel = waitForDisplayed(retryButton, 3);

        Assertions.assertAll(
                () -> Assertions.assertTrue(elementCongratsLabel.isDisplayed()),
                () -> Assertions.assertTrue(elementYoumadeitLabel.isDisplayed()),
                () -> Assertions.assertTrue(retryButtonLabel.isDisplayed())
        );
    }

}

package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class Tarea6SignUpPage extends BasePage {

    private final By emailInput = AppiumBy.accessibilityId("input-email");
    private final By passwordInput = AppiumBy.accessibilityId("input-password");
    private final By repeatPasswordInput = AppiumBy.accessibilityId("input-repeat-password");
    private final By signUpButton = AppiumBy.accessibilityId("button-SIGN UP");
    private final By enterSamePasswordLabel = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Please enter the same password\"]");
    private final By entereightcharacLabel = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Please enter at least 8 characters\"]");
    private final By enteremailLabel = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Please enter a valid email address\"]");

    @Override
    public void waitPageToLoad() {
        waitPage(emailInput, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando signup page");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(emailInput).isDisplayed()),
                () -> Assertions.assertTrue(find(passwordInput).isDisplayed()),
                () -> Assertions.assertTrue(find(repeatPasswordInput).isDisplayed()),
                () -> Assertions.assertTrue(find(signUpButton).isDisplayed())
        );
    }

    public void validateSignUpData(String email, String password1, String password2) {
        Logs.info("Ingresando datos de signup");
        find(emailInput).sendKeys(email);
        find(passwordInput).sendKeys(password1);
        find(repeatPasswordInput).sendKeys(password2);
        find(signUpButton).click();
    }

    public void verifyErrorMessage(String errorMessage) {
        Logs.info("Verificando los mensajes de error");
        switch (errorMessage) {
            case "Please enter a valid email address" -> {
                final var enterSamePasswordLabelelement = waitForDisplayed(enterSamePasswordLabel, 3);
                Assertions.assertEquals(enterSamePasswordLabelelement.getText(), errorMessage);
            }
            case "Please enter at least 8 characters" -> {
                final var entereightcharacLabelelement = waitForDisplayed(entereightcharacLabel, 3);
                Assertions.assertEquals(entereightcharacLabelelement.getText(), errorMessage);
            }
            case "Please enter the same password" -> {
                final var enteremailLabelelement = waitForDisplayed(enteremailLabel, 3);
                Assertions.assertEquals(enteremailLabelelement.getText(), errorMessage);
            }
        }
    }
}

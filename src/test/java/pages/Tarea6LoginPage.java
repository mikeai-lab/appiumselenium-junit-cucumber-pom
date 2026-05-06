package pages;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class Tarea6LoginPage extends BasePage {
    private final By emailInput = AppiumBy.accessibilityId("input-email");
    private final By passwordInput = AppiumBy.accessibilityId("input-password");
    private final By loginButton = AppiumBy.accessibilityId("button-LOGIN");
    private final By signUpButton = AppiumBy.accessibilityId("button-sign-up-container");
    private final By successloginMessage = AppiumBy.id("android:id/content");
    private final By errorMessageforEmptyMail = AppiumBy.xpath("//android.widget.TextView" +
            "[@text=\"Please enter a valid email address\"]");
    private final By errorMessageforEmptyPassword = AppiumBy.xpath("//android.widget." +
            "TextView[@text=\"Please enter at least 8 characters\"]");

    @Override
    public void waitPageToLoad() {
        waitPage(emailInput, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando login page");
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(emailInput).isDisplayed()),
                () -> Assertions.assertTrue(find(passwordInput).isDisplayed()),
                () -> Assertions.assertTrue(find(loginButton).isDisplayed())
        );
    }

    public void clickSignUpButton() {
        Logs.info("Haciendo click en boton signup");
        find(signUpButton).click();
    }

    public void loginFakeUser() {
        Logs.info("Logueando con data fake");
        Faker faker = new Faker();

        find(emailInput).sendKeys(faker.internet().emailAddress());
        find(passwordInput).sendKeys(faker.internet().password());
        find(loginButton).click();

        Assertions.assertTrue(find(successloginMessage).isDisplayed());

    }

    public void loginUser(String email, String password) {
        Logs.info("Logueando con data");

        find(emailInput).sendKeys(email);
        find(passwordInput).sendKeys(password);
        find(loginButton).click();

    }

    public void verifyErrorMessage(String errorMessage) {
        Logs.info("Esperando que el mensaje de error aparezca");
        if (errorMessage.equals("Please enter a valid email address")) {
            final var errorMessageforEmptyMailElement = waitForDisplayed(errorMessageforEmptyMail, 3);
            Logs.info("Verificando el mensaje de error");
            Assertions.assertEquals(errorMessageforEmptyMailElement.getText(), errorMessage);
        } else {
            final var errorMessageforEmptyPasswordElement = waitForDisplayed(errorMessageforEmptyPassword, 3);
            Logs.info("Verificando el mensaje de error");
            Assertions.assertEquals(errorMessageforEmptyPasswordElement.getText(), errorMessage);
        }

    }
}

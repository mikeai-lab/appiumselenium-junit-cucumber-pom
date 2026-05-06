package pages;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class Tarea6FormsPage extends BasePage {
    private final By inputField = AppiumBy.accessibilityId("text-input");
    private final By youHavetypedField = AppiumBy.accessibilityId("input-text-result");
    private final By switchInput = AppiumBy.accessibilityId("switch");
    private final By dropDownInput = AppiumBy.accessibilityId("Dropdown");
    private final By activeButton = AppiumBy.accessibilityId("button-Active");
    private final By inactiveButton = AppiumBy.accessibilityId("button-Inactive");
    private final By modalTitlelabel = AppiumBy.id("android:id/alertTitle");
    private final By modalMessageLabel = AppiumBy.id("android:id/message");
    private final By modalOkButton = AppiumBy.id("android:id/button1");
    private final By modalCancelButton = AppiumBy.id("android:id/button2");
    private final By youHaveTypedLabel = AppiumBy.accessibilityId("input-text-result");
    private final By switchTextLabel = AppiumBy.accessibilityId("switch-text");
    private final By dropDownSelectedValueoption = AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"This app is awesome\"]");
    private final By dropDownSelectedValuetext = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"text_input\"]");

    @Override
    public void waitPageToLoad() {
        waitPage(inputField, this.getClass().getSimpleName());
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando forms page");

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(inputField).isDisplayed()),
                () -> Assertions.assertTrue(find(youHavetypedField).isDisplayed()),
                () -> Assertions.assertTrue(find(switchInput).isDisplayed()),
                () -> Assertions.assertTrue(find(dropDownInput).isDisplayed()),
                () -> Assertions.assertTrue(find(activeButton).isDisplayed()),
                () -> Assertions.assertTrue(find(inactiveButton).isDisplayed())

        );

    }

    public void clickSignUpButton() {
        Logs.info("Haciendo click en boton active");
        find(activeButton).click();
        Assertions.assertAll(
                () -> Assertions.assertTrue(find(modalTitlelabel).isDisplayed()),
                () -> Assertions.assertTrue(find(modalMessageLabel).isDisplayed()),
                () -> Assertions.assertTrue(find(modalOkButton).isDisplayed()),
                () -> Assertions.assertTrue(find(modalCancelButton).isDisplayed())
        );

    }

    public void validateInputsButton() {
        Logs.info("generando 2 datos al azar");
        Faker faker = new Faker();
        String word1 = faker.name().firstName();
        String word2 = faker.name().lastName();
        String finalWord = word1 + " " + word2;

        find(inputField).sendKeys(finalWord);
        find(dropDownInput).click(); //solo click al dropdown
        find(dropDownSelectedValueoption).click();//solo click al valor de las opciones del dropdown

        Logs.info("Validaciones");

        Assertions.assertAll(
                () -> Assertions.assertEquals(find(youHaveTypedLabel).getText(), finalWord),
                () -> Assertions.assertEquals(find(switchTextLabel).getText(), "Click to turn the switch ON"),
                () -> Assertions.assertEquals(find(dropDownSelectedValuetext).getAttribute("text"), "This app is awesome")
        );

    }
    
}

package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BasePage;
import utilities.ContextUtilities;
import utilities.Logs;

public class Tarea6WebViewPage extends BasePage {

    @Override
    public void waitPageToLoad() {
        Logs.info("Cambiando de Contexto");
        ContextUtilities.switchWebContext();
    }

    @Override
    public void verifyPage() {
        WebDriver driver = getDriver();
        Logs.info("Verificando elementos en WebViewHome");
        Assertions.assertAll(
                () -> Assertions.assertTrue(driver.findElement(By.className("hero__title")).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(By.className("hero__subtitle")).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Get Started']")).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Why WebdriverIO?']")).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='View on GitHub']")).isDisplayed()),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//a[text()='Watch on YouTube']")).isDisplayed())
        );
    }
}

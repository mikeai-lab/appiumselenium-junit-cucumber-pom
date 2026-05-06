package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tarea6LoginPage;
import pages.Tarea6SignUpPage;
import utilities.CommonFlows;

public class LoginStepDefinition {
    private final CommonFlows commonFlows = new CommonFlows();
    private final Tarea6LoginPage tarea6LoginPage = new Tarea6LoginPage();
    private final Tarea6SignUpPage tarea6SignUpPage = new Tarea6SignUpPage();


    @When("El usuario selecciona la opcion login")
    public void goToLoginPage() {
        commonFlows.goToLoginPage();
    }

    @Then("Verificar los inputs de la pestaña login")
    public void verificarLosInputsDeLaPestañaLogin() {
        tarea6LoginPage.verifyPage();
    }

    @When("El usuario busca y selecciona la opcion signup")
    public void goToSignupPage() {
        commonFlows.goToSignUpPage();
    }

    @Then("Verificar los inputs de la opcion signup")
    public void verifySignupPage() {
        tarea6SignUpPage.verifyPage();
    }

    @Then("El usuario ingresa usuario y contraseña con faker y verifica mensaje de exito")
    public void loginFakerUser() {
        tarea6LoginPage.loginFakeUser();
    }

    @When("El usuario escribe el email {string} con el password {string} y presiona el boton de login")
    public void loginUser(String email, String password) {
        commonFlows.goToLoginPage();
        tarea6LoginPage.loginUser(email, password);
    }


    @Then("Debe aparecer un mensaje de error indicando {string}")
    public void verifyErrorMessage(String errorMessage) {
        tarea6LoginPage.verifyErrorMessage(errorMessage);
    }

    @When("El usuario escribe el email {string} con el password1 {string}, password2 {string} y presiona el boton de sign")
    public void validateSignUpData(String email, String password1, String password2) {
        commonFlows.goToSignUpPage();
        tarea6SignUpPage.validateSignUpData(email, password1, password2);
    }

    @Then("Debe aparecer un mensaje de error de signup indicando {string}")
    public void verifyErrorMessageSignup(String errorMessage) {
        tarea6SignUpPage.verifyErrorMessage(errorMessage);

    }
}

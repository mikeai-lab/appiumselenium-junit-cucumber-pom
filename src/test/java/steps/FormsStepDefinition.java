package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Tarea6FormsPage;
import utilities.CommonFlows;

public class FormsStepDefinition {
    private final CommonFlows commonFlows = new CommonFlows();
    private final Tarea6FormsPage tarea6FormsPage = new Tarea6FormsPage();

    @When("El usuario selecciona la opcion forms")
    public void goToFormsPage() {
        commonFlows.gotoFormsPage();
    }

    @Then("Verificar los inputs de la pestaña forms")
    public void verificarInputsFormPage() {
        tarea6FormsPage.verifyPage();
    }

    @Then("Verificar los inputs de la pestaña forms con activa")
    public void clickSignUpButton() {
        tarea6FormsPage.clickSignUpButton();
    }

    @Then("verificar los resultados con data faker")
    public void validateInputsButton() {
        tarea6FormsPage.validateInputsButton();
    }
}

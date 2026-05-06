package utilities;

import pages.Tarea6DragDropPage;
import pages.Tarea6FormsPage;
import pages.Tarea6LoginPage;
import pages.Tarea6MainPagePage;
import pages.Tarea6SwipePage;

public class CommonFlows {
    public void goToMainPage() {
        new Tarea6MainPagePage().waitPageToLoad();
    }

    public void goToLoginPage() {
        goToMainPage();
        new Tarea6MainPagePage().clickLoginButton();
        new Tarea6LoginPage().waitPageToLoad();
    }

    public void goToSignUpPage() {
        goToMainPage();
        new Tarea6MainPagePage().clickLoginButton();
        new Tarea6LoginPage().waitPageToLoad();
        new Tarea6LoginPage().clickSignUpButton();
    }

    public void gotoFormsPage() {
        goToMainPage();
        new Tarea6MainPagePage().clickFormsButton();
        new Tarea6FormsPage().waitPageToLoad();
    }

    public void gotoSwipePage() {
        goToMainPage();
        new Tarea6MainPagePage().clickSwipeButton();
        new Tarea6SwipePage().waitPageToLoad();
    }

    public void gotoDragDropPage() {
        goToMainPage();
        new Tarea6MainPagePage().clickDragDropButton();
        new Tarea6DragDropPage().waitPageToLoad();
    }
}
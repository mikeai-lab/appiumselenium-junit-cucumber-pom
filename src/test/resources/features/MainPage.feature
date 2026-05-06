Feature: Main Page

  Background: Precondición del feature
    Given El usuario visualiza el Main Page

  @regression @smoke
  Scenario: Ejercicio 1 verificacion de pestañas inferiores
    Then Deben aparecer las pestañas Home, Webview, Login, Forms, Swipe y Drag

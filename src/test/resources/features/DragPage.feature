Feature: Drag Page

  @regression @smoke
  Scenario: Ejercicio 7 verificacion de pestaña drag
    When El usuario selecciona la opcion drag
    Then Verificar los inputs de la pestaña drag

  @regression @smoke
  Scenario: Ejercicio 16 verificacion de armado rompecabezas
    When El usuario selecciona la opcion drag
    Then Verificar mensaje final despues del armado de rompecabezas

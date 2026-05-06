Feature: Forms Page

  @regression @smoke
  Scenario: Ejercicio 5 verificacion de pestaña forms
    When El usuario selecciona la opcion forms
    Then Verificar los inputs de la pestaña forms

  @regression @smoke
  Scenario: Ejercicio 12 verificacion de pestaña forms
    When El usuario selecciona la opcion forms
    Then Verificar los inputs de la pestaña forms con activa

  @regression @smoke
  Scenario: Ejercicio 13 verificacion con data faker en forms
    When El usuario selecciona la opcion forms
    Then verificar los resultados con data faker
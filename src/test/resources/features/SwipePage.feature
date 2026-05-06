Feature: Swipe Page

  @regression @smoke
  Scenario: Ejercicio 6 verificacion de pestaña swipe
    When El usuario selecciona la opcion swipe
    Then Verificar los inputs de la pestaña swipe

  @regression @smoke
  Scenario: Ejercicio 14 verificacion de swipeo horizontal
    When El usuario selecciona la opcion swipe
    Then Verificar titulo support videos

  @regression @smoke
  Scenario: Ejercicio 15 verificacion de swipeo vertical
    When El usuario selecciona la opcion swipe
    Then Verificar you found me
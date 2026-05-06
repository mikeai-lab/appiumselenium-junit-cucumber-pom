Feature: Home Page

  @regression @smoke
  Scenario: Ejercicio 3 verificacion de pestaña login
    When El usuario selecciona la opcion login
    Then Verificar los inputs de la pestaña login

  @regression @smoke
  Scenario: Ejercicio 4 verificacion de opcion signup dentro de pestaña login
    When El usuario busca y selecciona la opcion signup
    Then Verificar los inputs de la opcion signup

  @regression @smoke
  Scenario: Ejercicio 8 generacion con faker de user y contraseña
    When El usuario selecciona la opcion login
    Then El usuario ingresa usuario y contraseña con faker y verifica mensaje de exito

  @regression @smoke
  Scenario Outline: Ejercicio 9 outline 1
    When El usuario escribe el email <email> con el password <password> y presiona el boton de login
    Then Debe aparecer un mensaje de error indicando <mensaje>

    Examples:
      | email                           | password                  | mensaje                              |
      | ""                              | "holaholablassacademy123" | "Please enter a valid email address" |
      | "blass_academy_forever@wow.com" | ""                        | "Please enter at least 8 characters" |

  @regression @smoke
  Scenario Outline: Ejercicio 10 outline 2
    When El usuario escribe el email <email> con el password1 <password1>, password2 <password2> y presiona el boton de sign
    Then Debe aparecer un mensaje de error de signup indicando <mensaje>

    Examples:
      | email                           | password1           | password2           | mensaje                              |
      | "blass_academy_forever@wow.com" | "holaholapassword1" | ""                  | "Please enter a valid email address" |
      | "blass_academy_forever@wow.com" | ""                  | "holaholapassword1" | "Please enter at least 8 characters" |
      | ""                              | "holaholapassword1" | "holaholapassword2" | "Please enter the same password"     |


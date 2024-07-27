Feature: Inicio de sesion de usuario en la web.

  @registrarUsuario
  Scenario Outline: Verificar el registro de usuario
    Given la url es valida
    And el usuario selecciona Register
    When el usuario inicia el registro con sus datos <firstName>, <lastName>, <address>, <city>, <state>, <zipCode>, <phone>, <ssn>, <username>, <pass>, <confirmPass>
    And el usuario confirma el registro
    Then Se muestra el mensaje <mensaje>
    Examples:
      | firstName | lastName  | address        | city | state | zipCode | phone     | ssn | username         | pass             | confirmPass      | mensaje |
      | Cris      | Fernandez | avenida el sol | Lima | Lima  | 1234    | 909090909 | 999 | crisFernandez123 | crisFernandez123 | crisFernandez123 |Your account was created successfully|


  @iniciarSesion
  Scenario Outline: Verificar el inicio de sesion de usuario
    Given la url es valida
    When el usuario ingresa <username>, <pass>
    And el usuario selecciona Login
    Then Se muestra en login el mensaje <mensaje>
    Examples:
      | username         | pass       | mensaje |
      | crisFernandez123 | crisFernandez123 | Error! |
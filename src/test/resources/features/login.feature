@Suite @Login
Feature: Login de usuario

  Background: validar el inicio de sesion con credenciales validas e invalidas

    Given que el usuario está en la página de login
  @ValidCredential
  Scenario: validar con credenciales correctas
    When el usuario ingresa su nombre de usuario y contraseña
    Then el usuario es redirigido a la página de inicio
@InvalidCredential
  Scenario: Login de usuario con credenciales inválidas
    When el usuario ingresa su nombre de usuario y contraseña inválidos
    Then el usuario ve un mensaje de error
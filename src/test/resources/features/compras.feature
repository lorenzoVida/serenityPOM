@Suite @Compras
Feature: Comprar producto

  Background: Login con exito

    Given que el usuario se encuentra en el catalogo de productos

  Scenario: validar que se agregue producto al carro de compras
    When selecciona el producto
    Then se muestra forma de pago

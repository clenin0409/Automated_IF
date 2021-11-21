Feature: DemoBlaze
  necesito realizar la compra de 2 productos en la web

  Scenario: Realizar compra exitosa
    Given Que la web este operativa
    Then Seleccionar primer producto
    And Selecionar segundo producto
    And Visualizar el carrito
    And completar formulario de compra y finalizar la compra

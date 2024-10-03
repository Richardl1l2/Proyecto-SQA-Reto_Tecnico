Feature: Validación del valor final del carrito de compras

    Scenario: Seleccionar un artículo y validar el valor final del carrito
        Given "user" abre navegador
        When busca el artículo "televisores" y agrega el artículo al carrito
        Then el valor final del carrito debería ser "688,352.31"


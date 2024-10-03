Feature: Abrir navegador
    Yo como usuario
    Quiero abrir el navegador
    Para interactuar con el

    Scenario: Abre navegador y valida precio unitario
        Given "user" abre navegador
        When Buscar en el navegador "televisores"
        Then Validar precio unitario "229,450.77"




module fes.aragon.encriptadorydesencriptador {
    requires javafx.controls;
    requires javafx.fxml;
    requires Herramientas;


    opens fes.aragon.encriptadorydesencriptador to javafx.fxml;
    exports fes.aragon.encriptadorydesencriptador;
    exports fes.aragon.encriptadorydesencriptador.controlador;
    opens fes.aragon.encriptadorydesencriptador.controlador to javafx.fxml;
    exports fes.aragon.encriptadorydesencriptador.inicio;
    opens fes.aragon.encriptadorydesencriptador.inicio to javafx.fxml;
}
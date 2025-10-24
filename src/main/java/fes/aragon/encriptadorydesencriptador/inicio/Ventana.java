package fes.aragon.encriptadorydesencriptador.inicio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import fes.aragon.encriptadorydesencriptador.controlador.VentanaController;

import java.io.IOException;

public class Ventana extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Ventana.class.getResource("/fes/aragon/encriptadorydesencriptador/esqueleto.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Desencriptador de mensajes!");
        stage.setScene(scene);
        stage.show();
    }
}

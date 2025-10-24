package fes.aragon.encriptadorydesencriptador.controlador;

import fes.aragon.encriptadorydesencriptador.modelo.MensajeEncriptado;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VentanaController {
    @FXML
    private Button btn_enviar;

    @FXML
    private TextField txt_entrada;

    @FXML
    private TextField txt_salida;

    @FXML
    void enviar(ActionEvent event) {
        String cifrado= txt_entrada.getText().trim();
        if (cifrado.isEmpty()){
            mostrarError("Error al descifrar el mensaje, revise bien el texto cifrado");
            return;
        }else {
            MensajeEncriptado logica = new MensajeEncriptado();
            String resultado = logica.desencriptar(cifrado);
            txt_salida.setText(resultado);
        }

    }
    private void mostrarError(String mensaje) {
        var alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText("Error");
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}

package uia.com.agendafx.agendafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Dialog to edit details of a evento.
 */
public class EventoEdicionDialogoController {

    @FXML
    private TextField tipoFieldEvento;
    @FXML
    private TextField nombreFieldEvento;
    @FXML
    private TextField fechaFieldEvento;
    @FXML
    private TextField fechaRecordatorioFieldEvento;


    private Stage dialogStageEvento;
    private Evento evento;
    private boolean okClickedEvento = false;

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Sets the stage of this dialog.
     *
     * @param dialogStageEvento
     */
    public void setDialogStageEvento(Stage dialogStageEvento) {
        this.dialogStageEvento = dialogStageEvento;
    }

    /**
     * Sets the event to be edited in the dialog.
     *
     * @param evento
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
        tipoFieldEvento.setText(evento.getTipoEvento());
        nombreFieldEvento.setText(evento.getNombreEvento());
        fechaFieldEvento.setText(evento.getFechaEvento());
        fechaRecordatorioFieldEvento.setText(evento.getFechaRecordatorioEvento());
    }

    /**
     * Returns true if the user clicked OK, false otherwise.
     *
     * @return
     */
    public boolean isOkClickedEvento() {
        return okClickedEvento;
    }

    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handleOkEvento() {
        if (isInputValidEvento()) {
            this.evento.setTipoEvento(tipoFieldEvento.getText());
            this.evento.setNombreEvento(nombreFieldEvento.getText());
            this.evento.setFechaEvento(fechaFieldEvento.getText());
            this.evento.setFechaRecordatorioEvento(fechaRecordatorioFieldEvento.getText());
            okClickedEvento = true;
            dialogStageEvento.close();
        }
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handleCancelEvento() {
        dialogStageEvento.close();
    }

    /**
     * Validates the user input in the text fields.
     *
     * @return true if the input is valid
     */
    private boolean isInputValidEvento() {
        String errorMessageEvento = "";

        if (tipoFieldEvento.getText() == null || tipoFieldEvento.getText().length() == 0) {
            errorMessageEvento += "Tipo de evento invalido!\n";
        }
        if (nombreFieldEvento.getText() == null || nombreFieldEvento.getText().length() == 0) {
            errorMessageEvento += "Nombre invalido!\n";
        }
        if (fechaFieldEvento.getText() == null || fechaFieldEvento.getText().length() == 0) {
            errorMessageEvento += "Fecha Invalida!\n";
        }

        if (fechaRecordatorioFieldEvento.getText() == null || fechaRecordatorioFieldEvento.getText().length() == 0) {
            errorMessageEvento += "Fecha de recordatorio invalida\n";
        }

        if (errorMessageEvento.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStageEvento);
            alert.setTitle("Campos Invalidos");
            alert.setHeaderText("Corriga los campos invalidos");
            alert.setContentText(errorMessageEvento);

            alert.showAndWait();

            return false;
        }

    }
}

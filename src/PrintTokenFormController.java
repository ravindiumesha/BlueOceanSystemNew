import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class PrintTokenFormController {
    public AnchorPane tokenContext;

    public void closeOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) tokenContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ViewGuestForm.fxml"))));
    }

    public void sendMailOnAction(ActionEvent actionEvent) {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to send Token for customer Email ?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType> result = alert.showAndWait();
    }
}

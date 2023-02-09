import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class RoomMaintainceFormController {
    public TextField nameId;
    public TextField nationalId;
    public TextField telId;
    public TextField emailId;
    public TextField addressId;
    public AnchorPane detailId;

    public void viewOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) detailId.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ViewGuestForm.fxml"))));
    }

    public void saveOnAction(ActionEvent actionEvent) {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to save this customer ?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType> result = alert.showAndWait();

        nameId.clear();
        nationalId.clear();
        telId.clear();
        emailId.clear();
        addressId.clear();
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) detailId.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("GuestForm.fxml"))));
    }
}

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class GuestFormController {
    public RadioButton rbtnlocal;
    public ToggleGroup meal;
    public RadioButton rbtnchinese;
    public RadioButton rbtnfrench;
    public RadioButton rbtnbreakfast;
    public RadioButton rbtnlunch;
    public RadioButton rbtndinner;
    public ToggleGroup type;
    public AnchorPane mealContext;

    public void save2OnAction(ActionEvent actionEvent) {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to save meal ?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType> result = alert.showAndWait();
    }

    public void backonAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogForm.fxml"))));
    }
}

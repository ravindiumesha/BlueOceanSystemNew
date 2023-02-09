import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane mainFormContext;

    public void openAdminOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mainFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminForm.fxml"))));
    }

    public void openReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mainFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistForm.fxml"))));
    }
}

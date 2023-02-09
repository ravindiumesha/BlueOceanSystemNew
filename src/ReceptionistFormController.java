import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistFormController {
    public PasswordField userNameReceptionistId;
    public PasswordField passwordReceptionistId;
    public Button receptionistLoggingId;
    public TextField userNameAndPasswordReceptionistTxt;
    public AnchorPane windowReceptionistContext;

    public void loggingReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        if (passwordReceptionistId.getText().equals("1111") && userNameReceptionistId.getText().equals("receptionist")) {
            Stage window = (Stage) windowReceptionistContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogForm.fxml"))));
        } else{
            userNameAndPasswordReceptionistTxt.setText("Please Enter Correct userName or Password..!");
        }
    }

    public void backToHomeReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) windowReceptionistContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
    }
}

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFormController {
    public AnchorPane windowAdminContext;
    public Button loggingId;
    public PasswordField passwordId;
    public PasswordField userNameId;
    public TextField userNameAndPasswordTxt;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) windowAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
    }

    public void loggingOnAction(ActionEvent actionEvent) throws IOException {
        if (passwordId.getText().equals("1234") && userNameId.getText().equals("admin")) {
            Stage window = (Stage) windowAdminContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLogForm.fxml"))));
        } else{
            userNameAndPasswordTxt.setText("Please Enter Correct userName or Password..!");
        }
    }
}

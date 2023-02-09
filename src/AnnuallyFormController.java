import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnnuallyFormController {
    public AnchorPane annuallyContext;

    public void incomeAnnuallyOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) annuallyContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLogForm.fxml"))));
    }
}

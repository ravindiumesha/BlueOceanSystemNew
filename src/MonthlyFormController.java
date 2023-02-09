import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MonthlyFormController {
    public AnchorPane monthlyContext;

    public void incomeMonthlyOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) monthlyContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLogForm.fxml"))));
    }
}

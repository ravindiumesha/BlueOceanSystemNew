import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLogFormController {
    public AnchorPane windowAdminLogoContext;
    public AnchorPane anchorePaneContext;

    public void backToAdminOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) windowAdminLogoContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminForm.fxml"))));
    }

    public void roomPackageOnAction(ActionEvent actionEvent) throws IOException {
        /*Stage window = (Stage) anchorePaneContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("RoomPackageForm.fxml"))));*/
        setUi("RoomPackageForm");
    }

    public void incomeOnAction(ActionEvent actionEvent) throws IOException {
       setUi("IncomeForm");
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealPackageForm");
    }

    private void setUi(String ui) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        anchorePaneContext.getChildren().clear();
        anchorePaneContext.getChildren().add(load);
    }
}

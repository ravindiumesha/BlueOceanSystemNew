import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MealPackageFormController{
    public TableView tblId;
    public TableColumn nameId;
    public TableColumn typeId;
    public TableColumn priceId;
    public TextField foodNameId;
    public TextField foodPriceId;
    public ComboBox foodTypeId;
    public AnchorPane mealPackageContext;



    public void saveOnAction(ActionEvent actionEvent) {
        ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
        ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to save this meal ?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType> result = alert.showAndWait();

        foodNameId.clear();
        foodPriceId.clear();
    }

    public void removeOnAction(ActionEvent actionEvent) {
        ButtonType  yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
        ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to remove this meal ?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType> result = alert.showAndWait();

        foodNameId.clear();
        foodPriceId.clear();
    }

}

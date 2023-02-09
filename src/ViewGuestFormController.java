import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewGuestFormController {
    public TableView tbId;
    public AnchorPane detailsViewId;
    public TableColumn colName;
    public TableColumn colNational;
    public TableColumn colTel;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colOption;

    public void printTokenOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) detailsViewId.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("PrintTokenForm.fxml"))));
    }

    public void bckToOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) detailsViewId.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogForm.fxml"))));
    }
}

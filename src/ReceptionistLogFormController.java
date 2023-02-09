import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistLogFormController {
    public AnchorPane windowReceptionistLogoContext;
    public AnchorPane anchorePane2Context;


    public void backToReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)windowReceptionistLogoContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistForm.fxml"))));
    }

    public void guestOnAction(ActionEvent actionEvent) throws IOException {
        //Stage window = (Stage)windowReceptionistLogoContext.getScene().getWindow();
        //window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AddCustomer.fxml"))));
        setUi("GuestOriginalForm");
    }


    private void setUi(String ui) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        anchorePane2Context.getChildren().clear();
        anchorePane2Context.getChildren().add(load);
    }

    public void addGuestOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomMaintainceForm");
    }
}

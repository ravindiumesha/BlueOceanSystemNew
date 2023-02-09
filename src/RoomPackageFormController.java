import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class RoomPackageFormController {
    public AnchorPane roomPackageContext;
    public TableView<RoomTm> table;
    public TableColumn roomId;
    public TableColumn roomTypeId;
    public TableColumn roomChargesId;
    public TableColumn floorId;
    public TableColumn optionId;

   static ArrayList  <Room> list  = new ArrayList<>();
    static {
      list.add(new Room("R001","Single",3000.00,"F1"));
      list.add(new Room("R002","Single",3000.00,"F1"));
      list.add(new Room("R003","Double",5500.00,"F1"));
      list.add(new Room("R004","Double",5500.00,"F1"));
    }

    public void initialize(){

        roomId.setCellValueFactory(new PropertyValueFactory<>("roomID"));
        roomTypeId.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        roomChargesId.setCellValueFactory(new PropertyValueFactory<>("roomCharges"));
        floorId.setCellValueFactory(new PropertyValueFactory<>("floor"));
        optionId.setCellValueFactory(new PropertyValueFactory<>("button"));

        loadAllData();
    }
    ObservableList<RoomTm> tmList =FXCollections.observableArrayList();
    private void loadAllData() {
        for (Room r:list
             ) {
            Button btn = new Button("DELETE");
            RoomTm tm=new RoomTm(r.getRoomID(),r.getRoomType(),r.getRoomCharges(),r.getFloor(),btn);


            btn.setOnAction((e)->{
                ButtonType  yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType  no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to delete Room ?",yes,no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes) {
                    list.remove(r);
                    loadAllData();
                }else{

                }
            });
            tmList.add(tm);
            table.setItems(tmList);
        }
    }

    public void addNewRoomOnAction(ActionEvent actionEvent) {
    }

    public void backToAdminLogoOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomPackageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLogForm.fxml"))));
    }
}

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

public class AddCustomerController {
    public AnchorPane addCustomerContext;
    public TextField txtName;
    public TextField txtId;
    public TextField txtTelNumber;
    public TextField txtEmail;
    public TextField txtNationalId;
    public TableView ablId;
    public TableColumn tblOption;
    public TableColumn tblNational;
    public TableColumn tblName;
    public TableColumn tblEmail;
    public TableColumn tblAddress;
    public TextField txtAddress;

    static ArrayList<Customer> customerArrayList = new ArrayList<>();
    public void initialize(){
        tblName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tblNational.setCellValueFactory(new PropertyValueFactory<>("nationalId"));
        tblEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tblAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tblOption.setCellValueFactory(new PropertyValueFactory<>("button"));
    }

    public void backToReceptionistLogOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)addCustomerContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionistLogForm.fxml"))));
    }

    public void addToName(ActionEvent actionEvent){
        txtName.requestFocus();
    }

    public void addToNational(ActionEvent actionEvent){
        txtNationalId.requestFocus();
    }

    public void addToEmail(ActionEvent actionEvent){
        txtEmail.requestFocus();
    }

    public void addToAddress(ActionEvent actionEvent){
        txtAddress.requestFocus();
    }



    public void saveOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer(txtName.getText(),txtNationalId.getText(),txtTelNumber.getText(),txtEmail.getText(),txtAddress.getText());
        txtName.clear();
        txtNationalId.clear();
        txtTelNumber.clear();
        txtNationalId.clear();
        txtAddress.clear();

        if(customerArrayList.add(customer)) {
            loadAllCustomer();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved...", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING, "Try Again...", ButtonType.CLOSE).show();
        }
    }

    public void loadAllCustomer(){
        ObservableList<CustomerTm> observableList = FXCollections.observableArrayList();
        for (Customer c:customerArrayList) {
            Button btn = new Button("DELETE");
            observableList.add(new CustomerTm(c.getName(), c.getNationalId(), c.getEmail(), c.getAddress(), btn));

            btn.setOnAction((e) -> {
                ButtonType ok = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you want to delete Room ?", ok, no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no) == ok) {
                    customerArrayList.remove(c);
                    loadAllCustomer();
                } else {

                }
            });
        }
            ablId.setItems(observableList);

    }

    public void sendOnAction(ActionEvent actionEvent) {
    }
}


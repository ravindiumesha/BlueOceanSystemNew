import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class IncomeFormController {
    public AnchorPane incomeContext;

    public void annuallyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MonthlyForm");
    }

    public void monthlyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AnnuallyForm");
    }

    private void setUi(String ui) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        incomeContext.getChildren().clear();
        incomeContext.getChildren().add(load);
    }
}

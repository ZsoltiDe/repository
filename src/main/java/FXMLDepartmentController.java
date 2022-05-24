import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;



public class FXMLDepartmentController implements Initializable {
    Stage stage;
    MainApp mainApp;
    Model model;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private TableColumn<?, ?> DayShiftColumn;

    @FXML
    private ChoiceBox<String> DepartmentChoiceBox;

    @FXML
    private TableColumn<?, ?> MorningShiftColumn;

    @FXML
    private TableColumn<?, ?> NightShiftColumn;

    @FXML
    private Label SelectedDepartment;

    @FXML
    private ChoiceBox<String> ShiftChoiceBox;

    @FXML
    private TableView<?> ShiftTableView;

    @FXML
    void handleAddNewEmployee(ActionEvent event) {
        mainApp.windowDepartmentAdd();
    }

    @FXML
    void handleRemoveSelectedEmployee(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

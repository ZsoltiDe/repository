import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class FXMLEmployeeController implements Initializable {
    Model model;
    MainApp mainApp;
    Stage stage;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private TableView<Employee> tableView;
    @FXML
    private ChoiceBox<String> DepartmentChoiceBox;

    @FXML
    private ChoiceBox<String> ShiftChoiceBox;
    @FXML
    private Label adres;
    @FXML
    private Label SelectedDepartment;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //bind();

        try {

            ObservableList<String> shiftList = FXCollections.observableArrayList("Evening", "Morning", "Day");
            ShiftChoiceBox.setItems(shiftList);
            ObservableList<String> departmentList = FXCollections.observableArrayList("Cleaner", "Butcher", "Bakery", "Seller");
            DepartmentChoiceBox.setItems(departmentList);
            DepartmentChoiceBox.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV)->SelectedDepartment.setText(newV+" department"));






        }catch(Exception e){}
    }


    @FXML
    private TableColumn<Employee, String> column1;

    @FXML
    private TableColumn<Employee, String> column2;


    @FXML
    private Label dateOfBirth;

    @FXML
    private Label profession;

    @FXML
    private Label emailAdres;

    @FXML
    private Label phoneNumber;

    @FXML
    void handleAddEmployee(ActionEvent event) {

    }

    @FXML
    void handleDeleteEmployee(ActionEvent event) {

    }

    @FXML
    void handleEditEmployee(ActionEvent event) {

    }

    @FXML
    void Department(ActionEvent event) {
        mainApp.setActualScene("/Department.fxml");
    }

    @FXML
    void Employees(ActionEvent event) {
        mainApp.setActualScene("/Employees.fxml");
    }

    @FXML
    void Exit(ActionEvent event) {

    }









}

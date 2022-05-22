import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //bind();


    }
    @FXML
    private Label adres;

    @FXML
    private TableColumn<Employee, String> column1;

    @FXML
    private TableColumn<Employee, String> column2;

    @FXML
    private Label dateOfBirth;

    @FXML
    private Label dateofbirth;

    @FXML
    private Label emailAdres;

    @FXML
    private Label phoneNumber;

    @FXML
    private Label phoneNumber1;

    @FXML
    private Label phoneNumber11;

    @FXML
    private Label profession;

    @FXML
    private TableView<Employee> tableView;

    @FXML
    void handleAddEmployee(ActionEvent event) {

    }

    @FXML
    void handleDeleteEmployee(ActionEvent event) {

    }

    @FXML
    void handleEditEmployee(ActionEvent event) {

    }



}
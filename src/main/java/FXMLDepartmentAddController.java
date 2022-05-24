import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class FXMLDepartmentAddController {
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
    private TableColumn<?, ?> NameColumn;

    @FXML
    private Label adressLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label dateofbirth;

    @FXML
    private Label emailAdressLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private TableView<?> nameTable;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private Label professionLabel;


    @FXML
    void handleAddEmployeeToDepartment(ActionEvent event) {
        
    }
    
    @FXML
    void handleCancel(ActionEvent event) {
        stage.close();
    }
}



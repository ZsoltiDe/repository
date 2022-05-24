import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;

public class FXMLEmployeeAddController implements Initializable {
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
    private TextField adressField;

    @FXML
    private TextField dateOfBirthField;



    @FXML
    private TextField emailAdressField;

    @FXML
    private TextField genderField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField professionField;

    @FXML
    void handleaddEmployee(ActionEvent event) {

    }
    
    @FXML
    void handleCancel(ActionEvent event) {
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}


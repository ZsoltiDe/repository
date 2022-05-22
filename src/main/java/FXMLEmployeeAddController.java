import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLEmployeeAddController implements Initializable {
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

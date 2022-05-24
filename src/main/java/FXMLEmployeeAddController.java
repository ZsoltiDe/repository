import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Stage;

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



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    void handleCancel(ActionEvent event) {
        stage.close();
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    Stage stage;


    Employee employee;




    private boolean okClicked = false;

    public void setEmployee(Employee employee) {
        this.employee = employee;
        professionField.setText(employee.getProfession());
        nameField.setText(employee.getName());
        phoneNumberField.setText(""+employee.getPhoneNumber());
        emailAdressField.setText(employee.getEmailAddress());
        adressField.setText(employee.getAddress());
        dateOfBirthField.setText(""+employee.getDateOfBirth());
        genderField.setText(employee.getGender());

    }


    public boolean isOkClicked() {
        return okClicked;
    }


    @FXML
    private void handleaddEmployee() {
        if (isInputValide()) {
            employee.setName(nameField.getText());
            employee.setAddress(adressField.getText());
            employee.setPhoneNumber(Integer.parseInt(phoneNumberField.getText()));
            employee.setProfession(professionField.getText());
            employee.setGender(genderField.getText());
            employee.setEmailAddress(emailAdressField.getText());
            employee.setDateOfBirth(DateUtil.parse(dateOfBirthField.getText()));
            okClicked = true;
            stage.close();

        }
    }





    @FXML
    private void handleCancel() {
        stage.close();
    }


    private boolean isInputValide(){
        String errorMessage = "";

        if (nameField.getText() == null || nameField.getText().length() == 0) {
            errorMessage += "No valid name!\n";
        }

        if (adressField.getText() == null ||adressField.getText().length() == 0) {
            errorMessage += "No valid adress!\n";
        }

        if (emailAdressField.getText() == null || emailAdressField.getText().length() == 0) {
            errorMessage += "No valid email adress!\n";
        }

        if ( dateOfBirthField.getText() == null || dateOfBirthField.getText().length() == 0) {
            errorMessage += "No valid birthday!\n";
        }

        if (phoneNumberField.getText() == null || phoneNumberField.getText().length() == 0) {
            errorMessage += "No valid  phone number!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(stage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}


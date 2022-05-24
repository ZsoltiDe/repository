import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    ObservableList observableListEmployee= FXCollections.observableArrayList();
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

        //bind();
        column1.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        column2.setCellValueFactory(cellData -> cellData.getValue().professionProperty());

    }




    @FXML
    private TableColumn<Employee, String> column1;

    @FXML
    private TableColumn<Employee, String> column2;

    @FXML
    private Label adress;


    @FXML
    private Label dateOfBirth;


    @FXML
    private Label emailAdress;

    @FXML
    private Label gender;

    @FXML
    private Label name;

    @FXML
    private Label phoneNumber;

    @FXML
    private Label profession;

    @FXML
    private TableView<Employee> tableView;

    @FXML
    void handleAddEmployee(ActionEvent event) {
        Employee employee= new Employee();
        boolean isOkClicked = mainApp.windowEmployeeAdd(employee);
        if (isOkClicked) {
            observableListEmployee.addAll(employee);

            //model.getEmployeeDAO().saveEmployee(model.getEmployee());
            model.getObservableListEmployee().add(employee);
            tableView.setItems(model.getObservableListEmployee());
        }

    }





    @FXML
    void handleDeleteEmployee(ActionEvent event) {
        int index= tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(index);
        
    }

    @FXML
    void handleEditEmployee(ActionEvent event) {
        Employee employee = tableView.getSelectionModel().getSelectedItem();

        if (employee != null) {
            boolean okClicked = mainApp.windowEmployeeAdd(model.getEmployee());
            if (okClicked) {
                model.setEmployee(employee);
                model.getObservableListEmployee().add(model.getEmployee());
                //model.getEmployeeDAO().saveEmployee(model.getEmployee());
                //showEmployeeDetails(model.getEmployee());
            }
        }

    }



}
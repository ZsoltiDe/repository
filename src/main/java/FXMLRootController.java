import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLRootController implements Initializable {
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




    int a;
    @FXML
    void Department(ActionEvent event) {

        mainApp.setActualScene("/Department.fxml",1);
    }

    @FXML
    void Employees(ActionEvent event) {


            mainApp.setActualScene("/Employees.fxml",2);

    }

    @FXML
    void Exit(ActionEvent event) {
        stage.close();
    }









}












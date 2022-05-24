import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;



public class MainApp extends Application {
    private Stage stage;
    private BorderPane bP = null;
    FXMLLoader loader ;
    FXMLLoader loader2;
    
    //New window
    private Stage stage2 = new Stage();
    FXMLLoader loader3;
    private BorderPane bP2 = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            stage=primaryStage;
            stage.setTitle("Employee registration");
            setRootLayout(primaryStage);
            setActualScene("/Employees.fxml", 2);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void setActualScene(String str, int a){
        URL url =(getClass().getResource(str));
        FXMLLoader loader2= new FXMLLoader();
        loader2.setLocation(url);
        
        try {
            AnchorPane pane = loader2.load();
            bP.setCenter(pane);

            if(a==2) {
                ((FXMLEmployeeController) (loader2.getController())).setMainApp(this);
                ((FXMLEmployeeController) (loader2.getController())).setStage(stage);
                ((FXMLEmployeeController) (loader2.getController())).setModel(new Model());
            }else{
                ((FXMLDepartmentController)(loader2.getController())).setMainApp(this);
                ((FXMLDepartmentController) (loader2.getController())).setStage(stage);
                ((FXMLDepartmentController) (loader2.getController())).setModel(new Model());

            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(int argv, String [] argc ){
        launch(argc);
    }
    
    public void setRootLayout(Stage stage) throws Exception{
        stage.setResizable(false);
        stage.setWidth(800);
        stage.setHeight(450);
        loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/RootLayout.fxml"));

        bP = loader.load();
        Scene scene = new Scene(bP);
        stage.setScene(scene);
        ((FXMLRootController) (loader.getController())).setMainApp(this);
        ((FXMLRootController) (loader.getController())).setStage(stage);
        ((FXMLRootController) (loader.getController())).setModel(new Model());
        stage.show();
    }
    
    public void windowEmployeeAdd(){
        try{
            stage2.setResizable(false);
            stage2.setWidth(460);
            stage2.setHeight(410);
            stage2.setTitle("Add new employee");
            loader3 = new FXMLLoader();

            loader3.setLocation(getClass().getResource("/EmployeeAdd.fxml"));
            
            Scene scene = new Scene(loader3.load());
            stage2.setScene(scene);
            ((FXMLEmployeeAddController) (loader3.getController())).setMainApp(this);
            ((FXMLEmployeeAddController) (loader3.getController())).setStage(stage2);
            ((FXMLEmployeeAddController) (loader3.getController())).setModel(new Model());
            stage2.show();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void windowDepartmentAdd(){
        try{
            stage2.setResizable(false);
            stage2.setWidth(655);
            stage2.setHeight(440);
            stage2.setTitle("Add existing employee to department");
            loader3 = new FXMLLoader();

            loader3.setLocation(getClass().getResource("/DepartmentAdd.fxml"));
            
            Scene scene = new Scene(loader3.load());
            stage2.setScene(scene);
            ((FXMLDepartmentAddController) (loader3.getController())).setMainApp(this);
            ((FXMLDepartmentAddController) (loader3.getController())).setStage(stage2);
            ((FXMLDepartmentAddController) (loader3.getController())).setModel(new Model());
            stage2.show();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}




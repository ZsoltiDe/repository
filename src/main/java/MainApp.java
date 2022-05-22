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
     private BorderPane bP= null;
    FXMLLoader loader ;
    FXMLLoader loader2;




    @Override
    public void start(Stage primaryStage) throws Exception {

        try {

            stage=primaryStage;
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

        bP =loader.load();
        Scene scene = new Scene(bP);
        stage.setScene(scene);
        ((FXMLRootController) (loader.getController())).setMainApp(this);
        ((FXMLRootController) (loader.getController())).setStage(stage);
        ((FXMLRootController) (loader.getController())).setModel(new Model());
        stage.show();
    }


    }




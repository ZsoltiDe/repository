import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
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
            setActualScene("/Employees.fxml");

            ((FXMLEmployeeController) (loader.getController())).setMainApp(this);
            ((FXMLEmployeeController) (loader.getController())).setStage(stage);
            ((FXMLEmployeeController) (loader.getController())).setModel(new Model());








        } catch(Exception e){
            e.printStackTrace();
        }


    }
     public void setActualScene(String str){
        URL url =(getClass().getResource(str));
        FXMLLoader loader2= new FXMLLoader();
        loader2.setLocation(url);
        try {
            AnchorPane pane = loader2.load();
            bP.setCenter(pane);


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
        stage.show();
    }


    }


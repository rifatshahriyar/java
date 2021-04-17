package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /* // for simple controls uncomment this block
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // for simple controls
        primaryStage.setTitle("JavaFX Controls");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show(); */

        /* // for list view uncomment this block
        Parent root = FXMLLoader.load(getClass().getResource("listview.fxml")); // for simple controls
        primaryStage.setTitle("List View");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show(); */

        // for table view
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tableview.fxml"));
        Parent root = loader.load();
        TableViewController controller = loader.getController();
        controller.load();
        primaryStage.setTitle("Table View");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

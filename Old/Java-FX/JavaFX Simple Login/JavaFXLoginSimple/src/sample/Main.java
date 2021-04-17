package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;

public class Main extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        // Loading the controller
        LoginController controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
        stage = primaryStage;
    }

    public void showHomePage(String userName){
        FlowPane pane = new FlowPane();
        Label usernameLabel = new Label(userName);
        pane.getChildren().add(usernameLabel);

        Scene scene = new Scene(pane, 200, 100);
        stage.setScene(scene);
        stage.setTitle("Hello, " + userName);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

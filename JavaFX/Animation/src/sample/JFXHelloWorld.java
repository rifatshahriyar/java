package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JFXHelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Square");
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		Text hi = new Text("Hello World!");
		hi.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		hi.setFill(Color.RED);
		hi.setOpacity(1.0);
		primaryStage.setOpacity(0.5);
		root.getChildren().add(hi);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JFXSquare extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Square");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		Rectangle r = new Rectangle(100, 100, 100, 100);
		r.setFill(Color.RED);
		root.getChildren().add(r);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

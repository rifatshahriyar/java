package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JFXKeyEvent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Key Event Test");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		Rectangle r = new Rectangle(100, 100, 100, 100);
		r.setFill(Color.RED);
		root.getChildren().add(r);
		
		scene.setOnKeyTyped(event -> {
			if (event.getCharacter().equals("Q")) {
				System.out.println("Quitting ... ");
				Platform.exit();
			} else {
				System.out.println("You typed a ... "+event.getCharacter());
			}
		});
		
		primaryStage.show();
		System.out.println("End of start");
	}

	public static void main(String[] args) {
		System.out.println("Hi, start of program");
		launch(args);
		System.out.println("...done launching");
	}

}

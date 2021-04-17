package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JFXEventTransform extends Application {
	double rotation = 0;
	double opacity = 1.0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("EventTransform");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		Rectangle r = new Rectangle(145, 100, 10, 100);
		r.setFill(Color.RED);
		root.getChildren().add(r);

		scene.setOnMouseClicked(event -> {
			r.setX(event.getX());
			r.setY(event.getY());
		});


		scene.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.RIGHT) {
				rotation = (rotation + 22.5) % 360;
				r.setRotate(rotation);	
			} else if (event.getCode() == KeyCode.LEFT) {
				rotation = (rotation - 22.5) % 360;
				r.setRotate(rotation);	
			} else if (event.getCode() == KeyCode.UP) {
				opacity = Math.min((opacity + 0.1) , 1.0);
				primaryStage.setOpacity(opacity);	
			}  if (event.getCode() == KeyCode.DOWN) {
				opacity = Math.max((opacity - 0.1) , 0);
				primaryStage.setOpacity(opacity);	
			}  
		});
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrameRate extends Application {
	Text fps = new Text(0, 30, "X");
	
	long lastFrame = 0;
	long frameCount = 0;
	
	private void updateGameState(long now) {
		double elapsedSec = (now - lastFrame) / 1000000000.0;
		if (frameCount % 10 == 0)
			fps.setText(String.format("%.1f", 1/elapsedSec));
		lastFrame = now;
		frameCount++;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Frame Rate");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		fps.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		fps.setOpacity(0.4);
		root.getChildren().add(fps);
		
		new AnimationTimer() {
			@Override
			public void handle(long now) {
				updateGameState(now);
			}
			
		}.start();
		
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

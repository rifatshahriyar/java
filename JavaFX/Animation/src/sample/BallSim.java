package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BallSim extends Application {
	Text fps = new Text(0, 30, "X");
	
	long lastFrame = 0;
	long frameCount = 0;
	//Ball ball;

	static final int BALL_COUNT = 10;
	Ball[] balls = new Ball[BALL_COUNT];
	
	private void updateGameState(long now) {
		double elapsedSec = (now - lastFrame) / 1000000000.0;
		if (frameCount % 10 == 0)
			fps.setText(String.format("%.1f", 1/elapsedSec));
		lastFrame = now;
		if (frameCount > 0) {
			for (Ball b : balls) {
				b.detectWallCollisions();
				b.updatePosition(elapsedSec);
			}
		}
		frameCount++;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Ball Sim");
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		
		fps.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
		fps.setOpacity(0.4);
		root.getChildren().add(fps);

		//ball = new Ball(root, 150, 150, 5, Color.RED, 250, 250);
		//ball = new Ball(root, 150, 150, 5, Color.RED, 250);
		for (int i = 0; i < BALL_COUNT; i++) {
			balls[i] =  new Ball(root, 150, 150, 5, Color.RED, 250);
		}
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

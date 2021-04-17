package sample;

import javafx.scene.Group;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Ball extends Circle {
	double vx;
	double vy;
	
	Ball(Group root, double x, double y, double radius, Paint fill, double vx, double vy) {
		super(x, y, radius, fill);
		this.vx = vx;
		this.vy = vy;
		root.getChildren().add(this);
	}
	
	Ball(Group root, double x, double y, double radius, Paint fill, double velocity) {
		super(x, y, radius, fill);
		double angle = 2 * Math.PI * Math.random();
		this.vx = Math.sin(angle) * velocity;
		this.vy = Math.cos(angle) * velocity;
		root.getChildren().add(this);
	}

	void updatePosition(double elapsed) {
		setCenterX(getCenterX() + (vx * elapsed));
		setCenterY(getCenterY() + (vy * elapsed));
	}
	
	void detectWallCollisions() {
		/*
		if (getCenterX() < getRadius() || getCenterX() > (getScene().getWidth() - getRadius()))
			vx = -vx;
		if (getCenterY() < getRadius() || getCenterY() > (getScene().getHeight() - getRadius()))
			vy = -vy;
		*/
		if (getCenterX() < getRadius()) {
			setCenterX(getRadius());
			vx = -vx;
		} else if (getCenterX() > (getScene().getWidth() - getRadius())) {
			setCenterX((getScene().getWidth() - getRadius()));
			vx = -vx;
		}
		if (getCenterY() < getRadius()) {
			setCenterY(getRadius());
			vy = -vy;
		} else if (getCenterY() > (getScene().getHeight() - getRadius())) {
			setCenterY(getScene().getHeight() - getRadius());
			vy = -vy;
		}
	}
}

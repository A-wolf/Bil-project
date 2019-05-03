package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView scaniaImage;
	private ImageView saab95Image;
	private double xPos;
	private double yPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		saab95Image = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().addAll(volvoImage, scaniaImage, saab95Image);
	}

	public void move(double x, double y) {
		xPos = x;
		yPos = y;
		
		}

	public void update() {
		volvoImage.setX(xPos);
		volvoImage.setTranslateY(yPos);
		scaniaImage.setX(xPos);
		scaniaImage.setTranslateY(yPos+100);
		saab95Image.setX(xPos);
		saab95Image.setTranslateY(yPos+200);
	}

}

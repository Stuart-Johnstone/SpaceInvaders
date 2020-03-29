package SpaceInvaders;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Bullet extends MovableObject {
	
	private String type;
	public Image image;
	public ImageView imageView;

	
	public Bullet (int xPos, int yPos, int extend, Image image, Group root) {
        super(xPos, yPos, extend);
        this.image = image;
        this.imageView = getImageView();
        root.getChildren().addAll(imageView);
        //this.type = type;
	}
	
	public ImageView getImageView() {
		ImageView i = new ImageView(getImage());
		i.setX(xPos);
		i.setY(yPos);
		return i;
	}

	
    public void move(String direction) {
    	TranslateTransition transition = new TranslateTransition(); 
		transition.setDuration(Duration.seconds(0.5));
		//for ship shooting
		if (direction == "Up") {
			transition.setToY(-750);
			transition.setCycleCount(1/30);
			transition.setNode(imageView);
			transition.play();
		}
		transition.setDuration(Duration.seconds(2));
		//for aliens shooting
		if (direction == "Down") {
			transition.setToY(800);
			transition.setCycleCount(Timeline.INDEFINITE);
			transition.setNode(imageView);
			transition.play();
		}
	}
	
    
	//*****GETTER AND SETTER USING IMAGES*******
	public void setImage(Image image) {
      	this.image = image;
	}
	public Image getImage() {
		return image;
	}
}
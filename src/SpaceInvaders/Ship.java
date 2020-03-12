package SpaceInvaders;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;



public class Ship extends MovableObject{
	Image image;

	
	public Ship (int xPos, int yPos, int extend, int health, Image image, Group root) {
        super(xPos, yPos, extend, health);
        xSpeed = 10;
        ySpeed = 0;
        this.image = image;
    	root.getChildren().addAll(getImageView(this.xPos,this.yPos));
        //this.imagePath = Alien.setImage(imagePath);
	}

	
	public ImageView getImageView(double xPos, double yPos) {
		ImageView i = new ImageView(getImage());
		i.setX(xPos);
		i.setY(yPos);
		return i;
	}
	
	
	//*****GETTER AND SETTER USING IMAGES*******
	public void setImage(Image image) {
      	this.image = image;
            }

	   public Image getImage() {
           return image;
               }

	   
	   
	   
}
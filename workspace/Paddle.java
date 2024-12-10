//
//  Class author:  Aarush K.
//  Date created:  12/02/24
//  General description: This class sets up the characteristics of the paddle, which will be controlled by the player.
//
import java.awt.Graphics;
import java.awt.*;
import java.awt.Color;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int width;
	private int height;
	private int x;
	private int y;
	private int velocity;
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	//methods:
	//Pre-condition: the width has to be greater than 1
    //Post-condition: will return the width of the paddle
	public int getWidth(){
		return width;
	}
	//Pre-condition: the height has to be no greater than 3
    //Post-condition: will return the height of the paddle
	public int getHeight(){
		return height;
	}
	//Pre-condition: the velocity cannot be too large
    //Post-condition: will return the velocity of the paddle
	public int getVelocity(){
		return velocity;
	}
	//Pre-condition: the added amount should not be a large amount. 
    //Post-condition: will return the new velocity of the paddle with the added amount being accounted for 
	public void addVelocity(int addedAmount){
		velocity += addedAmount;
	}
	//Pre-condition: has to be greater than 0.
    //Post-condition: will set the parameter equal to the velocity 
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}
	//Pre-condition: has to be greater than 0.
    //Post-condition: will return the x value
	public int getX(){
		return x;
	}
	//Pre-condition: has to be greater than 0.
    //Post-condition: will return the y value
	public int getY(){
		return y;
	}
	//Pre-condition: has to be greater than 0.
    //Post-condition: will return the x value
	public void setX(int x){
		this.x = x;
	}
	//Pre-condition: pressing of the left and right arrow keys
    //Post-condition: will enable the paddle to move
	public void move(){
		this.x += velocity;
	}
	//Pre-condition: a colour and a shape have to be given
	//Post-condition: will draw the object
	public void draw(Graphics g){
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}
	//getX, getY, getWidth, getHeight, getVelocity, move, addVelocity, setVelocity, setX
	
}

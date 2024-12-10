//
//  Class author:  Aarush K.
//  Date created:  12/02/24
//  General description: This class sets up the characteristics of the ball, which will be hit by the player in order to break the bricks. 
//
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int size;
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	//constructor(s):
	public Ball(int x, int y, int size){
		this.yVelocity = -1;
		this.xVelocity = 0;
		this.size = size;
		this.x = x;
		this.y = y;
	}
	//methods:
	//setXVelocity, setYVelocity, reverseY, getSize, reverseX, setX, setY, getXpos, move, draw, getYpos

	//Pre-condition: has to be an integer
    //Post-condition: sets the parameter equal to x
	public void setX(int x){
		this.x = x;
	}
	//Pre-condition: has to be an integer
    //Post-condition: sets the parameter equal to y
	public void setY(int y){
		this.y = y;
	}
	//Pre-condition: can't be too small nor too big
    //Post-condition: returns the size of the ball
	public int getSize(){
		return size;
	}
	//Pre-condition: has to be an integer
    //Post-condition: sets the parameter equal to the y velocity.
	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}
	//Pre-condition: has to be an integer
    //Post-condition: sets the parameter equal to the x velocity.
	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}
	//Pre-condition: the x position has to be known
    //Post-condition: returns the x value
	public int getXpos(){
		return x;
	}
	//Pre-condition: the y position has to be known
    //Post-condition: returns the y value
	public int getYpos(){
		return y;
	}
	//Pre-condition: x has to be defined
    //Post-condition: reverses the x value, making it the opposite sign
	public void reverseX(){
		this.x *= -1;
	}
	//Pre-condition: y has to be defined
    //Post-condition: reverses the y value, making it the opposite sign
	public void reverseY(){
		this.y *= -1;
	}
	//Pre-condition: the ball has to hit the paddle in order for it to bounce towards the bricks. but the paddle has to move first in order for the ball to drop
    //Post-condition: will enable the ball to move
	public void move(){
		this.x += xVelocity;
		this.y -= yVelocity;
	}
	//Pre-condition: has to have colour and shape
	//Post-condition: will draw object
	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillOval(x, y, size, size);
	}
}

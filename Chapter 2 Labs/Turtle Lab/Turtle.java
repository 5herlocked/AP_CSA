/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
import java.awt.*;
import java.util.*;

public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  
  private static World earth = new World();
  private static Turtle sherl0cked = new Turtle(earth);

  private static void getProperties () {
    double xPos = sherl0cked.getXPos();
    double yPos = sherl0cked.getYPos();
    System.out.println (sherl0cked.getPenColor());
    System.out.println (xPos);
    System.out.println (yPos);
  }

  private static void s (){
    sherl0cked.setPenColor (Color.red);
    sherl0cked.forward(35);
    for (int i = 0; i < 35; i++) {
     sherl0cked.turn(-5);
     sherl0cked.forward(5);
    }
    for (int i = 0; i < 35; i++) {
      sherl0cked.turn(5);
      sherl0cked.forward(5);
    }
    sherl0cked.forward (25);
  }
  
  private static void a(){
    sherl0cked.setPenColor (Color.blue);
    sherl0cked.penUp();
    sherl0cked.moveTo(300, 240);
    sherl0cked.penDown();
    sherl0cked.turn(-75);
    sherl0cked.forward(190);
    sherl0cked.turn(-210);
    sherl0cked.forward(190);
    sherl0cked.penUp();
    sherl0cked.backward(95);
    sherl0cked.penDown();
    sherl0cked.turn(105);
    sherl0cked.forward(50);
  }

  private static void v(){
    sherl0cked.setPenColor (Color.black);
    sherl0cked.setPenWidth (Math.round(Math.round(Math.random()*10)));
    sherl0cked.penUp();
    sherl0cked.moveTo(420,240);
    sherl0cked.turnRight();
    sherl0cked.turn(-15);
    sherl0cked.penDown();
    sherl0cked.forward(190);
    sherl0cked.backward(190);
    sherl0cked.turn(30);
    sherl0cked.forward(190);
    sherl0cked.backward(190);
  }
  
  private static void drawInitials () {
   s();
   a();
   v();
   sherl0cked.hide();
  }
  
  private static void drawSquare(int size){
    for (int i = 0; i < 4; i++){
      sherl0cked.forward(size);
      sherl0cked.turnLeft();
    }
  }
  
  private static void drawTriangle (int size){
    sherl0cked.turnLeft();
    sherl0cked.forward(size);
    sherl0cked.turn(30);
    sherl0cked.forward(size);
    sherl0cked.turn(120);
    sherl0cked.forward(size);
    
  }
  
  private static void drawHouse(){
    
    Scanner inScan = new Scanner (System.in);
    
    System.out.println("Input Size of House: ");
    Integer size = inScan.nextInt();
    
    resetPosition();
   
    drawSquare(size);
    drawTriangle(size);
    sherl0cked.hide();
    inScan.close();
  }
  
  private static void resetPosition (){
    sherl0cked.penUp();
    sherl0cked.turnRight();
    sherl0cked.backward(100);
    sherl0cked.penDown(); 
  }
  
  public static void main(String... args)
  {
    
    //drawInitials();
    drawHouse();
  }   
} // this } is the end of class Turtle, put all new methods before this
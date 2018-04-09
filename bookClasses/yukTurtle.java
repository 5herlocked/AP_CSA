public class yukTurtle
{
  public static void main (String[] args)
  {
   World mars = new World();
  Turtle yuk = new Turtle(mars);
  yuk.penUp();

  yuk.setColor(java.awt.Color.BLACK);
  yuk.forward(100);
  yuk.turnLeft(); 
  yuk.turnLeft(); 
  yuk.forward(100);
  yuk.turnRight(); 
 
yuk.forward(200);  
yuk.turnRight();
yuk.penDown();
yuk.forward(100);
yuk.turn(40); 
yuk.forward();
yuk.turn(180);
yuk.forward();
yuk.turn(100);
yuk.forward();
yuk.penUp();
yuk.turn(130);
yuk.forward(200);
yuk.turn(90);
yuk.penDown();
yuk.forward(175);
yuk.turn(-90);
yuk.forward();
yuk.turn(-90);
yuk.forward(175);
yuk.penUp();
yuk.turn(90);
yuk.forward(100);
yuk.turn(90);
yuk.penDown();
yuk.forward(175);
yuk.turn(180);
yuk.forward();
yuk.turn(60);  
yuk.forward();
yuk.turn(180);
yuk.forward();
yuk.turn(-110);
yuk.forward(100);
yuk.hide();
System.out.println("yukti arora");

  }
}
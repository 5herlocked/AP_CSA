public class Test_Turtle
{
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle sean = new Turtle(earth);
    
   //The letter "S"
    sean.penUp();
    sean.moveTo(120,200);
    sean.penDown();
    sean.turn(35);
    sean.forward(100);
    sean.turn(115);
    sean.forward(100);
    sean.penUp();
    sean.moveTo(120,200);
    sean.turn(-20);
    sean.penDown();
    sean.forward(120);
    sean.turn(75);
    sean.forward(100);
    sean.turn(125);
    sean.forward(100);
    
    //The letter "M"
    sean.penUp();
    sean.moveTo(240,370);
    sean.turn(40);
    sean.penDown();
    sean.forward(245);
    sean.turn(150);
    sean.forward(120);
    sean.turn(-140);
    sean.forward(120);
    sean.turn(150);
    sean.forward(245);
    
    //The letter "L"
    sean.penUp();
    sean.moveTo(430,370);
    sean.turn(-170);
    sean.penDown();
    sean.forward(245);
    sean.penUp();
    sean.moveTo(430,370);
    sean.penDown();
    sean.turn(90);
    sean.forward(110);
    sean.hide();
 
    
  }
}
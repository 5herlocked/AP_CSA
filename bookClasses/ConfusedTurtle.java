public class ConfusedTurtle extends Turtle
{
  public ConfusedTurtle(World theWorld)
  {
    super(theWorld);
  }
  public void turnLeft()
  {
    super.turnRight();
  }
  public void turnRight()
  {
    super.turnLeft();
  }
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle jen = new Turtle(earth);
    ConfusedTurtle katie = new ConfusedTurtle(earth);
    jen.turnLeft();
    katie.turnLeft();
    jen.forward();
    katie.forward();
    jen.turnRight();
    katie.turnRight();
    jen.forward();
    katie.forward();
  }
  
  
  
  
  
  
  
  
  
  
  
    
}
  
  
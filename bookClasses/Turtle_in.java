
 public class Turtle_in
{
  public static void main (String[] args)
  {
      
  World earth = new World();
  Turtle yuk = new Turtle (earth);
  yuk.forward(50);
  yuk.turnRight();
  yuk.forward();
  yuk.turn(90);
  yuk.forward(50);
  yuk.turn(90);
  yuk.forward();
  }
}
    
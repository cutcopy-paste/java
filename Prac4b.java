import java.util.*;
class Prac4b
{
  Prac4b()
  {
    System.out.print("I am a Constructor.");
  }
  protected void finalize()
  {
    System.out.print("Garbage Collected...");
  }
  public static void main(String arg[])
  {
    Prac4b b = new Prac4b();
    b.finalize();
    System.gc();
  }
}
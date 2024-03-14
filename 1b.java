import java.util.*;
class Prac1b
{
  void delay(int time)
  {
    int i,j;
    for(i=0;i<time;i++)
    {
      for(j=0;j<1000;j++)
      {
      }
    } 
    
  }
  public static void main(String arg[])
  {
    Prac1b p=new Prac1b();
    int i,j;
    for(i=0;i<5;i++)
    {
      for(j=i;j<5;j++)
      {
        System.out.print("#");
        p.delay(250);
      }
      System.out.print("\n");
    }
  }
}
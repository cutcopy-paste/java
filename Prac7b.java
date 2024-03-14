import java.util.*;
class Prac7b extends Thread
{
  public void run()
  {
    System.out.print("Thread is Running.");
  }
  public static void main(String arg[])
  {
    Thread t=Thread.currentThread();
    System.out.println("Current Thread - " + t);
    t.setName("SYIT");
    System.out.println("After setting new name : " + t);
    System.out.println("Priority : " + t.getPriority());
    try
    {
      for(int i=0;i<5;i++)
      {
        t.sleep(3000);
        System.out.println("Main Thread Running - " + i);
      }
    }
    catch(Exception e)
    {
      System.out.print(e.toString());
    }
  }
}
import java.io.*;
import java.util.*;
class Prac8a
{
  public static void main(String arg[]) throws IOException
  {
    FileInputStream f = new FileInputStream("Prac8a.java");
    int i=0;
    while((i=f.read())!=-1)
    {
      System.out.print((char)i);
    }
    f.close();
  }
}
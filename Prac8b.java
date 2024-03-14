import java.io.*;
class Prac8b
{
  public static void main(String arg[]) throws IOException
  {
    FileInputStream tobecopied = new FileInputStream("Prac8a.java");
    FileOutputStream copiedfile = new FileOutputStream("Copy.java");
    int i=0;
    while((i=tobecopied.read())!=-1)
    {
      copiedfile.write((byte)i);
    }
    System.out.print("File Copied Successfully...");
  }
}
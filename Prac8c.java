import java.io.*;
class Prac8c
{
  public static void main(String arg[]) throws IOException
  {
    int rollno;
    long mob;
    String name;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter details of student(rollno,name,mob) : ");
    rollno=Integer.parseInt(br.readLine());
    name=br.readLine();
    mob=Long.parseLong(br.readLine());
    FileWriter f = new FileWriter("Student's.txt",true);
    f.write("Student Info\n");
    f.write("Roll no : " + rollno + "\n");
    f.write("Student Name : " + name + "\n"); 
    f.write("Mobile No. : " + mob);
    f.close();
    br.close();
  }
}
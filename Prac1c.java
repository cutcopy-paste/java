import java.util.*;
class Circle
{
  int r;
  void area(int r)
  {
    double ar=3.14*r*r;
    System.out.println("Area of circle : "+ar);
    System.out.print("Type 3 to exit.");
  }
  void circumference(int r)
  {
    double c=2*3.14*r;
    System.out.print("Circumference of Circle : "+c);
    System.out.print("Type 3 to exit.");
  }
}
class Prac1c
{
  public static void main(String arg[])
  {
    Circle c=new Circle();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter radius of circle : ");
    int r=sc.nextInt();
    int ch;
    do
    {
    System.out.print("Select an option\n1.Area\n2.Circumference");
    ch=sc.nextInt();
       switch(ch)
       {
         case 1:c.area(r);break;
         case 2:c.circumference(r);break;
         case 3:System.out.print("Exitted successfully.");break;
         default:System.out.print("Invalid Choice.");
       }
    }while(ch!=3); 
  }
}
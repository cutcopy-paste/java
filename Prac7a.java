import java.io.*;
import java.util.*;
class Prac7a
{
  public  static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of vector : ");
    int n=sc.nextInt();
    Vector<Integer> v=new Vector<Integer>(n);
    for(int i=0;i<n;i++)
    {
      System.out.print("Enter value for index "+i);
      int data=sc.nextInt();
      v.add(data);
    }
    System.out.println("Vector:\n"+v);
    v.remove(3);
    System.out.println("After removing an element : "+v);
    System.out.println("Capacity of vector : "+v.capacity());
    System.out.println("Size of vector : "+ v.size());
    for(int i=0;i<v.size();i++)
    {
      System.out.println("Value at index " + i + " is " + v.get(i));
    }
    System.out.println("First Element : "+ v.firstElement());
    System.out.println("Last Element : "+ v.lastElement());
  }
}
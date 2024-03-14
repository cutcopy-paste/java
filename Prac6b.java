import java.util.*;
class Prac6b
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    System.out.print("Enter values for Matrix 1 : ");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        a[i][j]=sc.nextInt(); 
      }
    }
    System.out.print("Enter values for Matrix 2 : ");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    System.out.println("Matrix 1");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.print("\n");
    }
    System.out.println("Matrix 2");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.print("\n");
    }
    System.out.println("Addition of matrix");
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        System.out.print(a[i][j]+b[i][j]+" ");
      }
    }
  }
}
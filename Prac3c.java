import java.util.*;
class Prac3c
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      System.out.print("Enter"+ n +"values for array : ");
      arr[i]=sc.nextInt();
    }
    int min=arr[0],max=arr[0];
    for(int i=0;i<n;i++)
    {
      if(arr[i]<min)
      {
        min=arr[i];
      }
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.print("Minimum Value : "+ min + "\nMaximum Value : "+ max);
  }
}
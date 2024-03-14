import java.util.*;
class Prac4a
{
  int n;
  void asc(int arr[],int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]>arr[j])
        {
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
     System.out.print(arr[i]);
    }
  }
  void dsc(int arr[],int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]<arr[j])
        {
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
     System.out.print(arr[i]);
    }
  }
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n=sc.nextInt();    
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      System.out.print("Enter value for " + i + " :");
      arr[i]=sc.nextInt();
    }
    Prac4a a=new Prac4a();
    a.asc(arr,n);
    a.dsc(arr,n);
  }
}
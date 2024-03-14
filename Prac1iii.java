import java.util.*;
class Prac1iii
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number:");
    int num=sc.nextInt();
    int n=num,sum=0;
    while(n!=0)
    {
      int rem=n%10;
      sum=sum+rem;
      n=n/10;
    }     
    System.out.print("Sum is "+sum);
  }
}
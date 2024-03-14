import java.util.*;
class Prac1ii
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number : ");
    int num=sc.nextInt();
    int n=num,rev=0,rem;
    while(n!=0)
    {
      rem=n%10;
      rev=(rev*10)+rem;
      n=n/10;
    }
    if(num==rev)
    {
      System.out.print("Palindrome.");
    }
    else
    {
      System.out.print("Not Palindrome.");
    }
  }
}
import java.util.*;
class Prac2c
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any string:");
    String s=sc.nextLine();
    int len=s.length();
    String rev="";
    for(int i=len-1;i>=0;i--)
    {
       rev=rev+s.charAt(i)+"";
    }
    System.out.print(rev);
  }
}
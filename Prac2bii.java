import java.util.*;
class Prac2bii
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num=sc.nextInt();
    long binary=0;int place=1;int rem;
    while(num!=0)
    {
      rem=num%2;
      binary+=rem*place;
      place*=10;
      num/=2;
    }
    System.out.println(binary);
  }
}
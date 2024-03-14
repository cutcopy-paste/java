import java.util.*;
class Prac2bi
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any binary number:");
    long num=sc.nextLong();
    int pos=0,sum=0,rem;
    while((int)num!=0)
    {
      rem=(int)num % 10;
      sum=sum+rem*(int)(Math.pow(2,pos));
      num=(int)num/10;
      pos++;
    }
    System.out.println(sum);
  }
}
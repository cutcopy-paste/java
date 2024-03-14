import java.util.*;
class Prac1i
{
  public static void main(String arg[])
  {
    int i,num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    for(i=1;i<=10;i++)
    {
      System.out.println(num+"*"+i+"="+num*i);
    }
  }
}
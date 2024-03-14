import java.util.*;
class Prac2a
{
  public static void main(String arg[])
  {
     int sum[]=new int[10];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1st binary no.");    
     long b1=sc.nextLong();
     System.out.println("Enter 2nd binary no.");    
     long b2=sc.nextLong();
     int i=0,carry=0;
     while(b1!=0 || b2!=0)
     {
       sum[i++]=(int)(b1%10+b2%10+carry)%2;
       carry=(int)(b1%10+b2%10+carry)/2;
       b1=b1/10;
       b2=b2/10;
     }
     if(carry!=0)
     {
       sum[i++]=carry;
     }
     --i;
     while(i>=0)
     {
       System.out.print(sum[i]);
       i--;
     }
  }
}
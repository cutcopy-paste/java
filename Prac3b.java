import java.util.*;
class Prac3b
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any string : ");
    String str=sc.nextLine();
    int sum=0,len=str.length();
    char ch[]=str.toCharArray();
    for(int i=0;i<len;i++)
    {
      if(Character.isDigit(ch[i]))
      {
       sum+=Character.getNumericValue(ch[i]);
      }
    }
    System.out.print("Sum of all digits present in string : "+ sum);
  }
}
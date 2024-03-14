import java.util.*;
class Prac3a
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any string : ");
    String str=sc.nextLine();
    int len=str.length();
    char ch[]=str.toCharArray();
    int letters=0,digits=0,space=0,others=0;
    for(int i=0;i<len;i++)
    {
      if(Character.isLetter(ch[i]))
      {
        letters++;
      }
      else if(Character.isDigit(ch[i]))
      {
        digits++;
      }
      else if(Character.isSpaceChar(ch[i]))
      {
        space++;
      }
      else
      {
        others++;
      }
    }
    System.out.print("Letters : " + letters + "\n Digits : " + digits + "\n Space : " + space + "\nOthers : " + others);
  }
}
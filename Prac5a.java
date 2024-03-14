import java.util.*;
class Bank
{
int r=6;
void disp()
{
System.out.print("The interest rate is "+ r);
}
}
class SBI extends Bank
{
double SI;
void simple(int p,int y)
{
SI=(p*r*y)/100;
}
void display()
{
System.out.print("\nSimple interest is: "+ SI);
}
}
class Prac5a
{
public static void main(String arg[])
{
int p,y;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter principal Amt: ");
p=sc.nextInt();
System.out.print("\n Enter no of year:");
y=sc.nextInt();
SBI lunch= new SBI();
lunch.disp();
lunch.simple(p,y);
lunch.display();
}
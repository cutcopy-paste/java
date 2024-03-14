import java.util.*;
class Bank
{
int getRate()
{
return 0;
}
}
class SBI extends Bank
{
int getRate()
{
return 5;
}
}
class HDFC extends Bank
{
int getRate()
{
return 7;
}
}
class BOI
{
int getRate()
{
return 9;
}
}
class Prac5b
{
public static void main(String arg[])
{
SBI s = new SBI();
HDFC h = new HDFC();
BOI b = new BOI();
System.out.print("\n Rate of interest in SBI = "+s.getRate()+"%");
System.out.print("\n Rate of interest in HDFC = "+h.getRate()+"%");
System.out.print("\n Rate of interest in BOI = "+b.getRate()+"%");
}
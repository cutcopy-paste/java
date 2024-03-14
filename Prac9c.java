import java.util.*;
class InvalidAgeException extends Exception
{
public InvalidAgeException (String str)
{
super(str);
}
}
class CustomException1
{
void validate (int age) throws InvalidAgeException
{
if(age < 18)
{
throw new InvalidAgeException("\n Age is not valid for Driving License");
}
else
{
System.out.print("\n Age valid for Driving License....Go for test");
}
}
}
public class Prac9c
{
public static void main(String arg[])
{
int age ;
Scanner sc=new Scanner(System.in);
CustomException1 error = new CustomException1();
System.out.print("Enter age = ");
age=sc.nextInt();
try
{
error.validate(age);
}
catch(InvalidAgeException ex)
{
System.out.print("Caught the Exception ");
System.out.print("Exception Occured: "+ ex);
}
}
}
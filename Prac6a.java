Add.java
package cal;
public class Add
{
int x,y;
public Add(int a,int b)
{
x=a;
y=b;
}
public void sum()
{
System.out.print("\n Sum= "+ (x+y));
}
}
Cube.java
package cal;
public class Cube
{
int x;
public Cube(int a)
{
x=a;
}
public void compute()
{
System.out.print("\n Cube= "+ (x*x*x));
}
}
Square.java
package cal;
public class Square
{
int x;
public Square(int a)
{
x=a;
}
public void process()
{
System.out.print("\n Square= "+ (x*x));
}
}
Prac6a.java (main file):-
import cal.*;
class Prac6a
{
public static void main(String arg[])
{
Add a = new Add(50,50);
a.sum();
Cube c = new Cube(2);
c.compute();
Square s = new Square(8);
s.process();
}
}
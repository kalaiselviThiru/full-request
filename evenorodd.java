import java.util.Scanner;
class evenorodd
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.print("enter a number:");
int num = obj.nextInt();
if(num%2 != 0)
{
System.out.print("it is odd number");
}else
{
System.out.print("it is even number");
}
}
}
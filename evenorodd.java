import java.util.Scanner;
class evenorodd
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int num = obj.nextInt(4);
if(num%2 == 0)
{
System.out.print("it is even number");
}else
{
System.out.print("it is odd number");
}
}
}

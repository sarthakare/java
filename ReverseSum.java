import  java.util.*;
class ReverseSum
{
public static void main(String args[])
{
int num,rem, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
num = sc.nextInt();
System.out.println("Reverse order is : ");
while(num > 0)
{
rem = num%10;
sum = rem + sum;
System.out.print(rem);
num = num / 10;
}
System.out.println("\n Sum of digit in entered no : " + sum);
}
}
//thakre

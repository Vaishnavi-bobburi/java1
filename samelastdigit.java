import java.util.Scanner;
class Samelastdigits
{
public static void main(String args[])
{
int n1,n2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n1 number:");
 n1=sc.nextInt();
System.out.println("Enter the n2 Number");
 n2=sc.nextInt();
if((n1%10)==(n2%10))
System.out.println("True");
else
System.out.println("False");
}
}
import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int n,d,r=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
temp=n;
while(n>0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
if(temp==r)
System.out.println("Given number is palindrome");
else
System.out.println("Given number is not palindrome");
}
}

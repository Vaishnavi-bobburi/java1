import java.util.Scanner;
class Switch
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1.January,2.Febuary,3.March,4.April,5.May,6.June,7.July,8.August,9.September,10.October,11.November,12.December");
System.out.println("Enter");
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("January");
break;
case 2:
System.out.println("Febuary");
break;
case 3:
System.out.println("March");
break;
case 4:
System.out.println("April");
break;
case 5:
System.out.println("May");
break;
case 6:
System.out.println("June");
break;
case 7:
System.out.println("July");
break;
case 8:
System.out.println("August");
break;
case 9:
System.out.println("September");
break;
case 10:
System.out.println("October");
break;
case 11:
System.out.println("November");
break;
case 12:
System.out.println("December");
break;
default:
System.out.println("Enter valid number");
}
}
}
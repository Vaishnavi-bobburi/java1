import java.util.Scanner; 
public class NumberOfDigits { 
 
public static void main(String[] args) { 
int arm=0, a,b,c,d,no;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter any number : ");
 no = scanner.nextInt();
 d = no;
 while(no>0)
 { 
a = no%10; no =
 no/10; arm
 =arm+a*a*a; 
}
 if(arm==d){
 System.out.println("Armstrong number");
 }
 else{
 System.out.println("Not Armstrong number"); 
} 
} 
} 
 
public static void main(String[] args) { 
int no = 0, a = 0;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter any number : ");
 no = scanner.nextInt();
 if(no<0)
 { 
no = no * -1; 
} else if (no==0) { 
no=1; 
} 
while(no>0) 
{ 
no=no/10; 
a++;} 
System.out.println("Number of digits in given number is :" +a); }
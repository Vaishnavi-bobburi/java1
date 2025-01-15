import java.util.*;
class Variables
{
public static void main(String args[])
{
char ch='%';

if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println("Alphabet");
else if(ch>=0&&ch<=9)
System.out.println("Digits");
else
System.out.println("Special Symbols");
}
}




class Stu_Data 
{ 
introllno; 
String sname; 
Stu_Data(intrno, String name) 
{ 
rollno=rno; 
sname=name; 
} 
void show() 
{ 
System.out.println("Rollno :: "+rollno); 
System.out.println("Name :: "+sname); 
} 
} 
class Student extends Stu_Data 
{ 
int m,p,c; 
Student(intrno, String name, int m1, int 
m2, int m3) 
{ 
super(rno,name); 
m=m1; 
p=m2; 
c=m3; 
} 
inttot_marks() 
{ 
returnm+p+c; 
} 
floatavg() 
{ 
return (m+p+c)/3.0f; 
void display() 
{ 
show(); 
System.out.println("Marks in 3 sub :: 
"+m+" "+p+" "+c); 
System.out.println("Total :: 
"+tot_marks()); 
System.out.println("Average :: "+avg()); 
} 
} 
class SLInheritance 
{ 
public static void main(String args[]) 
{ 
Student ob = new 
Student(501,"Ruchitha",65,54,71); 
ob.display(); 
} 
} 
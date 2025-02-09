class Box 
{  
double width;  
double height; 
double depth; 
double volume()    
{  
return (width * height * depth); 
} 
} 
class Main 
{ 
public static void main(String args[])  
{   
Box mybox1 = new Box();  
Box mybox2 = new Box();  
// assign values to mybox1's instance variables  
mybox1.width = 10;  
mybox1.height = 20;  
mybox1.depth = 15;  
/* assign different values to mybox2's instance variables */  
mybox2.width = 3;   
mybox2.height = 6;  
mybox2.depth = 9;  
// display volume  
double vol1= mybox1.volume(); 
System.out.println("Volume of Box1 :: "+vol1); 
double vol2=mybox2.volume(); 
System.out.print("Volume of Box2 :: "+vol2); 
}  // main() ends 
} // class ends
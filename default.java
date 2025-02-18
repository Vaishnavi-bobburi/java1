public class DefaultValues { 
   byte byteVariable; 
   short shortVariable; 
   int intVariable; 
   long longVaraible; 
   float floatVariable; 
   double doubleVariable; 
   boolean boolVariable; 
   String stringVariable; 
   public static void main(String args[]){ 
      DefaultValues obj = new DefaultValues(); 
      System.out.println("Default values of numeric variables in Java:"); 
      System.out.println("byte: "+obj.byteVariable); 
      System.out.println("short: "+obj.shortVariable); 
      System.out.println("int: "+obj.intVariable); 
      System.out.println("long: "+obj.longVaraible); 
      System.out.println("float: "+obj.floatVariable); 
      System.out.println("double: "+obj.doubleVariable); 
      System.out.println("Default values of non-numeric variables in Java:"); 
      System.out.println("boolean: "+obj.boolVariable); 
      System.out.println("string: "+obj.stringVariable); 
   } 
}
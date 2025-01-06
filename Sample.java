abstract class Student {
    // Abstract method - must be implemented by subclasses
    abstract void StudentDetails();

    // Concrete method with proper syntax
    void Name() {
        System.out.println("vaishu");
    }
}

class Information extends Student {
    // Implementation of the abstract method
    void StudentDetails() {
        System.out.println("Here are the student details.");
    }
}

public class Sample {
    public static void main(String args[]) {
        // Creating an object of the subclass
        Information I = new Information();
        I.Name(); // Calls the concrete method from the abstract class
        I.StudentDetails(); // Calls the overridden method
    }
}

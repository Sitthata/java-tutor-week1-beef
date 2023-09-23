public class Scope {
    // Static Variable: Accessible to all instances of the class
    // It's a class-level variable
    static int STATIC_VAR = 100;

    // Instance Variable: Each instance of the class has its own copy
    // It's an object-level variable
    int instanceVar = 50;

    public static void main(String[] args) {
        // Local Variable: Only accessible within this method
        int localVar = 10;

        // Create an object of the Scope class
        Scope myScope = new Scope();

        // Accessing the static variable
        System.out.println("Static Variable: " + STATIC_VAR);

        // Accessing the instance variable
        System.out.println("Instance Variable: " + myScope.instanceVar);

        // Accessing the local variable
        System.out.println("Local Variable: " + localVar);

        // Demonstrating the variable scope via a method call
//        myScope.myMethod();
    }

    public void myMethod() {
        // Local Variable in a different method
        int localVar = 20;

        // Accessing the static variable within an instance method
        System.out.println("Static Variable inside myMethod: " + STATIC_VAR);

        // Accessing the instance variable within an instance method
        System.out.println("Instance Variable inside myMethod: " + instanceVar);

        // Accessing the local variable within an instance method
        System.out.println("Local Variable inside myMethod: " + localVar);
    }
}

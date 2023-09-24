public class DataType {

    public static void main(String[] args) {
        // Declare a Variable Type int, double, char, String and boolean
        // A -> number
        // B -> decimal
        // C -> character
        // camelCase -> mynumber -> myNumber
        int myNumber = 32;
        double decimal = 32.145;
        char character = 'i';
        String info = "First";
        boolean isMale = true;

        // Now try to use Arithmetic and String Concatenation using this example
        double sum = myNumber + decimal;
        float product = myNumber * (float) decimal;
        // "Hello," + info
        String greet = "hello world, " + info;

        // Now let's try to compare them
        boolean isMoreThanFifteen = myNumber > 15; // true
        String myName = "First";
    }

}

public class Loop {
    public static void main(String[] args) {

    }

    public static void whileMeow() {
        // Try print meow 3 times but...
        int i = 0;
        while (i < 3) {
            System.out.println("Meow");
            i += 1;
        }
    }

    public static void forMeow() {
        // Try print meow 3 times
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i + ": Meow");
        }
    }
}

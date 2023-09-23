public class Pub {
    public static void main(String[] args) {
        pub();
    }

    public static void pub() {
        // Implement your code here
        // Only the person with the age more than 18 are accept in our pub.
    }

    public static void conditional() {
        // Using if statement
        int a = 10;
        if (a > 5) {
            System.out.println("The value of 'a' is greater than 5.");
        }

        // Using if-else statement
        int b = 2;
        if (b > 5) {
            System.out.println("The value of 'b' is greater than 5.");
        } else {
            System.out.println("The value of 'b' is 5 or less.");
        }

        // Using if-elseif-else statement
        int grade = 85;
        if (grade >= 90) {
            System.out.println("You got an A!");
        } else if (grade >= 80) {
            System.out.println("You got a B!");
        } else if (grade >= 70) {
            System.out.println("You got a C.");
        } else {
            System.out.println("Sorry, you failed.");
        }
    }

    public static void switchCase() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

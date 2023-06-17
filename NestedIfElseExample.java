public class NestedIfElseExample {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        if (num1 > 0) {
            if (num2 > 0) {
                System.out.println("Both numbers are positive.");
            } else {
                System.out.println("First number is positive, but second number is not.");
            }
        } else {
            System.out.println("First number is not positive.");
        }
    }
}

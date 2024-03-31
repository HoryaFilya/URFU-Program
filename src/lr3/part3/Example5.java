package lr3.part3;

public class Example5 {

    public static void main(String[] args) {
        System.out.println("Result: " + fact(5));
    }

    private static int fact(int n) {
        System.out.println("Entering fact(" + n + ")");

        if (n == 0) {
            System.out.println("Returning 0 from fact(" + n + ")");
            return 0;
        } else if (n == 1) {
            System.out.println("Returning 1 from fact(" + n + ")");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Returning " + result + " from fact(" + n + ")");
            return result;
        }
    }
}
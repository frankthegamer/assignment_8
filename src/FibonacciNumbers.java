public class FibonacciNumbers {
    public static void main(String[] args) {
        int firstArg = 0;

        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                if (firstArg < 0) {
                    System.err.println("Error: You must enter a non-negative number");
                    System.exit(1);
                }
                System.out.println(fibonacci(firstArg));
            } catch (NumberFormatException e) {
                System.err.println("Error: You must enter a non-negative number");
                System.exit(1);
            }
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}







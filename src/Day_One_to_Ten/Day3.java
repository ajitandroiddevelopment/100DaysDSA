package Day_One_to_Ten;

public class Day3 {
    public static int sum(int n) {
        // Base case: If n is 1, the sum is 1.
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: Sum of n numbers is n + sum of (n-1) numbers.
            return n + sum(n - 1);
        }
    }

    // You can also use this alternative approach for the sum calculation:
    public static int calculateSum(int n) {
        // Base case: If n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        } else {
            // Recursive case: Sum of n numbers is n + sum of (n-1) numbers.
            return n + calculateSum(n - 1);
        }
    }


    public static void main(String[] args) {

        int n=10;
        int result1 = sum(n);
        int result2 = calculateSum(n);
        System.out.println("Sum of first " +n+ " number is: "+ result1  );
        System.out.println("Sum of first " +n+ " number is: "+ result2  );

    }
}

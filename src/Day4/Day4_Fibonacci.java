package Day4;

public class Day4_Fibonacci {
    public static int fibonacci(int n){
        if (n == 0) { //base case
            return 0;
        }
        if (n == 1) {  // base case
            return 1;

        }
        else return fibonacci(n-1) + fibonacci(n-2);

    }

    public static void main(String[] args) {
        //
        int n = 10;
        int result = fibonacci(n);
        System.out.println( n+"th fibonacci no is : " +result);

        for (int i = 0; i <= n; i++) {
            // printing the first nth fibonacci number

            System.out.println(i+"th :" +fibonacci(i));


        }
    }
}

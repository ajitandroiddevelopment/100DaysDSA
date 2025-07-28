package Day_One_to_Ten;

public class Day2 {
    // here we will see the brief of time complexity
    // how it is calculated

    public static void main(String[] args) {
        int n =4;
        // outer loop (n -> 0 to 3) means 4 times
        for (int i = 0; i < n; i++) {
            // inner loop (n -> 0 to 3) means 4 times
            for (int j = 0; j < n; j++) {

                System.out.println("i: " +i+ " j: " +j);
                // inner loop runs 4 time
                // outer loop runs 4 time
                // hence time Complexity will O(n^2)

            }

        }
    }
}

package Day11;

public class FixedSlidingWindow {

    public static int maxSum(int[] arr , int k){

        int n = arr.length;

        if (n<k) {
            System.out.println("Invalid array : window size is more than array size ");
            return -1;
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            // initial window sum
            windowSum = windowSum + arr[i];

        }

        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            // sliding the window
            windowSum = windowSum + arr[i] - arr[i-k];

            maxSum = Math.max(maxSum,windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,11,45,3,6,7};
        int windowSize = 4;
        int result = maxSum(arr,windowSize);
        System.out.println(result);
    }
}

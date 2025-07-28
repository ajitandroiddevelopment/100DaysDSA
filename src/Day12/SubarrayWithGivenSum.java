package Day12;

public class SubarrayWithGivenSum {

    public static boolean hasSubarrayWithSum(int[] arr, int target){
        int left =0 , right=0,sum=0;

        while (right < arr.length){

            sum = sum + arr[right];
            // shrink window if the sum>target
            while (sum>target && left <= right){
                sum = sum -arr[left];
                left++;
            }
            // check for the match(target is equal to sum or not
            if (sum==target) return true;

            right++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 11;

        System.out.println("Array is Having subArray with sum " +target+ " --> " +hasSubarrayWithSum(arr,target));
    }
}

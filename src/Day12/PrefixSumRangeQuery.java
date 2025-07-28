package Day12;

public class PrefixSumRangeQuery {

    public static int[] buildPrefixSum(int[] arr){
        int n= arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n ; i++) {

            prefix[i] = prefix[i-1] + arr[i];

        }
        return prefix;
    }

    public static int rangeSum(int[] prefix , int L, int R){
        if (L==0){
            return prefix[R];
        }else {
            return prefix[R] - prefix[L-1];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1,3,6,8,9,4,6,7,2};
        int[] prefix = buildPrefixSum(arr);
        int L=2,R=4;
        int result = rangeSum(prefix,L,R);
        System.out.println(result);
    }
}

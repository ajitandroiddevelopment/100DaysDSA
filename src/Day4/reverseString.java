package Day4;

public class reverseString {

    public static String reverse(String str){
        if (str.isEmpty() || str.length()==1){
            return str;
        }

        char[] charArray = str.toCharArray();
        reverseRecursinve(charArray,0,charArray.length-1);
        return new String(charArray);
    }

    private static void reverseRecursinve(char[] arr, int start, int end) {

//        if (start>=end){
//            return;
//        }
//
//        char temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        reverseRecursinve(arr, start+1, end-1);

        
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

    public static void main(String[] args) {
        String s = "HELLO";
        String result = reverse(s);
        System.out.println(" reverse of string " +s+ " is : "+result);
    }
}

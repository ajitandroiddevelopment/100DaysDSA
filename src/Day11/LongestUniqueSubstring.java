package Day11;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s){


      // INITIALIZING THE HASH SET
        Set<Character> seen = new HashSet<>();

        int left =0;
        int right =0;

        int maxLen = 0;

        while (right < s.length()){

            char currentChar = s.charAt(right);
            if(seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }else {
                seen.add(currentChar);
                int currentLen = right - left +1;
                maxLen = Math.max(maxLen,currentLen);
                right++;
            }



        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcdaaabcdefghhporas";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

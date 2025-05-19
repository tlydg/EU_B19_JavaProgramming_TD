package day28_StringReview;

public class C08_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {

        System.out.println("longestSubstringWithoutRepeat(\"pwwkew\") = " + longestSubstringWithoutRepeat("pwwkew"));


    }


    public static int longestSubstringWithoutRepeat(String str) {
        String result = "";
        int max = 0;
        for (int i = 0; i <str.length() ; i++) {
            result = str.substring(i,i+1);
            for (int j = i+1; j <str.length() ; j++) {
                if(!result.contains(str.substring(j,j+1))){
                    result += str.substring(j,j+1);
                }else{
                    break;
                }
                max = Math.max(max,result.length());
            }
        }
        return max;


    }
}

/**
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */


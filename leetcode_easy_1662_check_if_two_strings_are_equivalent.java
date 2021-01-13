//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
import java.util.*;

public class leetcode_easy_1662_check_if_two_strings_are_equivalent{
    public static void main(String[]args){
	String[] s1 = {"ab", "c"};
	String[] s2 = {"a", "bc"};
	System.out.println(arrayStringsAreEqual(s1,s2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "", w2 = "";
        for(int i = 0; i < word1.length; i++){
            w1 += word1[i];
        }
        for(int i = 0; i < word2.length; i++){
            w2 += word2[i];
        }
        return w1.equals(w2);
    }
}

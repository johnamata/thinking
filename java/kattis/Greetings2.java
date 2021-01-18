/*
  https://open.kattis.com/problems/greetings2
  Greetings!
*/

import java.util.*;
public class Greetings2{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String e = "";
	
        for (int i = 0; i < s.length() - 2; i++){
            e += "ee";
        }
        System.out.println("h" + e + "y");

	/*
	//alternatively, we could do something like this
	//would have to check though as it's getting errors on kattis end'

	char[] ans = new char[s.length()];
	for(int i = 1; i < s.length()-1; i++){
	    ans[i] = s.charAt(i);
	}
	String answer = s.charAt(0) + String.valueOf(ans) + String.valueOf(ans) + s.charAt(s.length()-1);
	System.out.println(answer);
	*/
	
    }
}

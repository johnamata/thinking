import java.util.Scanner;

/**
https://open.kattis.com/problems/sevenwonders
*/

public class SevenWonders{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String input = scanInput.nextLine();
	//todo
	/*
	  find way to traverse the whole string input
	  count instances of t, c, g
	  find way to count everytime there's a combo
	  formula
	 */
	int t = 0;
	int c = 0;
	int g = 0;
	int ans = 0;
	int combo = 0;
	for(int i = 0; i < input.length(); i++){
	    if(input.charAt(i)=='T'){
		t++;
	    } else if (input.charAt(i)=='C'){
		c++;
	    }
	    else{
		g++;
	    }
	}
	
	
	if(t > 0 && c > 0 && g > 0){
	    combo = Math.min(t, Math.min(c,g)) *7;
	    ans = (t*t) + (c*c) + (g*g) + combo;
	} else {
	    ans = (t*t) + (c*c) + (g*g);
	}
	System.out.println(ans);
	
    }
}

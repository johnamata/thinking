import java.util.Scanner;

/**
https://open.kattis.com/problems/trik
*/

public class Trik{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String string = scanInput.nextLine();
	
	int[] cup = {1,0,0};
	int position = 0;
	//ball starts at the leftmost cup
	for(int i = 0; i < string.length(); i++){
	    //System.out.println(string.charAt(i));
	    if(string.charAt(i)=='A'){
		//swapping, using x as placeholder
		int x = cup[1];
		cup[1] = cup[0];
		cup[0] = x; //purges value of previous cup

		/*
initially,i thought of just using the  2 commented lines of code below for this if statement but it was clear that i had to abandon it when faced with an input of "CBABCACCC":
		cup[1] = cup[0];
		cup[0] = 0; 
		 */
	    } else if (string.charAt(i)=='B'){
		int x = cup[2];
		cup[2] = cup[1];
		cup[1] = x;
	    } else if (string.charAt(i)=='C'){
		int x = cup[2];
		cup[2] = cup[0];
		cup[0] = x;
	    }
	}
	
	for(int i = 0; i < cup.length; i++){
	    if(cup[i] == 1){
		position = i;
	    }
	}
	
	System.out.println(position+1);
    }
}

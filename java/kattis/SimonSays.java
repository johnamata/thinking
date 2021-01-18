import java.util.Scanner;
/**
https://open.kattis.com/problems/simonsays
 */

public class SimonSays{

    public static void main(String[]args){
	Scanner scanInput = new Scanner (System.in);
	int N = scanInput.nextInt();
	String z = "";
	String simon = "Simon says";
	//todo
	/*
	  perhaps create loop for each character?
	  nevermind, learned about startsWith function as well as replace
	  stuff to do in teh future: learn regex, or contains() in java
	 */
	for (int i = 0; i <= N; i++){
	    z = scanInput.nextLine();
	    if (z.startsWith(simon)){
		System.out.println(z.replaceAll(simon, ""));
	    }
	}
    }
}

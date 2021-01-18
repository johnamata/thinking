import java.util.Scanner;

/**
https://open.kattis.com/problems/basketballoneonone
*/

public class BasketBallOneOnOne{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String record = scanInput.nextLine();
	int A = 0;
	int B = 0;
	for (int i = 0; i<record.length(); i++){
	    if(record.charAt(i)=='A'){
		//initially i tried Integer.parseInt, but turns out it can only do string, so I learned about Character.getNumericValue today
	        A += Character.getNumericValue(record.charAt(i+1));
	    } else if (record.charAt(i)=='B') {
		B += Character.getNumericValue(record.charAt(i+1));
	    }
	}

	if(A>B){
	    System.out.println("A");
	} else {
	    System.out.println("B");
	}
    }
}

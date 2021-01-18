import java.util.Scanner;
import java.util.HashMap;

public class Bela{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	//putting the card rules
	HashMap<String, Integer> dominant = new HashMap<String, Integer>();
	dominant.put("A", 11);
	dominant.put("K", 4);
	dominant.put("Q", 3);
	dominant.put("J", 20);
	dominant.put("T", 10);
	dominant.put("9", 14);
	
	HashMap<String, Integer> nonDominant = new HashMap<String, Integer>();
	nonDominant.put("A", 11);
	nonDominant.put("K", 4);
	nonDominant.put("Q", 3);
	nonDominant.put("J", 2);
	nonDominant.put("T", 10);
	
	int N = scanInput.nextInt();
	//the most important thing here was the .trim()
	//i was getting errors without it
	String B = scanInput.nextLine().trim();
	int point = 0;
	
	for (int i = 0; i < (4 * N); i++){
	    String description = scanInput.nextLine();
	    String number = "" + description.charAt(0);
	    String suit = "" + description.charAt(1);

	    if (suit.equals(B)) {
		if (dominant.containsKey(number)) {
		    point += dominant.get(number);
		}
	    } else {
		if (nonDominant.containsKey(number)) {
		    point += nonDominant.get(number);
		}
	    }
	}
	System.out.println(point);    
    }
}

import java.util.Scanner;
import java.util.HashMap;
/**
https://open.kattis.com/problems/pokerhand
*/
public class PokerHand{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	
	//thought of using arrays, reading shit like this one by one
	//input[0] = Character.toString(scanInput.nextLine().charAt(0));
	
	//or through a for-loop like this
	//input[i] = scanInput.nextLine().charAt(0);
	
	//and then sorting it with Arrays.sort()
	//then compare them, count the duplicates then doing a max count

	//but have decided to use hashmaps instead, as it seems taht the input are in one block. anyhow, i think next time, i should start thinking of them first before arrays

	HashMap<Character, Integer> hs = new HashMap<>();
	//READ INPUT
	String[] cards = scanInput.nextLine().split(" ");

        for (String card : cards) {
	    //get first character as it's (rank) literally all we need, the suit is just distraction
            char rank = card.charAt(0);

	    //check if it's in the hashmap, else we put it in the hashmap
            if (hs.containsKey(rank)) {
                hs.put(rank, hs.get(rank) + 1);
            } else {
                hs.put(rank, 1);
            }
	    
        }

        int strength = 0;

	//find the character with the biggest value among pairs of value.
	//like for example we used AC AD AH AS KD as input
	//we'd compare AC AD AH AS or 4 to KD or 1
        for (int value : hs.values()) {
            if (value > strength) {
                strength = value;
            }
        }

        System.out.println(strength);
    }
}

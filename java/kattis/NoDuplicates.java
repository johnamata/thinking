import java.util.Scanner;
import java.util.HashSet;

public class NoDuplicates{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String input = scanInput.nextLine();
	String[] words = input.split(" ");
	
	HashSet<String> hs = new HashSet<String>();
	
	for(int i = 0; i < words.length; i++){
	    if(hs.contains(words[i])){
		    System.out.println("no");
		    return;
		}else{
		    hs.add(words[i]);
		}
	}
	System.out.println("yes");
    }
}

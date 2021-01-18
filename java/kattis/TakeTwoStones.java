import java.util.Scanner;

public class TakeTwoStones{
    public static void main(String[]args){
	Scanner scanInput = new Scanner (System.in);
	int input = scanInput.nextInt();
	if(input%2 == 0){ //check even
	    System.out.println("Bob");
	} else {
	    System.out.println("Alice"); //check odd
	}
    }
}

import java.util.Scanner;

public class JudgingMoose {
    /**
https://open.kattis.com/problems/judgingmoose
    */
    public static void main (String[]args){
	Scanner scanInput = new Scanner(System.in);
	int l = scanInput.nextInt();
	int r = scanInput.nextInt();
	if(l == 0 && r == 0){
	    System.out.println("Not a moose");
	} else if( l == r){
	    System.out.println("Even" + " " + (l + r));
	    
	} else {
	    System.out.println("Odd" + " " + (Math.max(l,r) + Math.max(l,r)));
	}
    }
}
	

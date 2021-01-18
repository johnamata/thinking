import java.util.Scanner;
//24 hour time notation, output time 45 mins before input
public class Spavanac{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int H = scanInput.nextInt();
	int M = scanInput.nextInt();

	if(M < 45){
	    H = (H+23) % 24;
	}
	
	M = (M+15) % 60;

	System.out.println(H + " " + M);
    }
}

import java.util.Scanner;

public class Halloween{
    public static void main(String[]args){
	Scanner scanInput = new Scanner (System.in);
	String input = scanInput.nextLine();

	if (input.equals("OCT 31") || input.equals("DEC 25"))
	    System.out.println("yup");
	else
	    System.out.println("nope");
	
    }
}

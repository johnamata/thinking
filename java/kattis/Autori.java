import java.util.Scanner;

public class Autori{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String input = scanInput.next();
	System.out.print(input.charAt(0)); //print first letter
	for (int i = 0; i < input.length(); i++){
	    char pointer = input.charAt(i);//pointer, we move by char
	    if(pointer == '-'){ //find hyphen through pointer iteration
		//notice that we used single quote, because char
		System.out.print(input.charAt(i+1));
		//print letter after pointer traverses hyphen
	    }
	}
    }
}

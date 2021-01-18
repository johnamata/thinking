import java.util.Scanner;

public class TripleTexting{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	String input = scanInput.nextLine(); 
	//sample input: hellohrllohello
        int length = input.length() / 3;
	/*
	  divide by 3 because according to the input description:
	  "It is guaranteed that this string is the result of a word being written three times, where possibly one letter was changed to some other letter."
	 */
        //from our sample input of "hellohrllohello", length =  5
        String a_pattern = input.substring(0, length);
	//a_pattern = hello
        String b_pattern = input.substring(length, length * 2);
	//b_pattern = hrllo
        String c_pattern = input.substring(length * 2, length * 3);
	//c_pattern = hello

        if (a_pattern.equals(b_pattern) || a_pattern.equals(c_pattern)) {
	    //if hello equals hrllo or hello
            System.out.println(a_pattern);
	    //thus, we printed hello
        } else {
            System.out.println(b_pattern);
	}
    }
}

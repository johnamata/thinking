import java.util.Scanner;
import java.lang.Math;

public class Planina{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int input = scanInput.nextInt();
	//Math.pow(number,exponent)
	System.out.println((int)Math.pow((Math.pow(2,input)+1), 2));
	//we do (int) because Math.pow returns double
    }
}

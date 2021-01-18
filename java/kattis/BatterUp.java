import java.util.Scanner;

/**
https://open.kattis.com/problems/batterup
*/

public class BatterUp{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int n = scanInput.nextInt();
	double a = 0;
	double b = 0;
	for(int i = 0; i < n; i++) {
	    double atBat = scanInput.nextDouble();
	    if(atBat != -1) {
		b++;
		a += atBat;
	    }
	}
	System.out.print(a/b);
    }
}
				 

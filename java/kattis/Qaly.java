import java.util.Scanner;
/*
The QALY for each period in which the quality of life is constant is simply the product of the quality of life and the length of the period (in years).
 */
public class Qaly{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int N = scanInput.nextInt();
	double qaly = 0;
	for (int i = 0; i < N; i++){
	    double q = scanInput.nextDouble();
	    double y = scanInput.nextDouble();
	    qaly += (q * y);
	}
	System.out.println(qaly);
    }
}
					  

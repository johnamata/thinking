import java.util.*;
public class QALY{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 0;
	double qaly = 0;
	while (i < n){
	    double quality = sc.nextDouble();
	    double years = sc.nextDouble();
	    qaly += quality * years;
	    i++;
	}
	System.out.println(qaly);
    }
}


import java.util.*;
import java.io.*;
import java.math.*;

public class WeirdAlgorithm{
    public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	//one of the test cases has a value > java's int
	long n = sc.nextLong();
	System.out.print(n);
	while(n < 0 || n > 1){
	    if (n%2 == 0)
		n /= 2;
	    else
		n = n*3 + 1;
	    System.out.print(" " + n);
	}
    }
}

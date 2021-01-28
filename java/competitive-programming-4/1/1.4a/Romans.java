//https://open.kattis.com/problems/romans

import java.util.*;

public class Romans{
    public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	double n = sc.nextDouble();
	//need to cast it as double as division between 2 ints will return int in java even though if we initialized a variable for it to be double
	System.out.println(Math.round(n * (double) 1000 * 5280/4854));
	//alternatively, from doing (double) casting, just add .0 in the end of a number, in the case below, 4854
	//System.out.println(Math.round(n * 1000 * 5280/4854.0));
    }
}

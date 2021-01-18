//https://open.kattis.com/problems/electricaloutlets

import java.util.*;

public class ElectricalOutlets{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
	int N = sc.nextInt();
	/*
	  steps
	  gather test cases - checked
	  gather how many strips var stotal
	  make a loop of strips var strips
	  subtract from (stotal - 1)
	*/
	for(int i = 0; i < N; i++){
	    int stotal = sc.nextInt();
	    System.out.println(compute(stotal));
	}
    }
    public static int compute (int x){
	int total = 0;
	for(int i = 0; i < x; i++){
	    int strips = sc.nextInt();
	    total += strips;
	}
	total += (-(x) + 1);
	return total;
    }
}

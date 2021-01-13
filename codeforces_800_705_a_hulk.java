import java.util.*;

public class codeforces_800_705_a_hulk{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i = 0; i < n; i++){
	    if(i > 0){
		System.out.print("that ");
	    }
	    //modulo operator or % in java outputs the remainder
	    //i need to note that modulo works for ZERO, and doing 0 (%mod) any number returns zero, i got a bit confused there
	    //also note that using modulo doesnt CARE IF THE DIVIDEND IS LOWER, it'll just take the remainder of anything and make it positive, as it returns the absolute value. For example 300 (%mod) 200 will return 100, 1%2 will return 1
	    if(i%2 == 0){
		System.out.print("I hate ");
	    } else {
		System.out.print("I love ");
	    }
	}
	System.out.print(" it");
    }
}

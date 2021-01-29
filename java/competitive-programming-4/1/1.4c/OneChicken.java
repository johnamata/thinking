import java.util.*;

public class OneChicken{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int diff = M-N;
	int P, Q, chicken;
	if(diff == 1){
	    System.out.println("Dr. Chaz will have " + Math.abs(diff) + " piece of chicken left over!");
	} else if (diff > 0) {
	    System.out.println("Dr. Chaz will have " + Math.abs(diff) + " pieces of chicken left over!");

	} else if (diff == -1){
	    System.out.println("Dr. Chaz needs " + Math.abs(diff) + " more piece of chicken!");	    
	} else {
	    System.out.println("Dr. Chaz needs " + Math.abs(diff) + " more pieces of chicken!");
	}
    }
}

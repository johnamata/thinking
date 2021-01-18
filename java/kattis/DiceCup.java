import java.util.Scanner;

/**
https://open.kattis.com/problems/dicecup
*/
public class DiceCup{
    public static void main(String[]args){
	Scanner scanInput = new Scanner (System.in);
	int N = scanInput.nextInt();
	int M = scanInput.nextInt();
	//go for the most frequent one
	if(N<=M){
	    for(int i = N+1; i <= M+1; i++){
		System.out.println(i);
	    }
	} else {
	    for(int i = M+1; i<= N+1; i++){
		System.out.println(i);
	    }
	}
    }
}

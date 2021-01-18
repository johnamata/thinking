import java.util.Scanner;

/**
https://open.kattis.com/problems/zamka
*/

public class Zamka{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int L = scanInput.nextInt();
	int D = scanInput.nextInt();
	int X = scanInput.nextInt();
	int N = 0; // L < N < D and the sum of its digits is X
	int M = 0; // L < M < D and the sum of its digits is X

	/*
i hate this challenge, brute forcy and mathy
first thing i thought of was some if-else crap
then later i realized i misunderstood the problem.
for sum reason i thought "sum of its digits" as sum of some of 2 different numbers
and not for example given the ff inputs: L = 1, D = 100, X = 4
the answer should be N=4, and M=40

M = 40 because it's in the middle of L and D, and the digits (4 and 0) and up to X.

this shouldve been obvious
i need to get better at understanding english problem descriptions

	*/

	//calculate N
	for (int i = L; i <= D; i++) {
	    if (sum(i) == X) {
		N = i;
		break; //important
	    }
	}

	//and then to calculate M
	for (int i = D; i >= L; i--) {
	    if (sum(i) == X) {
		M = i;
		break;
	    }
	}
	System.out.println(N);
	System.out.println(M);
    }
    
    //check sum of digits
    static int sum(int num) {
	int sum = 0;
	while (num > 0) {
	    //following is a nice trick to do get each digit of a number
	    //i think i also used this one in earlier kattis problems i solved
	    sum += num%10;
	    num /= 10;
	}
	return sum;
    }
}

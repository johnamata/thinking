import java.util.Scanner;
import java.util.Arrays;

/**
https://open.kattis.com/problems/bijele
*/

public class Bijele{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int[] correct = {1,1,2,2,2,8};
	int[] arrayInput = new int[6];
	int[] answer = new int[6];
	//todo: populate then
	//find a way to compare and get  differences between arrays
	for (int i = 0; i < arrayInput.length; i++){
	    arrayInput[i] = scanInput.nextInt();
	}

	for(int i = 0; i < answer.length; i++){
	    answer[i] = correct[i] - arrayInput[i];
	}
	//System.out.println(Arrays.toString(arrayInput));
	// Kattis didnt accept the following line of code's formatting:
	// System.out.println(Arrays.toString(answer));
	// so but it did worked for manually printing it
	for(int i = 0; i < answer.length; i++){
	    System.out.print(answer[i] + " ");
	}
	
    }
}

import java.util.Scanner;

/**
https://open.kattis.com/problems/pet
*/
public class Pet{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int winner = 0;
	int position = 1;
	int[] sum = new int[5];

	for (int i = 0; i < 5; i++){
	    int g1 = scanInput.nextInt();
	    int g2 = scanInput.nextInt();
	    int g3 = scanInput.nextInt();
	    int g4 = scanInput.nextInt();
	    sum[i] = g1+g2+g3+g4;
	}
	
	for(int i = 0; i < sum.length; i++){
	    if(sum[i] > winner){
		winner = sum[i];
		position = i + 1;
	    }
	}
	
	System.out.println(position + " " + winner);
	
    }
}

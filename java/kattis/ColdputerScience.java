import java.util.Scanner;

public class ColdputerScience{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int n = scanInput.nextInt();
	int counter = 0;
	for(int i=0; i<n; i++){
	    int n_temp = scanInput.nextInt();
	    if(n_temp < 0){
		counter++;
		    }
	}
	System.out.println(counter);
    }
}
	

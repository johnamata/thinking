import java.util.Scanner;

public class TimeLoop{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int n = scanInput.nextInt();
	for(int i = 1; i < n+1; i++){
	    System.out.println(i+" "+"Abracadabra");
	}
    }
}

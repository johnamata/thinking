import java.util.*;

public class Tarifa{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int n = sc.nextInt();
	int sum = 0;
	for(int i = 0; i < n; i++){
	    sum += sc.nextInt();
	}
	System.out.println(x + ((n * x) - sum));	
    }
}

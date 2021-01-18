import java.util.Scanner;

public class Ladder{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int h = scanInput.nextInt();
	int v = scanInput.nextInt();
	int ans = (int)Math.ceil(h / Math.sin(Math.toRadians(v)));
	System.out.println(ans);	    
    }
}

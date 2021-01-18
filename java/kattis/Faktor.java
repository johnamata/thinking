import java.util.Scanner;

public class Faktor{
    public static void main(String[]args){
	Scanner scanInput = new Scanner(System.in);
	int a = scanInput.nextInt();
	//impact factor owners require
	int i = scanInput.nextInt();
	//number of articles you plan to publish
	
	i -=1; //by subtracting 1 from the impact factor needed and then 
	// multiplying by the articles published and then adding one, 
        // we get the bare minimum of scientists needed to be bribed.
	System.out.println(a * i + 1);
	
	//alternatively we could do all of that in one line
	//System.out.println((i-1)*a+1);
    }
}

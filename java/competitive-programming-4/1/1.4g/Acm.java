import java.util.*;

public class Acm{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int time = 0;
	int correct = 0;
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    sc.next();
	    int str = sc.next();
	    if (str.equals("right")){
		correct++;
	    }
	}
    }
}

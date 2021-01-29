import java.util.*;
public class Different{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	//read until EOF
	while (sc.hasNext()){
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    System.out.println(Math.abs(a - b));
	}
    }
}

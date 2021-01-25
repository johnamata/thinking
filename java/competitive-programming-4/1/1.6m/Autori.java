import java.util.*;

public class Autori{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();	
	System.out.print(s.charAt(0));
	String ans = "";
	int i = 0;

	//.length() and .length are different
	//.length are for arrays
	//.length() are for Strings
	while(i < s.length()){
	    if(s.charAt(i) == '-'){
		ans += s.charAt(i+1);
	    }
	    i++;
	}
	System.out.print(ans);
    }
}

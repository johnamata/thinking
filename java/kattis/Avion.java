import java.util.Scanner;
import java.util.HashSet;

public class Avion{
    public static void main(String []args){
	Scanner sc =  new Scanner(System.in);
	HashSet<Integer> hs = new HashSet<Integer>();
	for (int i = 0; i < 5; i++)
	    {
		String s = sc.next();
		if(s.matches("(.*)FBI(.*)")){
		    hs.add(i+1);
		}
	    }
	if (hs.isEmpty()){
	    System.out.println("HE GOT AWAY!");
	} else {
	    for(int count : hs){
		System.out.println(count + " ");
	    }
	}
    }
}

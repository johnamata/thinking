import java.util.Scanner;
import java.util.HashSet;

public class NoDup{
    public static void main ( String[] args ) {
	Scanner in = new Scanner( System.in );
	//split the string based on spaces, store every word in a string array
	String[] s = in.nextLine().split(" ");
	//remember that hashset doesnt have duplicates
	HashSet<String> hs = new HashSet<String>();
	for (int i=0; i<s.length; ++i) {
	    //we iterate throughout the string array comparing it to the contents of the hashset
	    if (hs.contains( s[i] )) {
		//intersection of string array and contents of hashset means weve found duplicate
		System.out.println( "no" );
		//exit the method (main)
		return;
	    }
	    //start filling our hashset
	    else hs.add( s[i] );
	}
	//yes there are no duplicates
	System.out.println( "yes" );
    }
}

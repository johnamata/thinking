import java.util.*;
/**
https://open.kattis.com/problems/everywhere
I've Been Everywhere, Man
 */
public class Everywhere{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){

	int T = sc.nextInt();
	for(int i = 0; i < T; i++){
	    int N = sc.nextInt();
	    solve(N);
	}
    }
    public static void solve(int trips){
	HashSet <String> hs = new HashSet<String>();
	for (int i = 0; i < trips; i++){
	    hs.add(sc.next());
	}
	System.out.println(hs.size());
    }
}

/**

   https://open.kattis.com/problems/chanukah
   Chanukah
*/
import java.util.Scanner;
public class Chanukah{
    public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	int P = sc.nextInt();
	int loop = 0;
	while(loop < P){
	    int K = sc.nextInt();
	    int N = sc.nextInt();
	    int candles = N;
            for (int day = 1; day <= N; day++) {
                candles += day;
            }
	    System.out.println(K + " " + candles);
	    loop++;
	}
    }
}


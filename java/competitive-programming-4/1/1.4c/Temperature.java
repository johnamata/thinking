import java.util.*;


//https://open.kattis.com/problems/temperature
//Time Travelling Temperatures
public class Temperature{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt(); //the point on B where A is zero
	int y = sc.nextInt(); //number of degrees in B that equal a change of a single degree in A
	if(x == 0 && y == 1) {
            System.out.println("ALL GOOD");
        } else if(y == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(x / (-y + 1.0));
        }

    }
}

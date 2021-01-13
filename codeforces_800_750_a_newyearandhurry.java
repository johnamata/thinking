import java.util.*;
//https://codeforces.com/problemset/problem/750/A
public class codeforces_800_750_a_newyearandhurry{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	//it takes 5 * i minutes to solve i-th problem
	int n = sc.nextInt(); //problems
	int k = sc.nextInt(); //minutes to get to party
	//contest starts at 20:00
	//limak needs to get to party by midnight
	int time = 240 - k; //current time left in minutes
	int problemSolved = 0; //counter for solved problems
	//go through problems
	for (int problemNumber = 1; problemNumber <= n; problemNumber++) {
	    //check if given problem will take less time than the current time left
	    if ((5 * problemNumber) <= time) {
		//subtract minutes to solve problem from current time left
		time -= 5 * problemNumber;
		//count solved problems
		problemSolved++;
	    }
	}
	System.out.println(problemSolved);
    }
}

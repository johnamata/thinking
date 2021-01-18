import java.util.Scanner;
import java.util.HashSet;

public class Modulo{
    /**
https://open.kattis.com/problems/modulo
     */
    public static void main(String[]args){
	//got confused with the question a bit
	//this one in particular: "outputs the number of distinct numbers in the input, if the numbers are considered modulo 42"
	//initially i used arrays then just count those that dont return 0 with modulo, thinking that those are the distinct
	//i later learned that i have to modulo first then count the distinct results from these. by distinct, we mean ignore those that have duplicates, just count the original. like for example in the following array full of 5 zeroes [0,0,0,0,0] we only count 1 distinct.
	//i need to work on my english comprehension
	Scanner scanInput = new Scanner(System.in);
	int[] arr = new int[10];
	
	HashSet<Integer> distinct =  new HashSet<Integer>();
	for(int i = 0; i< 10; i++){
	    distinct.add(scanInput.nextInt()%42);
	}
	System.out.println(distinct.size());
    }
}

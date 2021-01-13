import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        sc.nextLine(); //because nextInt() only reads an integer input and thus a newline \n is left that needs to be taken care of
        for(int i = 0; i < in; i++){
            String s = sc.nextLine();
            char[] charArr = s.toCharArray();            
            solve(charArr);
        }
    }
    private static void solve(char arr[]){
        //even
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                System.out.print(arr[i]);
            }
        }
        System.out.print(" ");
        //odd
        for(int i = 0; i < arr.length; i++){
            if(i%2 != 0){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
}

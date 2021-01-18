//https://open.kattis.com/problems/harshadnumbers

import java.util.*;
public class HarshadNumbers{
    public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int temp = n;
	int sum = 0;
	/*
x 1. get the input
2. get digits of the number
3. sum the digits together
4. divide the sum to the input
5. check if it's divisible
6. if it is, then it's harshad
	 */

	while (temp != 0) {
			sum = sum + (temp % 10);
			temp /= 10;
		}
	
	while (n%sum != 0){
	    n++;
	    temp = n;
	    while (temp % 10 == 0 && temp != 0) {
		sum -= 9;
		temp /= 10;
	    }
	    sum++;
	}
	System.out.println(n);
    }
}

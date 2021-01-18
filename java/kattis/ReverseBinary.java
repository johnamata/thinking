/**
   https://open.kattis.com/problems/reversebinary
   Reversed Binary Numbers
*/

import java.util.Scanner;
public class ReverseBinary{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();

	//get string builder since it has builtin reverse method and i'm too lazy to reverse strings manually with loopy char array
	StringBuilder sb = new StringBuilder();
	
	//convert decimal input to binary
	String binary =Integer.toBinaryString(N);
	
	//reverse binary digits, note first that we put append our string first to our stringbuilder. later we convert our resulting stringbuilder object to string
	String reversed = sb.append(binary).reverse().toString();
	
	//convert that back to decimal with Integer.parseString()
	int ans = Integer.parseInt(reversed,2);
	System.out.println(ans);
    }
}

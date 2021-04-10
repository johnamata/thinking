/**
   https://open.kattis.com/problems/cetiri
*/
import java.util.*;
public class Cetiri{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int[] nums = new int[3];
	//read input 
	for(int i = 0; i < nums.length; i++)
	    nums[i] = sc.nextInt();
	//sort it first so we can find difference easier
	Arrays.sort(nums);
	//find difference between the given digits
	int differenceA = nums[1] - nums[0];
	int differenceB = nums[2] - nums[1];
	if (differenceA == differenceB)
	    System.out.println(nums[2] + differenceB);
	else if (differenceA < differenceB) 
	    System.out.println(nums[1] + differenceB/2);
	else
	    System.out.println(nums[0] + differenceA/2);	
    }
}

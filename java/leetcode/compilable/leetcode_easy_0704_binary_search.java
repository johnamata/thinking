//https://leetcode.com/explore/learn/card/binary-search/138/background/1038/

import java.util.*;
public class leetcode_easy_0704_binary_search{
    /*
leetcode note from https://leetcode.com/explore/learn/card/binary-search/138/background/971/:

In its simplest form, Binary Search operates on a contiguous sequence with a specified left and right index. This is called the Search Space. Binary Search maintains the left, right, and middle indicies of the search space and compares the search target or applies the search condition to the middle value of the collection; if the condition is unsatisfied or values unequal, the half in which the target cannot lie is eliminated and the search continues on the remaining half until it is successful. If the search ends with an empty half, the condition cannot be fulfilled and target is not found.
     */
    public static int search(int[] nums, int target) {
	/*
here, I just followed the algorithm procedure at the wikipedia article for binary search and just translasted it to java: https://en.wikipedia.org/wiki/Binary_search_algorithm#Procedure
	 */
	//just going to comment the steps from wikipedia here
	//A = array
	//n = number of elements in array
	//T = target value
	//Step 1: Set L to 0 and R to n - 1
	int L = 0;
	int R = nums.length-1;
	//Step 2: if L > R, the search terminates as unsucessful
	while (L <= R){
	    //Step 3: set m (the position of the middle element) to the floor of (L + R)/2
	    int midpoint = Math.floorDiv((L + R), 2);
	    //Step 4: If A[m] < T, set L to m + 1 and go to step 2
	    if(nums[midpoint] < target){
		L = midpoint + 1;
	    }
	    //Step 5: if A[m] > T, set R to m - 1 and go to step 2
	    else if (nums[midpoint] >= target){
		R = midpoint - 1;
	    }
	    //Step 6: Now A[m] = T, the search is done, return m
	    if (nums[midpoint] == target) return midpoint;   
	}
	return -1;
    }
    /*
linear but it accepts
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
     */
    public static void main(String[]args){
	int[] arr = {-1,0,3,5,9,12};
	int targetInput = 9;
	//answer should be 4
	System.out.println(search(arr, targetInput));
    }
}
	

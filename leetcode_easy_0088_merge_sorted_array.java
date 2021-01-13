import java.util.*;
public class leetcode_easy_0088_merge_sorted_array{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	//sample input:
        //nums1 = {1,2,3,0,0,0};
        //nums2 = {2,5,6};
        //m = 3;
        //n = 3;

        //we have 3 pointers
        int i = m - 1; //start at the end of nums1 or in our input for nums1 is the 3rd element, the one before 0
        //the 0s in nums1, right after 3 or index 2 in our given, are there just for the space to hold additional elements, was confused a bit when I saw it first

        int j = n - 1;  //start at the end of nums2
        int k = m + n - 1; //start from last element in nums1.
        //we do m+n so we have enough space to hold additional elements from nums2

        //merging
        while(i >=0 && j>=0) {
            //iterate, moving from right to left, finding the largest for each array, nums1 and nums2
            if(nums1[i] > nums2[j]) {
                //if pointer in nums1 is bigger than pointer in nums2, put the bigger element in nums1
                nums1[k] = nums1[i];
                i--;
            } else {
                //else do the opposite
                nums1[k] = nums2[j];
                j--;
                /*
		  example
		  suppose from our sample input: nums1 is {1,3,3,0,0,0} , nums2 is {2,5,6}, m = 3, n = 3
		  i=2 because m-1 , j=2 because m-1 , k=5 because m+n-1
		  nums1[i] > nums2[j] is false (because nums1[i] is 3 and nums2[j] is 6)
		  thus nums1[k] = nums2[j];
		  nums1 now becomes {1,3,3,0,0,6}
		*/
            }
            k--;
        }
        // if any left from nums2, pass over the remaining to nums1
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    //ignore this, just for testing
    public static void main(String[] args){
        int[] nums1 = {1,3,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]);
        }
        //we printed: 123356

        System.out.println();

        //for each loop version
        //i just did this one to remind myself to use this often instead of the traditional loop
        for(int i:nums1){
            System.out.print(i);
        }
    }
}

/*
https://leetcode.com/problems/max-consecutive-ones/

THINK ABOUT
- when to start counting and when to end it
- how to get the max: have a current count variable that we can compare to the last max
- the input: only 1s and 2s

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            //find the first 1
            if(nums[i] == 1){
                //start counting every 1 after the first one
                current++;
                //update our max count of 1s
                if(current > max)
                    max = current;
                //ALTERNATIVELY WE COULD JUST DO:
                //max = Math.max(max, current);
            } else {
                //reset once we stop seeing 1s
                current = 0;
            }
        }
        return max;
    }
}

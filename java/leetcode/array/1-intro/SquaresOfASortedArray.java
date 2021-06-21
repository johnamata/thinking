class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
        THINKING
        loop through
        square
        then sort
        return the sort
        */
        for (int i = 0; i < nums.length; i++){
            //alternatively: 
            //nums[i] = nums[i] * nums[i];
            nums[i] = (int) Math.pow((double) nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}

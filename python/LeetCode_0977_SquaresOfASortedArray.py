# https://leetcode.com/problems/squares-of-a-sorted-array/
# type: array
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        """
        todo
        - loop through and iterate nums[i] squaring everything
        - then sort
        """
        for i in range(len(nums)):
            nums[i] = nums[i] * nums[i]
        nums.sort()
        return nums
        

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        maxNum = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
                if count > maxNum:
                    maxNum = count
            else:
                count = 0
        return maxNum

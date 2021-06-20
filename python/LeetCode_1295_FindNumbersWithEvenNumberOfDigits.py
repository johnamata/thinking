# https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        """
        todo
        - find way to iterate/loop with i through input array nums[]
        - find way to get the digits of nums[i]
            - this probably means doing the mathy %10 thingy, i need to google it
            - or i could probably convert it first to string then do length(), not sure if i need to do that in python though
        - if-else to check if even or not, then have a variable to track the amount
        """
        even = 0
        for i in range(len(nums)):
            if(len(str(nums[i]))%2 == 0):
                even += 1
        return even

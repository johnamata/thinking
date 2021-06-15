/*
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

THINK ABOUT

- looping the array
- how to get the digits of a number for each element in array: a good formula is nums[i]%10 or something like that, but it probably will lose some edge cases. Easiest way to solve it is by converting it to string and getting the length of it. 
- formula for finding even: number % 2 == 0

I used String.valueOf() as "123".toString() wont work with primitive ints and needs a wrapper, Integer, see:

- https://www.educative.io/edpresso/how-to-convert-an-integer-to-a-string-in-java
*/

class Solution {
    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        int getDigits = 0;
        for (int i = 0; i < nums.length; i++){
            getDigits = String.valueOf(nums[i]).length();
	    //alternatively, this also works, using logarithms
	    //getDigits = (int)(Math.log10(nums[i])+1);
            if (getDigits % 2 == 0)
                evenDigits++;
        }
        return evenDigits;
    }

getDigits = String.valueOf(nums[i]).length();
if (getDigits % 2 == 0)
    evenDigits++;

}

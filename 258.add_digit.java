
class Solution {

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;

    }
}


 //The Digital Root Trick:
//The digital root of a number is the result of repeatedly summing the digits of the number until only one digit remains.

//There’s a mathematical formula for digital root in base 10:

//📌 Formula:

//digital_root(num) = 1 + (num - 1) % 9

//In base 10, any number num is congruent to the sum of its digits modulo 9.
//This comes from number theory and modular arithmetic.

//So:

//num % 9 gives the same result as repeatedly summing its digits.

//But with one edge case:

//When num == 0, digital root is 0.

//For all other numbers: 1 + (num - 1) % 9 gives correct result.

//Sum of digits: 3 + 8 + 5 = 16 → 1 + 6 = 7

//Now, 385 % 9 = 7
//✅ Same as the digital root.

class Solution {

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            i--;
        }
        if (i >= 0) {
            digits[i]++;
            Arrays.fill(digits, i + 1, digits.length, 0);
            return digits;
        }
        int arr[] = new int[digits.length + 1];
        arr[0] = 1;
        Arrays.fill(arr, 1, digits.length + 1, 0);
        return arr;
    }
}
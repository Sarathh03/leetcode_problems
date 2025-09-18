class Solution {
    public boolean reorderedPowerOf2(int n) {
        // Get the sorted digit representation of the input number n
        String countn = digitcount(n);

        // Check all powers of 2 from 2^0 up to 2^29 (highest power of 2 that fits in int range)
        for (int i = 0; i < 30; i++) {
            int power_2 = 1 << i; // Compute 2^i using bitwise left shift

            // Compare the sorted digits of current power of 2 with sorted digits of n
            if (digitcount(power_2).equals(countn)) {
                return true; // Found a match → n can be reordered to form this power of 2
            }
        }

        // If no matching power of 2 found, return false
        return false;
    }

    // Helper method to get sorted digits of a number as a string
    private String digitcount(int n) {
        char[] arr = String.valueOf(n).toCharArray(); // Convert number to char array
        java.util.Arrays.sort(arr); // Sort digits in ascending order
        return new String(arr); // Return sorted string
    }
}

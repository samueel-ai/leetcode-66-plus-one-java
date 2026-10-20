import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        return processDigit(digits, digits.length - 1);
    }
    
    private int[] processDigit(int[] digits, int index) {
        // Base case: All digits were 9 (e.g., [9, 9] -> [1, 0, 0])
        if (index < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        
        // If digit < 9, add 1 and return
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        
        // If digit is 9, change to 0 and pass carry to the left
        digits[index] = 0;
        return processDigit(digits, index - 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Output: " + Arrays.toString(sol.plusOne(new int[]{1, 2, 3})));
        System.out.println("Output: " + Arrays.toString(sol.plusOne(new int[]{9, 9})));
    }
}
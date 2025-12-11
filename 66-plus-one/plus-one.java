class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // agar last digit 9 nahi hai, bas +1 karo aur return kar do
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // agar digit 9 hai → 0 banado, carry aage jayega
            digits[i] = 0;
        }

        // agar pura number 999..999 tha, new array banani padegi
        int[] ans = new int[digits.length + 1];
        ans[0] = 1; // example: 999 + 1 = 1000
        return ans;
    }
}

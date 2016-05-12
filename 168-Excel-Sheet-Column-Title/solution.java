public class Solution {
    public String convertToTitle(int n) {
        String solution = "";
        double alphabet_count = (1/26);
        int number_conversion;
        while(n > 26)
        {
            number_conversion = (int) (Math.pow(n , alphabet_count));
            solution += (char) (number_conversion + 64);
            n -= Math.pow(26 , number_conversion);
        }
        solution += (char) (n + 64);
        
        return solution;
    }
}
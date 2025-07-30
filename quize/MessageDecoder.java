public class MessageDecoder {    

    // Method to decode the message and return the number of ways
    public static int decodeMessage(String seq) {    
        int MOD = 1000000007;  // Modulo value

        // Base case: agar string empty ho ya invalid ho
        if (seq == null || seq.length() == 0) return 0;

        // Previous 2 values ko store karne ke liye variables
        int prev2 = 1;  // dp[0] = 1 (empty string ka ek tareeka hota hai)
        int prev1 = 0;  // dp[1] = 0 (ek character wale string ka koi valid decoding nahi hai)

        // Loop chalate hain string ke har character pe
        for (int i = 1; i <= seq.length(); i++) {
            int current = 0;

            // Agar current digit valid hai (1 se 9 ke beech)
            if (seq.charAt(i - 1) >= '1' && seq.charAt(i - 1) <= '9') {
                current = (current + prev2) % MOD;
            }

            // Agar last 2 digits valid hain (10 se 26 ke beech)
            if (i > 1) {
                int twoDigit = Integer.parseInt(seq.substring(i - 2, i));
                if (twoDigit >= 10 && twoDigit <= 26) {
                    current = (current + prev1) % MOD;
                }
            }

            // Update previous results
            prev1 = prev2;
            prev2 = current;
        }

        // Result final prev2 mein hota hai
        return prev2;
    }

    public static void main(String[] args) {
        // Test case
        System.out.println(MessageDecoder.decodeMessage("12354"));
    }
}

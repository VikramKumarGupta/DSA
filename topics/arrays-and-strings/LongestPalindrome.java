public String longestPalindrome(String s) {
        if (s == null || s.length() < 2)
            return s;

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // Find odd and even palindrome lengths
            int odd = expand(s, i, i);
            int even = expand(s, i, i + 1);

            // Select longer length
            int len = Math.max(odd, even);

            // Update only when a longer palindrome exists
            if (len > end - start + 1) {
                // Calculate inclusive boundaries
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Java substring end is exclusive
        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {

        // Keep expanding while characters match
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Return length of last valid palindrome
        return right - left - 1;
    }

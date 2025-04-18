class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";  // Base case

        String result = "1";  // Starting value for n=1

        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            char prevChar = result.charAt(0);

            // Go through the string starting from second character
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == prevChar) {
                    count++; // same as previous character
                } else {
                    current.append(count).append(prevChar); // say count and char
                    count = 1;
                    prevChar = result.charAt(j); // move to next char
                }
            }

            // Append the last group
            current.append(count).append(prevChar);
            result = current.toString();
        }

        return result;
    }
}

import java.util.*;
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            
            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println(ls.lengthOfLongestSubstring(str)); 
    }
}

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Frequency of pattern p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        // First window initialization
        for (int i = 0; i < window; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = window; i < s.length(); i++) {

            // Add new char in window
            sCount[s.charAt(i) - 'a']++;

            // Remove old char
            sCount[s.charAt(i - window) - 'a']--;

            // Check match
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
}

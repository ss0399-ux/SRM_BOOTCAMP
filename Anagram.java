class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i< freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}

    
    //using ascii values
    //in first string, whenever we see a character increment by 1 
    // second string decrement it by 1 
    // at the very end, if it becomes zero, the given string is anagram.
    //else if it contains +1 or -1, then the given string is not anagram.

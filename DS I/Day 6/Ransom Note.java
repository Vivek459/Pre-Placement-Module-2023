class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        for (int i = 0; i < mLen; i++) {
            char ch = magazine.charAt(i);
            int count = counts.getOrDefault(ch, 0) + 1;
            counts.put(ch, count);
        }
        for (int i = 0; i < rLen; i++) {
            char ch = ransomNote.charAt(i);
            int count = counts.getOrDefault(ch, 0) - 1;
            if (count < 0) {
                return false;
            }
            counts.put(ch, count);
        }
        return true;
        
    }
}
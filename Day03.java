class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> l = new ArrayList<Character>();
        int i;
        for(i=0; i<magazine.length(); i++)
            l.add(magazine.charAt(i));
        for(i=0; i<ransomNote.length(); i++)
            if(l.indexOf(ransomNote.charAt(i))>-1)
                l.remove(l.indexOf(ransomNote.charAt(i)));
            else
                return false;
        return true;
    }
}

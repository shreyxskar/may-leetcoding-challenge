class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<Integer>();
        if(p.length() > s.length())
            return l;
        int i, j;        
        int ss[] = new int[26];
        int pp[] = new int[26];
        for(i=0; i<p.length(); i++)
            pp[p.charAt(i)-'a']++;
        for(j=0; j<s.length(); j++){
            ss[s.charAt(j)-'a']++;
            if(j >= p.length())
                ss[s.charAt(j-p.length())-'a']--;
            if(Arrays.equals(ss, pp))
                l.add(j-p.length()+1);
        }
        return l;
    } 
}

class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0, i;
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(i=0; i<S.length(); i++)
            if(mp.containsKey(S.charAt(i))){
                int k = mp.get(S.charAt(i));
                mp.replace(S.charAt(i), k+1);
            }
            else
                mp.put(S.charAt(i), 1);
        for(i=0; i<J.length();i++)
            if(mp.containsKey(J.charAt(i)))
                res += mp.get(J.charAt(i));
        return res;
    }
}

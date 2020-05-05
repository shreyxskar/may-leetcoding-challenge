class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        int i = 0, idx = -1;
        for( ; i<s.length(); i++)
            arr[s.charAt(i)-'a']++;          
        for(i=0; i<s.length(); i++){            
            if(arr[s.charAt(i)-'a']==1){
                idx = i;
                break;
            }
        }
        return idx;
    }
}

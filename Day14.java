class Trie {

    /** Initialize your data structure here. */
    Trie c[];
    boolean isEnd;
    public Trie() {
        isEnd = false;
        c = new Trie[26];
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie curr = this;
        for(char ch: word.toCharArray()){
            if(curr.c[ch-'a'] == null)
                curr.c[ch-'a'] = new Trie();
            curr = curr.c[ch-'a'];
        }      
        curr.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie curr = this;
        for(char ch: word.toCharArray()){
            if(curr.c[ch-'a'] == null)
                return false;
            curr = curr.c[ch-'a'];
        }
        return curr.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(char ch: prefix.toCharArray()){
            if(curr.c[ch-'a'] == null)
                return false;
            curr = curr.c[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

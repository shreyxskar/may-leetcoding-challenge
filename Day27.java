class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int visit[] = new int[N];
        ArrayList<Integer> al[] = new ArrayList[N];
        Arrays.fill(visit, -1);
        int i;
        for(i = 0; i < N; i++)
            al[i] = new ArrayList<>();
        for(int p[]: dislikes){
            al[p[0]-1].add(p[1]-1);
            al[p[1]-1].add(p[0]-1);
        }
        
        for(i = 0; i < N; i++){
            if(visit[i] == -1 && !dfs(al, visit, i, 0))
                return false;
        }
        return true;
    }
    boolean dfs(ArrayList<Integer>[] al, int visit[], int i, int val){
        if(visit[i] == -1)
            visit[i] = val;
        else
            return visit[i] == val;
        for(int n: al[i]){
            if(!dfs(al, visit, n, 1-val))
                return false;
        }
        return true;
    }
}

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {        
        int visited[] = new int[numCourses];
        ArrayList<Integer> adj[] = new ArrayList[numCourses];
        int i;
        for(i = 0; i < numCourses; i++)
            adj[i] = new ArrayList();
        
        for(int p[]: prerequisites)
            adj[p[0]].add(p[1]);
        
        for(i = 0; i < numCourses; i++)
            if(visited[i] == 0 && !dfs(adj, visited, i))
                return false;
        return true;
    }
    boolean dfs(ArrayList<Integer> adj[], int visited[], int v){
        if(visited[v] == 1)
            return false;
        visited[v] = 1;
        for(int p : adj[v])
            if(!dfs(adj, visited, p))
                return false;
        visited[v] = 2;
        return true;
    }
}

class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length == 0)
            return 1;
        int arr[] = new int[N];
        int i, idx = -1, max = -1;
        for(i = 0; i < trust.length; i++){
            arr[trust[i][1]-1]++;
            if(max < arr[trust[i][1]-1]){
                max = arr[trust[i][1]-1];
                idx = trust[i][1]-1;
            }
        }
        if(idx == -1)
            return idx;
        for(i = 0; i < trust.length; i++){
            if(idx == trust[i][0]-1)
                break;
        }       
        return i == trust.length && arr[idx] == N-1 ? idx+1 : -1;
    }
}

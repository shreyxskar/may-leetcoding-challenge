class Solution {
    public int[] countBits(int num) {
        if(num == 0)
            return new int[]{0};        
        int res[] = new int[num+1];
        res[0] = 0;
        int i;
        for(i = 0; i <= num; i++){
            if(i%2 == 0)
                res[i] = res[i/2];
            else
                res[i] = res[i/2] + 1;
        }
        return res;
    }
}

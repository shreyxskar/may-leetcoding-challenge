class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int i, j, k, max = 0, c = nums[0] == 0 ? -1 : 1;
        hm.put(0, -1);
        hm.put(c, 0);
        for(i = 1; i < nums.length; i++){
            if(nums[i] == 1)
                c++;
            else
                c--;
            if(hm.containsKey(c))
                max = Math.max(max, i - hm.get(c));
            else
                hm.put(c, i);
        }
        //System.out.println(hm.toString());
        return max;
    }    
}

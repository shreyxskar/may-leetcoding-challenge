class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); //key=>element, val=>frequency
        int i;
        for(i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i], 1);//add new key-value pair
            else
                if(hm.get(nums[i]) >= (nums.length>>1)) //return element if its frequency reaches half the length of array
                    return nums[i];
                else
                    hm.replace(nums[i], hm.get(nums[i])+1); //increase frequency by 1                       
        }
        return nums[0]; //if only one element is present
    }
}

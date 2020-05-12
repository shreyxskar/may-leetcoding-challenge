class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int l = 0, h = nums.length - 1, mid;
        while(l < h){
            mid = l + ((h - l)>>1);
            if(mid%2 == 0){
                if(nums[mid] == nums[mid+1])
                    l = mid + 2;
                else if(nums[mid] == nums[mid-1])
                    h = mid -2;
                else 
                    return nums[mid];
            }
            else{
                if(nums[mid] == nums[mid+1])
                    h = mid - 1;
                else if(nums[mid] == nums[mid-1])
                    l = mid + 1;
            }
        }
        return nums[l];
    }
}

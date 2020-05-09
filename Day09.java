class Solution {
    public boolean isPerfectSquare(int num) {  
        if(num == 1) return true;
        if(num == 0 || num%10 == 2 || num%10 == 3 || num%10 == 7 || num%10 == 8) return false;
        int l = 1, r = num;
        while(l <= r){
            long mid = l + (r-l)/2;
            long sq = mid * mid;
            if(sq == num)
                return true;
            else if(sq > num)
                r = (int)(mid - 1);
            else 
                l = (int)(mid + 1);            
        }
        return false;
    }
}

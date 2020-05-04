class Solution {
    public int findComplement(int num) {
        int res = 0, i = 0;
        while(num!=0){
            int digit = num%2==1?0:1;
            res += digit*((int) Math.pow(2, i++));
            num /= 2;
        }
        return res;
    }
}

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k)
            return "0";
        int i = 0;
        while(k > 0){
            i = (i > 0) ? (i-1) : 0;
            while(i < num.length()-1 && num.charAt(i) <= num.charAt(i+1)  )
                i++;
            num = num.substring(0, i) + num.substring(i+1);
            k--;            
        }
        i = 0;
        while(i < num.length() && num.charAt(i) == '0')
            i++;
        if(i > 0)
            num = num.substring(i);
        return num.length() == 0 ? "0" : num;
    }
}

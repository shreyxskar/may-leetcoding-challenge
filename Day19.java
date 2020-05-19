class StockSpanner {
    Stack<int[]> stk;
    public StockSpanner() {
        stk = new Stack<>();
    }    
    public int next(int price) {   
        if(stk.isEmpty()){
            stk.push(new int[]{price, 1});
            return 1;
        }
        int val = 1;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
            val += stk.peek()[1];
            stk.pop();
        }
        stk.push(new int[]{price, val});
        return val;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

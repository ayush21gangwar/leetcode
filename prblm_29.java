class Solution {
    public int divide(int dividend, int divisor) {
        int x;
        if(dividend==divisor){
            return 1;
        }
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            x= Integer.MAX_VALUE;
            return x;
        }

        x=dividend/divisor;
        return x;
    }
}

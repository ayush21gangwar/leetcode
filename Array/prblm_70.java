class prblm_70 {
    public int climbStairs(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
         int first = 1;
        int second = 1;
        for(int i = 2; i <= n; ++i) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
            }
        }


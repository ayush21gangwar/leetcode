class prblm_7 {
    public int reverse(int x) {
        int rem;
        int reverse=0;
        while(x!=0){
            rem=x%10;
            if((reverse>(Integer.MAX_VALUE / 10))||(reverse<(Integer.MIN_VALUE / 10))) return 0;
            reverse=reverse*10+rem;
        x=x/10;
        }
        return reverse;
            }
         }
//if((ans>INT_MAX/10) || (ans<INT_MIN/10))
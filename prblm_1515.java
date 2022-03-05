class prblm_1515 {
    public int minOperations(int n) {
         if(n%2==1)
    {
        int a = (n-1)/2;
        return a*(a+1);
    }
    int a = n/2;
    return a*a;
        
    }
}
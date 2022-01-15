class prblm_1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr=new int[46];
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int a=i;
            int sum=0;
            while(a!=0)
            {
                sum+=a%10;
                a/=10;
            }
            arr[sum]++;
        }
        int max=0;
        for(int i=0;i<46;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
        
    }
}

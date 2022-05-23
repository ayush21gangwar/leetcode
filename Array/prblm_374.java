public class prblm_374 extends GuessGame {
    public int guessNumber(int n) {
        int start=1, end=n;
        while(start<=n)
        {
            int mid=start+(end-start)/2;
            int g=guess(mid);
            if(g==0)
            {
                return mid;
            }
            else if(g==1)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return 0;
    }
}
class prblm_1523 {
    public int countOdds(int low, int high) {
        if(high%2==0 && low%2==0)
        {
            return (high-low)/2;
        }
        return (high-low)/2 +1;
    }
        
    }

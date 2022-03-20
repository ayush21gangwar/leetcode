class prblm_1688 {
    public int numberOfMatches(int n) {
        if (n == 1) return 0;
		
		int res = n % 2 == 0 ? numberOfMatches(n / 2) + n / 2 : numberOfMatches((n - 1) / 2 + 1) + (n - 1) / 2;
		
        return res;
        
    }
}

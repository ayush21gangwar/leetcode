class prblm_1295 {
    public int findNumbers(int[] nums) {
          int digit = 1;
        int evenCount = 0;
            for (int i = 0; i < nums.length;) {
                while (nums[i] >= 10) {
                    nums[i] /= 10;
                digit++;
            }
            if (digit % 2 == 0) {
                evenCount++;
            }
            i++;
            digit = 1;
        }
        return evenCount;
        
    }
}

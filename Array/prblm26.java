class prblm26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int i = 0, p = 0;
        while (true) {
            if (i == nums.length || p == nums.length) return i + 1;
            while (nums[i] == nums[p]) if (++p == nums.length) return i + 1;
            if (++i != p) nums[i] = nums[p];
        }
    }
}


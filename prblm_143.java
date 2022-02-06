class prblm_143 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> greater = new ArrayList<>();
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int candy : candies) {
            greater.add(candy + extraCandies >= max);
        }
        return greater;
    }
}

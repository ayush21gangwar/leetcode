class prblm_12 {
    public String intToRoman(int num) {
        int[] a = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int idx = 0;
        while(num > 0) {
            if (a[idx] > num) {
                idx++;
            } else {
                num -= a[idx];
                roman.append(romans[idx]);
            }
        }
        return roman.toString();
    }
}